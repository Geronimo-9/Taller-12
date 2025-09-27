package Especie;

import accionesAve.Volador_2;
import accionesPez.Nadador;

public class Animal implements Volador_2 ,Nadador{

    @Override
    public void volar() {
        System.out.println( "Este animal está volando");
    }

    @Override
    public void nadar() {
        System.out.println("Este animal está nadando");
    }
}
