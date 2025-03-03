/*import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //VARIABLES
    int a;
    double b;
    float c;
    String d;
    boolean e;

    a=3;
    b=20.5;
    //d= "esta es una cadena";
    e=true;
    String nombre = "DIEGO ARCOS";

    //constantes
    double PI = 3.141516;

    Scanner intro = new Scanner (System.in);
    System.out.println(b);
    b=intro.nextDouble ();
    System.out.println(b);

    System.out.println(PI);
    PI=intro.nextDouble ();
    System.out.println(PI);

    //condicionales <, >, <=, >=, !=, ==
    // operadores logicos &&, ||, !
    int valor=10;
    if (valor>=20){
        System.out.println("es mayor");
    }
    else {
        System.out.println("Es mayor");
    }

    System.out.println("fin del programa");

    //condicionales multiples

    int opcion;
    opcion = 4;
    switch (opcion){
        case 1:
            System.out.println("Vale 1");
            break;
        case 2:
            System.out.println("Vale 2");
            break;
        case 3:
            System.out.println("Vale 3");
            break;
        default:
            System.out.println("Vale no permitido");
            break;
    }

        //ciclos
        for (int i=10, j=0; i!=j; i--, j++)
        {
            if (i==9)
                continue;
            System.out.println(i);
            if (i==7){
                break;
            }
        }
        Scanner teclado=new Scanner (System.in);
        int opcion=1
        for (;;){
            System.out.println("Escribe un 0 para salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Tecleaste 1");
                    break;
                case 2:
                    System.out.println("Tecleaste 2");
                    break;
                case 3:
                    System.out.println("Tecleaste 3");
                    break;
                default:
                    break;
            }

            if (opcion==0)
                break;
        }

        //while
        int opcion=1;
        while (opcion<10){
            System.out.println(opcion);
            opcion=opcion+1;
        }
        int centinela=0;
        do{
            System.out.println("centinela en do while");
        }while (centinela!=0);

        centinela=0;

        while (centinela!=0){
            System.out.println("centinela while");
        }
        System.out.println(sumar(a:3; b:5));
        mult (x:6, y:10); */

        //arreglos
        //int[][] x;

        //int [] edades={18, 20, 21, 25, 19, 22};
        //String nombres[]= {"Oscar", "Antonio", "Ulises", "Helena"};


        /*System.out.println(edades[1]);
        System.out.println(nombres[nombres.length-1]);




        for (int i=0;i<nombres.length;i++){

        }

        int edades []=new int [10];

        edades [6]=16;
        edades [1]=20;
        System.out.println(edades[6]);
        System.out.println(edades[1]);
        System.out.println(edades[0]);

        String [] paises=new String [5];
        paises [0]="México";
        paises[1]=10;
        System.out.println(paises[5]);

        //matrices, son arreglos bidimencionales

        int[][] calificaciones = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(calificaciones[0].length);
        System.out.println(calificaciones[0][2]); //fila, columna

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[0].length; j++) {
                System.out.println(calificaciones[i][j]);
            }
        }

        double[][] calif_poo = new double[27][6];
        calif_poo[6][0]=99;
        System.out.println(calif_poo[6][0]);
    }

    }// fin del main
    public static int sumar(int a, int b){
        return a+b;
        }
    public static void mult (int x, int y){
        int res;
        res=x+y;
        System.out.println(res);
    }
}*/