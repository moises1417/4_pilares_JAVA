package SistemaDePago;

public abstract class Pago {

    double monto;
    String fecha;

    public Pago(){}
    public Pago(double monto, String fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void mostrarInfo(){
        System.out.println("Monto: " + getMonto() + " Fecha: " + getFecha()) ;
    }

    public void procesarPago(){};
}
