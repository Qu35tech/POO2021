package desporto.futebol;

import desporto.Equipa;
import desporto.Jogador;

public class JogadorFutebol extends Jogador {

    private int velocidade;
    private int resistencia;
    private int destreza;
    private int impulsao;
    private int cabeca;
    private int remate;
    private int passe;

    public JogadorFutebol(String nome, int numero) {
        super(nome, numero);
    }

    public JogadorFutebol(String nome, int numero, String equipa) {
        super(nome, numero, equipa);
    }

    public JogadorFutebol(String nome, int numero, String equipa, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe) {
        super(nome, numero, equipa);
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.destreza = destreza;
        this.impulsao = impulsao;
        this.cabeca = cabeca;
        this.remate = remate;
        this.passe = passe;
    }

    public JogadorFutebol(String nome, int numero, int velocidade, int resistencia, int destreza, int impulsao, int cabeca, int remate, int passe) {
        super(nome, numero);
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.destreza = destreza;
        this.impulsao = impulsao;
        this.cabeca = cabeca;
        this.remate = remate;
        this.passe = passe;
    }

    public JogadorFutebol(JogadorFutebol j) {
        super(j.getNome(), j.getNumero(), j.getEquipa());
        this.velocidade = j.getVelocidade();
        this.resistencia = j.getResistencia();
        this.destreza = j.getDestreza();
        this.impulsao = j.getImpulsao();
        this.cabeca = j.getCabeca();
        this.remate = j.getRemate();
        this.passe = j.getPasse();
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getImpulsao() {
        return impulsao;
    }

    public void setImpulsao(int impulsao) {
        this.impulsao = impulsao;
    }

    public int getCabeca() {
        return cabeca;
    }

    public void setCabeca(int cabeca) {
        this.cabeca = cabeca;
    }

    public int getRemate() {
        return remate;
    }

    public void setRemate(int remate) {
        this.remate = remate;
    }

    public int getPasse() {
        return passe;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    @Override
    public JogadorFutebol clone() {
        return new JogadorFutebol(this);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.getNome() + " >> " + this.getEquipa());
        return s.toString();
    }
}
