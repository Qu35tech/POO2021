package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolDefesa extends JogadorFutebol {

    //capacidade de cortar bolas
    private int corte;
    private int alivio;

    public JogadorFutebolDefesa(String nome, int numero) {
        super(nome, numero);
    }

    public JogadorFutebolDefesa(String nome, int idade, String equipa) {
        super(nome, idade, equipa);
    }

    public JogadorFutebolDefesa(String nome, int numero, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe) {
        super(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);
    }

    public JogadorFutebolDefesa(JogadorFutebolDefesa j) {
        super(j);
    }

    public int getCorte() {
        return corte;
    }

    public void setCorte(int corte) {
        this.corte = corte;
    }

    public int getAlivio() {
        return alivio;
    }

    public void setAlivio(int alivio) {
        this.alivio = alivio;
    }

    public static JogadorFutebolDefesa parse(String input){
        String[] campos = input.split(",");
        return new JogadorFutebolDefesa(campos[0], Integer.parseInt(campos[1]),
                Integer.parseInt(campos[2]),
                Integer.parseInt(campos[3]),
                Integer.parseInt(campos[4]),
                Integer.parseInt(campos[5]),
                Integer.parseInt(campos[6]),
                Integer.parseInt(campos[7]),
                Integer.parseInt(campos[8]));
    }

    @Override
    protected JogadorFutebolDefesa clone() {
        return new JogadorFutebolDefesa(this);
    }
}
