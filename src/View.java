import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Float.MAX_EXPONENT;

public class View implements ViewI {


    public String lerLinha(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public int lerInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int tryLerInt(){
        int n;
        try {
            n = lerInt();
        } catch (InputMismatchException e) {
            erroIO();
            n = MAX_EXPONENT;
        }
        return n;
    }

    public LocalDateTime lerData(){
        Scanner sc = new Scanner(System.in);
        String data = sc.next() + "T00:00:00";
        return LocalDateTime.parse(data);
    }
    public void erroIO(){
        System.out.println("Valor mal inserido, tente outra vez");
    }
    //--------------------menu inicial----------------

    public int menuInicial(){
        int n;
        do {
            System.out.println("Novo Jogo - 1");
            System.out.println("Carregar Jogo - 2");
            System.out.println("Sair - 0");
            n = tryLerInt();
        } while (n < 0 || n > 2);
        return n;
    }

    public void criaJogadorView(){

        System.out.println("Indique nome, número e equipa do jogador que deseja criar");
        System.out.print("ENTER após cada item");
    }

    public void querStats(){
        System.out.println("Pretende definir as stats do jogador ou podem ser geradas aleatoriamente?");
        System.out.print("[1] para defini-las, [2] para serem geradas aleatoriamente");
    }

    public void definePosStats(){
        System.out.println("Indique a posição do jogador");
        System.out.print("[1] guarda-redes, [2] defesa, [3] médio,[4] avançado ,[5] lateral");
    }

    public void StatsRedes(){
        System.out.println("Indique os atributos do jogador pela ordem abaixo ilustrada dando ENTER após cada um");
        System.out.print(" velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,elasticidade");
    }
    public void StatsDefesa(){
        System.out.println("Indique os atributos do jogador pela ordem abaixo ilustrada dando ENTER após cada um");
        System.out.print("nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe, corte e alivio");
    }
    public void StatsAvancado(){
        System.out.println("Indique os atributos do jogador pela ordem abaixo ilustrada dando ENTER após cada um");
        System.out.print("nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate e passe");
    }
    public void StatsMedio(){
        System.out.println("Indique os atributos do jogador pela ordem abaixo ilustrada dando ENTER após cada um");
        System.out.print("nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe e recuperação");
    }
    public void StatsLateral(){System.out.println("Indique os atributos do jogador pela ordem abaixo ilustrada dando ENTER após cada um");
        System.out.print("nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe e cruzamento");}

    public void removeJogador(){
        System.out.println("Indique nome, número e equipa do jogador que deseja remover");
        System.out.print("ENTER após cada item");
    }

    public void removeTreinador(){
        System.out.println("Indique nome e equipa do treinador que deseja remover");
        System.out.print("ENTER após cada item");
    }

    public void addTreinador(){
        System.out.println("Indique nome e equipa do treinador que deseja adicionar");
        System.out.print("ENTER após cada item");
    }

    public void transferencia(){
        System.out.println("Indique o nome, equipa atual e equipa para a qual deseja transferir o jogador");
        System.out.print("ENTER após cada item");
    }

    public void consultaEquipa() throws NullPointerException {
        System.out.println("Indique o nome da equipa que pretende consultar");
    }

    public void consultaJogador(){
        System.out.println("Indique o nome e equipa do jogador que pretende consultar");
        System.out.print("ENTER após cada item");
    }

}
