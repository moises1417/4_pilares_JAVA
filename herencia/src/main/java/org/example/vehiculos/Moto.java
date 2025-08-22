package org.example.vehiculos;

public class Moto extends Vehiculo {

    boolean tienesSidecar;

    public Moto(String marca, String modelo, int anio, boolean tienesSidecar) {
        super(marca, modelo, anio);
        this.tienesSidecar = tienesSidecar;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Marca: " + getMarca() + " Modelo :" + getModelo() + " Año: " + getAnio() + " Sidecar" + this.tienesSidecar) ;
    }

    @Override
    public boolean esAntiguo(int anio) {

        int antiguedad = 2025 - anio;

        if(antiguedad > 5 ){

            return true;
        }else {

            return false;
        }

    }
}
