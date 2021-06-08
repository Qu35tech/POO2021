package desporto.futebol;

import desporto.Equipa;
import desporto.Partida;
import util.Pair;

import java.time.LocalDateTime;

public class PartidaFutebol extends Partida {

    String modeloTacticoCasa;
    String modeloTacticoFora;


    PartidaFutebol(EquipaFutebol equipaCasa, EquipaFutebol equipaFora, LocalDateTime data) {
        super();
        setEquipaCasa(equipaCasa.clone());
        setEquipaFora(equipaFora.clone());
        setData(data);
    }

}
