package org.example.vehiculos;

public class Camion extends Vehiculo{

    double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Marca: " + getMarca() + " Modelo :" + getModelo() + " Año: " + getAnio() + " Capacidad de Carga: " + this.capacidadCarga);
    }

    @Override
    public boolean esAntiguo(int anio) {

        int antiguedad = 2025 - anio;

        if(antiguedad > 15 ){

            return true;
        }else {

            return false;
        }

    }

}
