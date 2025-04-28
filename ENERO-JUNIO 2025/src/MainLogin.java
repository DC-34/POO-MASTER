import java.util.ArrayList;
import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        Login login = new Login();
        login.registrarme("yo", "1234");

        Scanner entradaDatos=new Scanner(System.in);
        String miUsuario=entradaDatos.nextLine();
        String miPassword=entradaDatos.nextLine();

        try{
            login.verificaAcceso(miUsuario, miPassword);
            System.out.println("Acceso concedido");
        } catch (NoExisteUsuario e){
            System.out.println("No fue posible loguearse" + e.getMessage());
        }
        
            

    }
}

class NoExisteUsuario extends Exception{
    public NoExisteUsuario(String mensaje){
        super (mensaje);
    }

}

class Usuario {
    private String usuario;
    private String password;

    public Usuario(String user, String pwd){
        this.usuario=user;
        this.password=pwd;
    }
    public String setUsuario(){
        return this.usuario=

    }
}

class Login {
    ArrayList<Usuario> listaUsuarios;

    public Login(){
        listaUsuarios=new ArrayList<>();

    }

    public void registrarme(Usuario user){
        listaUsuarios.add(user);
    }

    public void verificaAcceso(String user, String pwd){
        for (Usuario usuario:listaUsuarios){
            if (usurio.getUsuario().equals(user) && usurio.getPassword().equals(pwd))
                return true;
        }
        throw new NoExisteUsuario("Usuario no encotrado");
    }
}