import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoExcepcionVerificada {
    public static void main(String[] args) throws Exception{
        
        try {
            FileInputStream f=new FileInputStream("Hola.txt");
        }catch (FileNotFoundException objetoException){
            System.out.println("Ha ocurrido el siguiente error "+ objetoException.getMessage());
        }
        
    }
}
