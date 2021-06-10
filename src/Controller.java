import desporto.futebol.*;
;

public class Controller {
    View view;
   


    public void criaJogador(){
        String nome, equipa;
        int numero,option,pos,velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,elasticidade;
        int corte, alívio,recuperacao,cruzamento;

        view.criaJogadorView();
        nome=view.lerLinha();
        numero=view.tryLerInt();
        equipa=view.lerLinha();

        view.definePosStats();
        pos=view.lerInt();

        view.querStats();
        option=view.lerInt();

        switch (option){
            case 1:
                switch (pos){
                    case 1:
                        view.StatsRedes();
                        velocidade= view.lerInt();
                        resistencia=view.lerInt();
                        destreza=view.lerInt();
                        impulsao=view.lerInt();
                        cabeca=view.lerInt();
                        remate=view.lerInt();
                        passe=view.lerInt();
                        elasticidade=view.lerInt();
                        JogadorFutebolRedes redes = new JogadorFutebolRedes(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,elasticidade);
                    case 2:
                        view.StatsDefesa();
                        velocidade= view.lerInt();
                        resistencia=view.lerInt();
                        destreza=view.lerInt();
                        impulsao=view.lerInt();
                        cabeca=view.lerInt();
                        remate=view.lerInt();
                        passe=view.lerInt();
                        corte=view.lerInt();
                        alívio=view.lerInt();
                        JogadorFutebolDefesa defesa = new JogadorFutebolDefesa(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,corte,alívio);
                    case 3:
                        view.StatsMedio();
                        velocidade= view.lerInt();
                        resistencia=view.lerInt();
                        destreza=view.lerInt();
                        impulsao=view.lerInt();
                        cabeca=view.lerInt();
                        remate=view.lerInt();
                        passe=view.lerInt();
                        recuperacao=view.lerInt();
                        JogadorFutebolMedio medio = new JogadorFutebolMedio(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,recuperacao);
                    case 4:
                        view.StatsAvancado();
                        velocidade= view.lerInt();
                        resistencia=view.lerInt();
                        destreza=view.lerInt();
                        impulsao=view.lerInt();
                        cabeca=view.lerInt();
                        remate=view.lerInt();
                        passe=view.lerInt();
                        JogadorFutebolAvancado avancado = new JogadorFutebolAvancado(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);
                    case 5:
                        view.StatsLateral();
                        velocidade= view.lerInt();
                        resistencia=view.lerInt();
                        destreza=view.lerInt();
                        impulsao=view.lerInt();
                        cabeca=view.lerInt();
                        remate=view.lerInt();
                        passe=view.lerInt();
                        cruzamento=view.lerInt();
                        JogadorFutebolLateral lateral = new JogadorFutebolLateral(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,cruzamento);
                }
            case 2:
                switch (pos){
                    case 1:
                        ///gera rand redes....
                }
        }

    }


}
