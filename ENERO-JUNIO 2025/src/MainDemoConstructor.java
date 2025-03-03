public class MainDemoConstructor {
    public static void main (String [] args){
        DemoConstructor_01 obj = new DemoConstructor_01();
        System.out.println(obj.atributo1);
        obj.atributo1="nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructor_01 obj2 = new DemoConstructor_01("Este es mi valor");
        System.out.println(obj.atributo1);


        DemoConstructor_01 obj3 = new DemoConstructor_01(20.5, "Valor String");

    }
}
