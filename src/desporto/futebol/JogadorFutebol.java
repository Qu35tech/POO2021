package desporto.futebol;

import desporto.Equipa;
import desporto.Jogador;

public abstract class JogadorFutebol extends Jogador {

    private int velocidade;
    private int resistencia;
    private int destreza;
    private int impulsao;
    private int cabeca;
    private int remate;
    private int passe;
    private int defesa;

    public JogadorFutebol(String nome, int idade) {
        super(nome, idade);
    }
    public JogadorFutebol(String nome, int idade, Equipa equipa) {
        super(nome, idade, equipa);
    }

    abstract void gerarHabilidades();

}
