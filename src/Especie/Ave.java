package Especie;

import accionesAve.Cantante;
import accionesAve.Volador;

public class Ave implements Volador, Cantante {


    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }

    @Override
    public void cantar() {
        System.out.println("Estoy cantando");
    }

}
