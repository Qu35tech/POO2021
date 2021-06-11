package desporto.futebol;

import desporto.Jogador;
import util.LinhaIncorretaException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface FutebolI {
    void addJogador(JogadorFutebol jogador);
    void addEquipa(EquipaFutebol equipa);
    void addTreinador(TreinadorFutebol treinador);

     void remJogador(JogadorFutebol jogador);
     void remEquipa(EquipaFutebol jogador);
     void remTreinador(TreinadorFutebol jogador);

     void addJogadorToEquipa(JogadorFutebol jogador, EquipaFutebol equipa, int num);

     void transferencia(String nome,String equipaAtual, String equipaProx);

     void parse() throws LinhaIncorretaException;

      //List<String> lerFicheiro(String nomeFich) ;

     Map<Integer, JogadorFutebol> getJogadores();

     void setJogadores(Map<Integer, JogadorFutebol> jogadores);

     Map<String, EquipaFutebol> getEquipas();

     void setEquipas(Map<String, EquipaFutebol> equipas);

     Map<Integer, TreinadorFutebol> getTreinadores();

     void setTreinadores(Map<Integer, TreinadorFutebol> treinadores);

     List<PartidaFutebol> getHistorico();

     void setHistorico(List<PartidaFutebol> historico);


}
