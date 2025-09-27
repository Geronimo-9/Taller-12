import Especie.Animal;
import Especie.Ave;
import Especie.Persona_2;
import Especie.Pez;



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

        // 1. Entrar a Especie Persona
        // 2. Entrar a la interfaaz Movimientos


    loro.ladrar(); //Implementacion fuera del contexto de las aves





        //Ejercicio 1 parte 2, Clase persona (Persona_2) con las interfaces trabajador y hablador.


        Persona_2 geronimo = new Persona_2();

        geronimo.hablar();
        geronimo.trabajar();

// Ejercicio 2 parte 2, Clase animal con las interfaces volador y nadador (Se usarán las interfaces ya creadas)

        Animal pato = new Animal();
        pato.nadar();
        pato.volar();


        //Ejercicio 3 parte 2, mal  uso de interfaz y no implementacion de los metodos de la interfaz

        // 1. Entrar a Especie Persona (Acá se explica nuevamente el ejercicio)
        // 2. Entrar a la interfaaz Movimientos (Acá se explica nuevamente el ejercicio)




    }
}