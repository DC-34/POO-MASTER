public class DemoString {
    public static void main (String [] args){
        String nombre = new String ("Michael Jackson");
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        // nombre = nombre.toUpperCase();
        System.out.println(nombre);
        System.out.println(nombre.equals("Michael Jackson"));

        for(int i=0; 1<nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }

        //crear una rutina para cada frase, buscar si existe la palabra "AMOR"
        String frase = "Leo anda en busca del amor";
        String[] resultado = frase.split("");

        for(String s: resultado){
            System.out.println(s);
        }


    }
}
