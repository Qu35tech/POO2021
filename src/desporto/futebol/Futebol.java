package desporto.futebol;

import desporto.Desporto;

import java.util.List;
import java.util.Map;

//principal agregador do desporto de futebol
public class Futebol extends Desporto {

    //identificadores
    Map<Integer,JogadorFutebol> jogadores;
    Map<Integer,EquipaFutebol> equipas;
    Map<Integer,TreinadorFutebol> treinadores;

    List<PartidaFutebol> historico;

    public void addJogador(JogadorFutebol jogador) {
        this.jogadores.put(jogador.getNome().hashCode(),jogador);
    }

    public void addEquipa(EquipaFutebol equipa) {
        this.equipas.put(equipa.getNome().hashCode(),equipa);
    }

    public void addTreinador(TreinadorFutebol treinador) {
        this.treinadores.put(treinador.getNome().hashCode(),treinador);
    }

    public void remJogador(JogadorFutebol jogador){};
    public void remEquipa(EquipaFutebol jogador){};
    public void remTreinador(TreinadorFutebol jogador){};

    public void addJogadorToEquipa(JogadorFutebol jogador, EquipaFutebol equipa, int num) {
        jogador.setEquipa(equipa);
        this.equipas.get(equipa.getNome().hashCode()).addJogador(jogador,num);
    }


}
