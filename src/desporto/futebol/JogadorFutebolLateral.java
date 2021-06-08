package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolLateral extends JogadorFutebol {

    private int cruzamento;

    public JogadorFutebolLateral(String nome, int idade) {
        super(nome, idade);
    }

    public JogadorFutebolLateral(String nome, int idade, Equipa equipa) {
        super(nome, idade, equipa);
    }

    @Override
    void gerarHabilidades() {

    }
}
