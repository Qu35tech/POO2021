package desporto;

import desporto.futebol.JogadorFutebol;

import java.util.HashMap;
import java.util.Map;

public abstract class Equipa {

    private String nome;
    private String diminutivo;

    //número -> jogador
    private Map<Integer, Jogador> jogadores;

    public Equipa(String nome) {
        this.nome = nome;
        this.jogadores = new HashMap<>();
    }

    public Equipa(String nome, String diminutivo) {
        this.nome = nome;
        this.diminutivo = diminutivo;
        this.jogadores = new HashMap<>();
    }

    public Equipa(String nome, String diminutivo, Map<Integer, Jogador> jogadores) {
        this(nome,diminutivo);
        this.jogadores = new HashMap<>(jogadores);
    }

    public void addJogador(Jogador jogador, int num) {
        this.jogadores.put(num,jogador);
    }

    public void remJogador(int num) {
        this.jogadores.get(num).setEquipa(null);
        this.jogadores.remove(num);
    }

    public Jogador getJogador(int num) {
        return this.jogadores.get(num);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiminutivo() {
        return diminutivo;
    }

    public void setDiminutivo(String diminutivo) {
        this.diminutivo = diminutivo;
    }

    public Map<Integer, Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Map<Integer, Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.getNome()+"\n");
        for(Jogador j : jogadores.values()) {
            s.append(j.toString() + "\n");
        }
        return s.toString();
    }
}
