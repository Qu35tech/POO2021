package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolDefesa extends JogadorFutebol {

    //capacidade de cortar bolas
    private int corte;
    private int alivio;

    public JogadorFutebolDefesa(String nome, int idade) {
        super(nome, idade);
    }

    public JogadorFutebolDefesa(String nome, int idade, Equipa equipa) {
        super(nome, idade, equipa);
    }

    @Override
    void gerarHabilidades() {

    }
}
