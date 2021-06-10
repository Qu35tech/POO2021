package desporto;

public abstract class Jogador {

    private final String nome;
    private int numero;
    private String equipa;

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
}
