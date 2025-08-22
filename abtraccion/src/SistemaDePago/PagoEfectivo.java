package SistemaDePago;

public class PagoEfectivo extends Pago{

    String moneda;

    public PagoEfectivo(String moneda) {

    }

    public PagoEfectivo(double monto, String fecha, String moneda) {
        super(monto, fecha);
        this.moneda = moneda;
    }


    @Override
    public void procesarPago() {
        System.out.println("Pago efectivo de " + getMonto());
    }
}
