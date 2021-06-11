package desporto;

import java.util.List;

public abstract class Jogador {

    private final String nome;
    private int numero;
    private String equipa;
    private List<Equipa> historico;

    public List<Equipa> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Equipa> historico) {
        this.historico = historico;
    }

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.equipa = null;
    }

    public Jogador(String nome, int idade, String equipa) {
        this(nome,idade);
        this.equipa = equipa;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipa() {
        return equipa;
    }

    public void setEquipa(String equipa) {
        this.equipa = equipa;
    }

    public void addEquipaToHistorico (Equipa team){
        this.historico.add(team);
    }
}
