import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_Interfaz_2 {
    /*Crear un programa en POO que contenga las clases Alumno, Asistencia, ListaAsistencia. Haga que interactuen
    para registrar la asistencia de un grupo
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ListaAsistencia listaAsitencia = new ListaAsistencia();

        System.out.println("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Ingrese el nombre del alumno " + (i+1) + ":");
            String nombre = scanner.nextLine();
            System.out.println(nombre);
            System.out.println("¿Está presente?: ");
            boolean presente=scanner.nextBoolean();
            scanner.nextLine();

            listaAsitencia.registroAsistencia(new Estudiante(nombre), presente);
        }
        listaAsitencia.mostrarLista();
        scanner.close();
    }
}

class Estudiante{
    String nombre;
    int numLista;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
}

class Asistencia {
    Estudiante estudiante;
    boolean presente;

    public Asistencia(Estudiante estudiante, boolean presente) {
        this.presente = presente;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return estudiante.nombre + ": " +
                (presente ? "Presente" : "Ausente");
    }
}


    class ListaAsistencia {
        ArrayList <Asistencia> lista = new ArrayList<>();

        public void registroAsistencia (Estudiante estudiante, boolean presente)
        {lista.add(new Asistencia (estudiante, presente));}

        public void mostrarLista() {
            System.out.println("Lista de Asistencia");
            for (Asistencia asistencia : lista) {
                System.out.println(asistencia);
            }
        }
    }


