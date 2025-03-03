import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonaArrays {
    public static void main (String[] args){
        ArrayList<String> lista = new
                ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe quit para salir");

        String frase="";

        while (true){
            System.out.println("Dame una frase");
            frase=teclado.nextLine();
            if(frase.equals("quit")){
                break;
            }
            lista.add(frase);
        }
        for (String s:lista){
            System.out.println(s);
        }
    }
}