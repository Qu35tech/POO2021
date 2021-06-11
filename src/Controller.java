import desporto.Equipa;
import desporto.Jogador;
import desporto.futebol.*;
;

public class Controller implements ControllerI {
    ViewI view;
    FutebolI futebol;


    public void criaJogador(){
        String nome, equipa;
        int numero,option,pos,velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,elasticidade;
        int corte, alivio,recuperacao,cruzamento;

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
                        velocidade= view.tryLerInt();
                        resistencia=view.lerInt();
                        destreza=view.lerInt();
                        impulsao=view.lerInt();
                        cabeca=view.lerInt();
                        remate=view.lerInt();
                        passe=view.lerInt();
                        elasticidade=view.lerInt();
                        JogadorFutebolRedes redes = new JogadorFutebolRedes(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,elasticidade);
                        futebol.addJogador(redes);
                        futebol.getEquipas().get(equipa).addJogador(redes,numero);
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
                        alivio=view.lerInt();
                        JogadorFutebolDefesa defesa = new JogadorFutebolDefesa(nome, numero, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe,corte,alivio);
                        futebol.addJogador(defesa);
                        futebol.getEquipas().get(equipa).addJogador(defesa,numero);
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
                        futebol.addJogador(medio);
                        futebol.getEquipas().get(equipa).addJogador(medio,numero);
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
                        futebol.addJogador(avancado);
                        futebol.getEquipas().get(equipa).addJogador(avancado,numero);
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
                        futebol.addJogador(lateral);
                        futebol.getEquipas().get(equipa).addJogador(lateral,numero);
                }
            case 2:
                switch (pos){
                    case 1:
                        ///gera rand redes....
                }
        }

    }

    public void removeJogador(){
        String nome, equipa;
        int numero;
        view.removeJogador();
        nome=view.lerLinha();
        numero= view.tryLerInt();
        equipa=view.lerLinha();

        JogadorFutebol jogador = new JogadorFutebol(nome,numero,equipa);
        futebol.remJogador(jogador);
    }

    public void transferJogador(){
        String nome, equipa, proxEquipa;

        view.transferencia();
        nome=view.lerLinha();
        equipa=view.lerLinha();
        proxEquipa=view.lerLinha();

        futebol.transferencia(nome,equipa,proxEquipa);

    }

    public void adicionaTreinador(){
        String nome, equipa;

        view.addTreinador();
        nome=view.lerLinha();
        equipa=view.lerLinha();

        TreinadorFutebol mister = new TreinadorFutebol(nome);
        futebol.getEquipas().get(equipa).setTreinador(mister);
    }

    public void removeTreinador(){
        String nome, equipa;

        view.removeTreinador();
        nome=view.lerLinha();
        equipa=view.lerLinha();

        EquipaFutebol team = new EquipaFutebol(equipa);
        TreinadorFutebol mister = new TreinadorFutebol(nome,team);
        futebol.remTreinador(mister);
    }

    public void consultaEquipa(){
        String equipa;
        view.consultaEquipa();
        equipa=view.lerLinha();
        futebol.getEquipas().get(equipa).print();
    }

    public void consultaJogador(){
        String nome,equipa;
        view.consultaJogador();
        nome=view.lerLinha();
        equipa=view.lerLinha();
        futebol.getJogadores().get(nome.hashCode()).toString();
        //outra maneira existe
    }





}
