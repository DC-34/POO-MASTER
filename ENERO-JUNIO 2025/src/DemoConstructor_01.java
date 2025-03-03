//vamos a agregar un constructor a nuestra clase
//CONSTRUCTOR: un metodo especial que es invocado
//en el proceso de instanciamiento de la clase
//Es publico y se llama igual que la clase y no tiene tipo de retorno
public class DemoConstructor_01 {
    String atributo1="valor inicializado";
    double atributo2;
    

    public DemoConstructor_01(){
        System.out.println("Crenado objeto");
        atributo1 = "Valor del atributo 1";
    }//Este es un constructor por default, siemore existia

    public DemoConstructor_01 (String valor) {  //String
        atributo1 = valor;
    }

    public DemoConstructor_01(double valor1, String valor2){    //double, String
        atributo2 = valor1;
        atributo1 = valor2;
    }
    public DemoConstructor_01(double valor1){   //double
        atributo2 = valor1;
    }
}
