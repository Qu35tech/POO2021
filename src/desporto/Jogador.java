package desporto;

public abstract class Jogador {

    private final String nome;
    private int idade;
    private Equipa equipa;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.equipa = null;
    }

    public Jogador(String nome, int idade, Equipa equipa) {
        this(nome,idade);
        this.equipa = equipa;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Equipa getEquipa() {
        return equipa;
    }

    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }
}
