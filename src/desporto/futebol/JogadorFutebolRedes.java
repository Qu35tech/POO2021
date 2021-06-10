package desporto.futebol;

import desporto.Equipa;

public class JogadorFutebolRedes extends JogadorFutebol {

    private int elasticidade;

    public JogadorFutebolRedes(String nome, int numero) {
        super(nome, numero);
    }

    public JogadorFutebolRedes(String nome, int idade, String equipa) {
        super(nome, idade, equipa);
    }

    public JogadorFutebolRedes(String nome, int numero, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe, int elasticidade) {
        super(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);
        this.elasticidade = elasticidade;
    }

    public JogadorFutebolRedes(JogadorFutebolRedes j) {
        super(j);
        this.elasticidade = j.getElasticidade();
    }

    public int getElasticidade() {
        return elasticidade;
    }

    public void setElasticidade(int elasticidade) {
        this.elasticidade = elasticidade;
    }

    public static JogadorFutebolRedes parse(String input){
        String[] campos = input.split(",");
        return new JogadorFutebolRedes(campos[0], Integer.parseInt(campos[1]),
                Integer.parseInt(campos[2]),
                Integer.parseInt(campos[3]),
                Integer.parseInt(campos[4]),
                Integer.parseInt(campos[5]),
                Integer.parseInt(campos[6]),
                Integer.parseInt(campos[7]),
                Integer.parseInt(campos[8]),
                Integer.parseInt(campos[9]));
    }

    //@Override
    /*public JogadorFutebolRedes clone() {
        return new JogadorFutebolRedes(this);
    }*/
}
