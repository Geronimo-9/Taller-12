import Especie.Ave;
import Especie.Pez;
import accionesPez.Nadador;
import accionesPez.Respirador;



public class Main {
    public static void main(String[] args) {



// Ejercicio 1 Clase Especie.Ave impementando las interfaces accionesAve.Volador y accionesAve.Cantante
Ave loro = new Ave();

loro.volar();
loro.cantar();



// Ejercicio 2 Clase Especie.Pez impementando las interfaces accionesAve.Nadador y accionesAve.Respirador
Pez nemo = new Pez();

nemo.respirar();
nemo.nadar();

//Ejercicio 3, mal uso de interfaz y no implementacion de los metodos de la interfaz

        // 1. Entrar a Persona
        // 2. Entrar a la interfaaz Movimientos


    loro.ladrar(); //Implementacion fuera del contexto de las aves



    }
}