//import java.io.FileInputStream;

public class DemoExcepciones {
    public static void main(String[] args) {

        //las excepciones tambien son clases, las excepciones se pueden manejear o transferir
        //excepcion verificada
        /*String ruta="Persona.java";
        FileInputStream f= new FileInputStream(ruta);*/

        //excepcion no verificada
        // try {
        //     int arreglo[] = new int[10];
        //     arreglo[1]=30;
        //     int div=10/0;
        // } catch (ArrayIndexOutOfBoundsException exception){
        //     System.out.println("Te pasaste de los limites del arreglo");
        // }catch (Exception e){
        //     System.out.println("Ocurrio un error diferente");
        // }finally {
        //     System.out.println("Hasta luego");
        // }

        PruebaExcepcion pe = new PruebaExcepcion();
        try {
            pe.creaArreglo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mi mensaje de excepcion");
        }

    }
}

class PruebaExcepcion {
    public void creaArreglo() throws ArrayIndexOutOfBoundsException{
        int arreglo[] = new int [10];
        arreglo [11]=30;
    }
}
