package desporto.futebol;

import desporto.Desporto;
import desporto.Equipa;
import desporto.Jogador;
import util.LinhaIncorretaException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//principal agregador do desporto de futebol
public class Futebol extends Desporto implements FutebolI {

    //identificadores
    Map<Integer,JogadorFutebol> jogadores;
    Map<String,EquipaFutebol> equipas;
    Map<Integer,TreinadorFutebol> treinadores;
    List<PartidaFutebol> historico;

    public Futebol() {
        this.jogadores = new HashMap<>();
        this.equipas = new HashMap<>();
        this.treinadores = new HashMap<>();
        this.historico = new ArrayList<>();
    }

    public void addJogador(JogadorFutebol jogador) {
        this.jogadores.put(jogador.getNome().hashCode(),jogador);
    }

    public void addEquipa(EquipaFutebol equipa) {
        this.equipas.put(equipa.getNome(),equipa);
    }

    public void addTreinador(TreinadorFutebol treinador) {
        this.treinadores.put(treinador.getNome().hashCode(),treinador);
    }

    public void remJogador(JogadorFutebol jogador){
        this.jogadores.remove(jogador);
       // this.equipas.get(jogador.getEquipa()).getJogadores().remove(jogador.getNumero());
    }
    public void remEquipa(EquipaFutebol jogador){};
    public void remTreinador(TreinadorFutebol jogador){};

    public void addJogadorToEquipa(JogadorFutebol jogador, EquipaFutebol equipa, int num) {
        jogador.setEquipa(equipa.getNome());
        this.equipas.get(equipa.getNome()).addJogador(jogador,num);
    }

    public void transferencia(String nome,String equipaAtual, String equipaProx){
        Jogador jogador;
        jogador=this.equipas.get(equipaAtual).getJogador(nome.hashCode());

        jogador.addEquipaToHistorico(this.equipas.get(jogador.getEquipa()));
        this.equipas.get(jogador.getEquipa()).remJogador(jogador.getNumero());
        jogador.setEquipa(equipaProx);
        this.equipas.get(equipaProx).addJogador(jogador,jogador.getNumero());
    }

    public void parse() throws LinhaIncorretaException {
        List<String> linhas = lerFicheiro("C:\\Users\\rafxi\\OneDrive\\Ambiente de Trabalho\\POO2021\\src\\logs.txt");
        EquipaFutebol ultima = null;
        JogadorFutebol j = null;
        String[] linhaPartida;
        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch (linhaPartida[0]) {
                case "Equipa":
                    EquipaFutebol e = EquipaFutebol.parse(linhaPartida[1]);
                    this.equipas.put(e.getNome(), e);
                    ultima = e;
                    break;
                case "Guarda-Redes":
                    j = JogadorFutebolRedes.parse(linhaPartida[1]);
                    if (ultima == null)
                        throw new LinhaIncorretaException(); //we need to insert the player into the team
                    j.setEquipa(ultima.getNome());
                    this.jogadores.put(j.getNome().hashCode(), j);
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Defesa":
                    j = JogadorFutebolDefesa.parse(linhaPartida[1]);
                    if (ultima == null)
                        throw new LinhaIncorretaException(); //we need to insert the player into the team
                    j.setEquipa(ultima.getNome());
                    this.jogadores.put(j.getNome().hashCode(), j);
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Medio":
                    j = JogadorFutebolMedio.parse(linhaPartida[1]);
                    if (ultima == null)
                        throw new LinhaIncorretaException(); //we need to insert the player into the team
                    j.setEquipa(ultima.getNome());
                    this.jogadores.put(j.getNome().hashCode(), j);
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Lateral":
                    j = JogadorFutebolLateral.parse(linhaPartida[1]);
                    if (ultima == null)
                        throw new LinhaIncorretaException(); //we need to insert the player into the team
                    j.setEquipa(ultima.getNome());
                    this.jogadores.put(j.getNome().hashCode(), j);
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Avancado":
                    j = JogadorFutebolAvancado.parse(linhaPartida[1]);
                    if (ultima == null)
                        throw new LinhaIncorretaException(); //we need to insert the player into the team
                    j.setEquipa(ultima.getNome());
                    this.jogadores.put(j.getNome().hashCode(), j);
                    ultima.addJogador(j.clone(), j.getNumero()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Jogo":
                    PartidaFutebol jo = PartidaFutebol.parse(linhaPartida[1]);
                    this.historico.add(jo);
                    break;
                default:
                    throw new LinhaIncorretaException();

            }
        }
/*
        //debug
        for (EquipaFutebol e : this.equipas.values()) {
            System.out.println(e.toString());
        }
        for (PartidaFutebol jog : this.historico) {
            System.out.println(jog.toString());
        }

        System.out.println(this.jogadores.get("Vasco Mota Marques".hashCode()).toString());*/
    }

    public static List<String> lerFicheiro(String nomeFich) {
        List<String> lines;
        try { lines = Files.readAllLines(Paths.get(nomeFich), StandardCharsets.UTF_8); }
        catch(IOException exc) {
            System.out.println("Não foi possível abrir o ficheiro.");
            lines = new ArrayList<>(); }
        return lines;
    }

    public Map<Integer, JogadorFutebol> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Map<Integer, JogadorFutebol> jogadores) {
        this.jogadores = jogadores;
    }

    public Map<String, EquipaFutebol> getEquipas() {
        return equipas;
    }

    public void setEquipas(Map<String, EquipaFutebol> equipas) {
        this.equipas = equipas;
    }

    public Map<Integer, TreinadorFutebol> getTreinadores() {
        return treinadores;
    }

    public void setTreinadores(Map<Integer, TreinadorFutebol> treinadores) {
        this.treinadores = treinadores;
    }

    public List<PartidaFutebol> getHistorico() {
        return historico;
    }

    public void setHistorico(List<PartidaFutebol> historico) {
        this.historico = historico;
    }
}
