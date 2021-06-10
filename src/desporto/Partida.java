package desporto;

import util.Pair;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Partida {

    private LocalDate data;

    private Pair<Integer,Integer> resultado;

    private String equipaCasa;
    private String equipaFora;

    public Partida() {
        resultado = new Pair<>(0,0);
    }

    public Partida(LocalDate data, Pair<Integer, Integer> resultado, String equipaCasa, String equipaFora) {
        this.data = data;
        this.resultado = resultado;
        this.equipaCasa = equipaCasa;
        this.equipaFora = equipaFora;
    }

    void addScoreHome(int score) {
        this.resultado.first+=score;
    }
    void addScoreAway(int score) {
        this.resultado.second+=score;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEquipaCasa() {
        return equipaCasa;
    }

    public void setEquipaCasa(String equipaCasa) {
        this.equipaCasa = equipaCasa;
    }

    public String getEquipaFora() {
        return equipaFora;
    }

    public void setEquipaFora(String equipaFora) {
        this.equipaFora = equipaFora;
    }
}
