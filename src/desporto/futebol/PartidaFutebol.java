package desporto.futebol;

import desporto.Equipa;
import desporto.Partida;
import util.Pair;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartidaFutebol extends Partida {

    String modeloTacticoCasa;
    String modeloTacticoFora;
    private List<Integer> jogadoresCasa;
    private List<Integer> jogadoresFora;
    private Map<Integer, Integer> substituicoesCasa = new HashMap<>();
    private Map<Integer, Integer> substitucoesFora = new HashMap<>();


    PartidaFutebol(LocalDate data, Pair<Integer, Integer> resultado, String equipaCasa, String equipaFora) {
        super(data, resultado, equipaCasa, equipaFora);
    }

    public PartidaFutebol(LocalDate data, Pair<Integer, Integer> resultado, String equipaCasa, String equipaFora, List<Integer> jogadoresCasa, List<Integer> jogadoresFora, Map<Integer, Integer> substituicoesCasa, Map<Integer, Integer> substitucoesFora) {
        super(data, resultado, equipaCasa, equipaFora);
        this.jogadoresCasa = new ArrayList<>(jogadoresCasa);
        this.jogadoresFora = new ArrayList<>(jogadoresFora);
        this.substituicoesCasa = new HashMap<>(substituicoesCasa);
        this.substitucoesFora = new HashMap<>(substitucoesFora);
    }

    public static PartidaFutebol parse(String input){
        String[] campos = input.split(",");
        String[] data = campos[4].split("-");
        List<Integer> jc = new ArrayList<>();
        List<Integer> jf = new ArrayList<>();
        Map<Integer, Integer> subsC = new HashMap<>();
        Map<Integer, Integer> subsF = new HashMap<>();
        for (int i = 5; i < 16; i++){
            jc.add(Integer.parseInt(campos[i]));
        }
        for (int i = 16; i < 19; i++){
            String[] sub = campos[i].split("->");
            subsC.put(Integer.parseInt(sub[0]), Integer.parseInt(sub[1]));
        }
        for (int i = 19; i < 30; i++){
            jf.add(Integer.parseInt(campos[i]));
        }
        for (int i = 30; i < 33; i++){
            String[] sub = campos[i].split("->");
            subsF.put(Integer.parseInt(sub[0]), Integer.parseInt(sub[1]));
        }
        return new PartidaFutebol(LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])),
                new Pair<>(Integer.parseInt(campos[2]), Integer.parseInt(campos[3])), campos[0], campos[1],
                jc, jf, subsC, subsF);
    };
}
