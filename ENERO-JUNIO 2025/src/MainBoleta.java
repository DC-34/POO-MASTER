public class MainBoleta {
    public static void main(String [] args) {

    Boleta b1=new Boleta();
    b1.nombre="Diego";
    b1.control= 24020356;
    b1.poo= 9;
    b1.calculo_integral= 8.5;
    b1.algebra_lineal= 9.5;
    b1.cont_finan= 9;
    b1.prob_y_estadistica= 8;
    b1.quimica= 10;

    System.out.println(b1.obtenerDatos());

    Boleta b2=new Boleta();
    b2.nombre="Antonio";
    b2.control= 24020357;
    b2.poo= 10;
    b2.calculo_integral= 8;
    b2.algebra_lineal= 9;
    b2.cont_finan= 10;
    b2.prob_y_estadistica= 8;
    b2.quimica= 9;

    System.out.println(b2.obtenerDatos());

    Boleta b3=new Boleta();
    b3.nombre="Oscar";
    b3.control= 24020358;
    b3.poo= 9.5;
    b3.calculo_integral= 8;
    b3.algebra_lineal= 8.5;
    b3.cont_finan= 9;
    b3.prob_y_estadistica= 9;
    b3.quimica= 9;

    System.out.println(b3.obtenerDatos());



    }
}
