import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoArchivos_03 {
    public static void main(String[] args) {
        FileOutputStream fos=new FileOutputStream("archivo3.txt");
       // byte[] msg={'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o' };
        String datos="Hola mundo Cruel";
        byte[] info=datos
        fos.write(info);
        fos.close();

        FileOutputStream fis=new FileInputStream("archivo3.txt");
        System.out.println(new String(fis.readAllBytes()));
        
        fis.close();
    }
}
