package Especie;
import accionesPersona.Hablador;
import accionesPersona.Trabajador;

public class Persona_2 implements Hablador, Trabajador{

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando");
    }
}
