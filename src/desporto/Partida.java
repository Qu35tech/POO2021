package desporto;

import util.Pair;

import java.time.LocalDateTime;

public abstract class Partida {

    private LocalDateTime data;

    private Pair<Integer,Integer> resultado;

    private Equipa equipaCasa;
    private Equipa equipaFora;

    public Partida() {
        resultado = new Pair<>(0,0);
    }

    void addScoreHome(int score) {
        this.resultado.first+=score;
    }
    void addScoreAway(int score) {
        this.resultado.second+=score;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Equipa getEquipaCasa() {
        return equipaCasa;
    }

    public void setEquipaCasa(Equipa equipaCasa) {
        this.equipaCasa = equipaCasa;
    }

    public Equipa getEquipaFora() {
        return equipaFora;
    }

    public void setEquipaFora(Equipa equipaFora) {
        this.equipaFora = equipaFora;
    }
}
