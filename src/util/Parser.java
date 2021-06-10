package util;

import desporto.futebol.*;
import util.LinhaIncorretaException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {

    public static void parse() throws LinhaIncorretaException {
        List<String> linhas = lerFicheiro("output.txt");
        Map<String, EquipaFutebol> equipas = new HashMap<>(); //nome, equipa
        Map<Integer, JogadorFutebol> jogadores = new HashMap<>(); //numero, jogador
        List<PartidaFutebol> jogos = new ArrayList<>();
        EquipaFutebol ultima = null; JogadorFutebol j = null;
        String[] linhaPartida;
        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Equipa":
                    EquipaFutebol e = EquipaFutebol.parse(linhaPartida[1]);
                    equipas.put(e.getNome(), e);
                    ultima = e;
                    break;
                case "Guarda-Redes":
                    j = JogadorFutebolRedes.parse(linhaPartida[1]);
                    jogadores.put(j.getNumero(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Defesa":
                    j = JogadorFutebolDefesa.parse(linhaPartida[1]);
                    jogadores.put(j.getNumero(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Medio":
                    j = JogadorFutebolMedio.parse(linhaPartida[1]);
                    jogadores.put(j.getNumero(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Lateral":
                    j = JogadorFutebolLateral.parse(linhaPartida[1]);
                    jogadores.put(j.getNumero(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Avancado":
                    j = JogadorFutebolAvancado.parse(linhaPartida[1]);
                    jogadores.put(j.getNumero(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Jogo":
                    PartidaFutebol jo = PartidaFutebol.parse(linhaPartida[1]);
                    jogos.add(jo);
                    break;
                default:
                    throw new LinhaIncorretaException();

            }
        }

        //debug
        for (EquipaFutebol e: equipas.values()){
            System.out.println(e.toString());
        }
        for (PartidaFutebol jog: jogos){
            System.out.println(jog.toString());
        }


    }

    public static List<String> lerFicheiro(String nomeFich) {
        List<String> lines;
        try { lines = Files.readAllLines(Paths.get(nomeFich), StandardCharsets.UTF_8); }
        catch(IOException exc) { lines = new ArrayList<>(); }
        return lines;
    }


}
