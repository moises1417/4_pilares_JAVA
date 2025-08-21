package org.example;

import org.example.Escuela.Estudiante;
import org.example.Escuela.Persona;
import org.example.Escuela.Profesor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Animal[] animales = {
//
//                new Gato("felipe"),
//                new perro("pasita"),
//                new Gato("Leon"),
//                new perro("Tomi")
//        };
//
//        for(Animal e  : animales){ //el objeto animal va a recorrer para encontrar los objetos dentros del array,
//                                   // una vez encontrado va activar el metodo de cada objeto creado
//            e.hacerSonido();
//        }
//-------------------------------------------------------


        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Estudiante("Jorge" , 17 , "4to"));
        personas.add(new Profesor("Mateo" , 28 , "Programacion"));

        for (Persona e : personas){
            e.MostrarInfo();
            System.out.println("----------");
        }


    }

};



