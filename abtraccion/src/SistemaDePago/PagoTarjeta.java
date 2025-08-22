package SistemaDePago;

public class PagoTarjeta extends Pago implements Reembolsable {

    String numeroTarjeta;
    String banco;

    public PagoTarjeta(double monto, String fecha, String banco, String numeroTarjeta) {
        super(monto, fecha);
        this.banco = banco;
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void procesarPago(){
        System.out.println("Pago con tarjeta " + getNumeroTarjeta() + " del banco : " + getBanco());
    }

    @Override
    public void realizarReembolso(double monto) {
        System.out.println("Reembolso de "+ getMonto() + " a la tarjeta " + getNumeroTarjeta());
    }
}
