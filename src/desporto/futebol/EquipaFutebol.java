package desporto.futebol;

import desporto.Equipa;
import desporto.Jogador;

import java.util.Map;

public class EquipaFutebol extends Equipa {


    private TreinadorFutebol treinador;

    public EquipaFutebol(String nome) {
        super(nome);
    }

    public EquipaFutebol(String nome, String diminutivo, Map<Integer, Jogador> jogadores) {
        super(nome, diminutivo, jogadores);
    }

    public EquipaFutebol(String nome, String diminutivo, Map<Integer, Jogador> jogadores
            , TreinadorFutebol treinador) {
        super(nome, diminutivo, jogadores);
        this.treinador = treinador;
    }

    public EquipaFutebol(EquipaFutebol outra) {
        super(outra.getNome(),outra.getDiminutivo(),outra.getJogadores());
        this.treinador = outra.getTreinador();
    }


    public TreinadorFutebol getTreinador() {
        return treinador;
    }

    public void setTreinador(TreinadorFutebol treinador) {
        this.treinador = treinador;
    }

    public static EquipaFutebol parse(String input){
        String[] campos = input.split(",");
        return new EquipaFutebol(campos[0]);
    }

    public EquipaFutebol clone() {
        return new EquipaFutebol(this);
    }

}
