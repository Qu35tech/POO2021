package desporto.futebol;


public class TreinadorFutebol {

    private final String nome;
    private EquipaFutebol equipa;

    //qualidades de um treinador
    private int comando;
    private int treino;
    private int motivacao;

    TreinadorFutebol(String nome) {
        this.nome = nome;
        this.equipa = null;
    }

    TreinadorFutebol(String nome, EquipaFutebol equipa) {
        this.nome = nome;
        this.equipa = equipa;
    }

    public String getNome() {
        return nome;
    }

    public EquipaFutebol getEquipa() {
        return equipa;
    }

    public void setEquipa(EquipaFutebol equipa) {
        this.equipa = equipa;
    }

    public int getComando() {
        return comando;
    }

    public void setComando(int comando) {
        this.comando = comando;
    }

    public int getTreino() {
        return treino;
    }

    public void setTreino(int treino) {
        this.treino = treino;
    }

    public int getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(int motivacao) {
        this.motivacao = motivacao;
    }
}
