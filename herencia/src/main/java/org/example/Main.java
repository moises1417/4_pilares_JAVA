package org.example;

import org.example.Escuela.Estudiante;
import org.example.Escuela.Persona;
import org.example.Escuela.Profesor;
import org.example.vehiculos.Auto;
import org.example.vehiculos.Camion;
import org.example.vehiculos.Moto;
import org.example.vehiculos.Vehiculo;

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


//        ArrayList<Persona> personas = new ArrayList<>();
//
//        personas.add(new Estudiante("Jorge" , 17 , "4to"));
//        personas.add(new Profesor("Mateo" , 28 , "Programacion"));
//
//        for (Persona e : personas){
//            e.MostrarInfo();
//            System.out.println("----------");
//        }
//
//
//
  //---------------------------------------------------------------

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota" , "K5T10" , 2022 , 4));
        vehiculos.add(new Moto("Susuki" , "TT100" , 2015 , true));
        vehiculos.add(new Auto("Renault" , "P407Y" , 2000 , 2));
        vehiculos.add(new Camion("Mercedez" , "10ky9", 2024 , 299.5 ));

        for ( Vehiculo a : vehiculos){

            a.MostrarInfo();
            System.out.println("La antiguedad es de : " + a.CalcularAntiguedad(a.getAnio()) + " años") ;
            System.out.println("Es antiguo: " + a.esAntiguo(a.getAnio()));
            System.out.println("--------------------------------------");

        }


    }
};


 
