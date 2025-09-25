package Especie;

import accionesPez.Respirador;
import accionesPez.Nadador;

public class Pez implements Respirador,Nadador {

    @Override
    public void nadar() {
        System.out.println("Mueve sus aletas");
    }

    @Override
    public void respirar() {
        System.out.println("Estoy respirando");
    }
}
