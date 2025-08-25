import abstraccionYherenciaEinterface.*;

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

        ArrayList<Coloreable> colores = new ArrayList<>();

        figuras.add(new Circulo("Circulo Galactico", "Rojo",15.5 ));
        figuras.add(new Rectangulo("Caja de la muerte ", "Azul", 15 , 7.5));
        dibujos.add(new Circulo("Circulo nova", "Violeta",7.8));
        dibujos.add(new Rectangulo("Caja Feliz " , "Verde",7 , 4));
        colores.add(new Circulo("Circulo nova", "Negro",7.8));
        colores.add(new Rectangulo("Caja Feliz " , "Amarillo",7 , 4));



        for (Figura f : figuras){
            f.mostrarNombre();
            f.calcularArea();


        }

        for (Dibujable d : dibujos){
            d.dibujar();

        }

        for (Coloreable c : colores){

        };


//-----------------------------------------------------------------------------


    }
}