package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolMedio extends JogadorFutebol {

    private int recuperacao;

    public JogadorFutebolMedio(String nome, int numero) {
        super(nome, numero);
    }

    public JogadorFutebolMedio(String nome, int idade, String equipa) {
        super(nome, idade, equipa);
    }

    public JogadorFutebolMedio(String nome, int numero, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe, int recuperacao) {
        super(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);
        this.recuperacao = recuperacao;
    }

    public JogadorFutebolMedio(JogadorFutebolMedio j) {
        super(j);
        this.recuperacao = j.getRecuperacao();
    }

    public int getRecuperacao() {
        return recuperacao;
    }

    public void setRecuperacao(int recuperacao) {
        this.recuperacao = recuperacao;
    }

    public static JogadorFutebolMedio parse(String input){
        String[] campos = input.split(",");
        return new JogadorFutebolMedio(campos[0], Integer.parseInt(campos[1]),
                Integer.parseInt(campos[2]),
                Integer.parseInt(campos[3]),
                Integer.parseInt(campos[4]),
                Integer.parseInt(campos[5]),
                Integer.parseInt(campos[6]),
                Integer.parseInt(campos[7]),
                Integer.parseInt(campos[8]),
                Integer.parseInt(campos[9]));
    }

    /*@Override
    protected JogadorFutebolMedio clone() {
        return new JogadorFutebolMedio(this);
    }*/
}
