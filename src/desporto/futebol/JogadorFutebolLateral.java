package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolLateral extends JogadorFutebol {

    private int cruzamento;

    public JogadorFutebolLateral(String nome, int numero) {
        super(nome, numero);
    }

    public JogadorFutebolLateral(String nome, int idade, String equipa) {
        super(nome, idade, equipa);
    }

    public JogadorFutebolLateral(String nome, int numero, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe, int cruzamento) {
        super(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);
        this.cruzamento = cruzamento;
    }

    public JogadorFutebolLateral(JogadorFutebolLateral j) {
        super(j);
        this.cruzamento = j.getCruzamento();
    }

    public int getCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(int cruzamento) {
        this.cruzamento = cruzamento;
    }

    public static JogadorFutebolLateral parse(String input){
        String[] campos = input.split(",");
        return new JogadorFutebolLateral(campos[0], Integer.parseInt(campos[1]),
                Integer.parseInt(campos[2]),
                Integer.parseInt(campos[3]),
                Integer.parseInt(campos[4]),
                Integer.parseInt(campos[5]),
                Integer.parseInt(campos[6]),
                Integer.parseInt(campos[7]),
                Integer.parseInt(campos[8]),
                Integer.parseInt(campos[9]));
    }

    @Override
    protected JogadorFutebolLateral clone() {
        return new JogadorFutebolLateral(this);
    }
}
