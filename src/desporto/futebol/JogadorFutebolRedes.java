package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolRedes extends JogadorFutebol {

    private int elasticidade;

    public JogadorFutebolRedes(String nome, int idade) {
        super(nome, idade);
    }

    public JogadorFutebolRedes(String nome, int idade, Equipa equipa) {
        super(nome, idade, equipa);
    }

    @Override
    void gerarHabilidades() {

    }
}
