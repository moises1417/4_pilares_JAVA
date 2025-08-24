import abstraccionYherenciaEinterface.Circulo;
import abstraccionYherenciaEinterface.Dibujable;
import abstraccionYherenciaEinterface.Figura;
import abstraccionYherenciaEinterface.Rectangulo;

import java.util.ArrayList;

public class compilador {
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

        ArrayList<Dibujable> dibujos = new ArrayList<>();

        figuras.add(new Circulo("Circulo Galactico", 15.5));
        figuras.add(new Rectangulo("Caja de la muerte " , 15 , 7.5));
        dibujos.add(new Circulo("Circulo nova", 7.8));
        dibujos.add(new Rectangulo("Caja Feliz " , 7 , 4));

        for (Figura f : figuras){
            f.mostrarNombre();
            f.calcularArea();
        }

        for (Dibujable d : dibujos){
            d.dibujar();

        }


//-----------------------------------------------------------------------------


    }
}