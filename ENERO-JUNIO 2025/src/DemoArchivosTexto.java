import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoArchivosTexto {
    
    public static void main(String[] args)throws FileNotFoundException, IOException{
        File arch = new File ("./src/miArchivo.txt");
        FileReader fr=new FileReader (arch);
        FileWriter fw=new FileWriter("./src/copia.txt");
    
        int c;
        while((c= fr.read())!=-1){
            System.out.print((char)c);
            fw.write(c);
        }
        //int c=fr.read();
       // System.out.print((char)c);
        fr.close();
        fw.close();
    }

        
}
