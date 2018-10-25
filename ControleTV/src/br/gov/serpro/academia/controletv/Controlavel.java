package br.gov.serpro.academia.controletv;

/**
 * Created by 11315867869 on 25/10/18.
 */
public interface Controlavel {

    public boolean ligarDesligar();

    public static boolean aumentarVolume(){
        return true;
    }

    public static boolean diminuirVolume(){
        return true;
    }

}
