package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolAvancado extends JogadorFutebol {

    public JogadorFutebolAvancado(String nome, int idade) {
        super(nome, idade);
    }

    public JogadorFutebolAvancado(String nome, int idade, Equipa equipa) {
        super(nome, idade, equipa);
    }

    @Override
    void gerarHabilidades() {

    }

}
