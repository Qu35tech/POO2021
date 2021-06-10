package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolAvancado extends JogadorFutebol {

    public JogadorFutebolAvancado(String nome, int numero) {
        super(nome, numero);
    }

    public JogadorFutebolAvancado(String nome, int numero, String equipa) {
        super(nome, numero, equipa);
    }

    public JogadorFutebolAvancado(String nome, int numero, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe) {
        super(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);
    }

    public JogadorFutebolAvancado(JogadorFutebolAvancado j) {
        super(j);
    }

    public static JogadorFutebolAvancado parse(String input){
        String[] campos = input.split(",");
        return new JogadorFutebolAvancado(campos[0], Integer.parseInt(campos[1]),
                Integer.parseInt(campos[2]),
                Integer.parseInt(campos[3]),
                Integer.parseInt(campos[4]),
                Integer.parseInt(campos[5]),
                Integer.parseInt(campos[6]),
                Integer.parseInt(campos[7]),
                Integer.parseInt(campos[8]));
    }

    /*@Override
    protected JogadorFutebolAvancado clone() {
        return new JogadorFutebolAvancado(this);
    }*/

}
