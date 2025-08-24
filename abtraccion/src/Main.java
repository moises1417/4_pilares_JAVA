import SistemaDePago.Pago;
import SistemaDePago.PagoEfectivo;
import SistemaDePago.PagoTarjeta;
import abstraccionYherencia.Circulo;
import abstraccionYherencia.Figura;
import abstraccionYherencia.Rectangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Pago> listaDePago = new ArrayList<>();
//
//        listaDePago.add(new PagoTarjeta(2000.23 , "20-03-2021", "Banco Sol" ," MME1029"));
//        listaDePago.add(new PagoEfectivo(1000, "03-10-2002", "USD" ));
//
//          for(Pago p : listaDePago){
//
//            p.procesarPago();
//            p.mostrarInfo();
 //   }
//  ------------------------------------------------------------

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo("Circulo Galactico", 15.5));
        figuras.add(new Rectangulo("Caja de la muerte " , 15 , 7.5));

        for (Figura f : figuras){

        }




    }
}