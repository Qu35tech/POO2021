package util;

import java.util.Random;

public class Util {

    static String getNameShortVersion(String nome) {
        return null;
    }

    static int randomNormal(int media, int desvio) {
        Random gerador = new Random();

        int rand = gerador.nextInt((desvio - (-desvio)) + 1) - desvio;
        return desvio+rand;

    }


}
