package org.example.vehiculos;

public class Vehiculo {

    String marca;
    String modelo;
    int anio;


    public  Vehiculo(){};
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void MostrarInfo(){
        System.out.println("datos del vehiculo");
    }

    public int CalcularAntiguedad(int anio){
        return 2025 - anio;
    }

    public boolean esAntiguo(int anio){

        int antiguedad = 2025 - anio;

        if(antiguedad > 10 ){

            return true;
        }else {

            return false;
        }

    }
}
