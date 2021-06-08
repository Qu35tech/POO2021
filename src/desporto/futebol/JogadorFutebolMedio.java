package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolMedio extends JogadorFutebol {

    private int recuperacao;

    public JogadorFutebolMedio(String nome, int idade) {
        super(nome, idade);
    }

    public JogadorFutebolMedio(String nome, int idade, Equipa equipa) {
        super(nome, idade, equipa);
    }

    @Override
    void gerarHabilidades() {

    }
}
