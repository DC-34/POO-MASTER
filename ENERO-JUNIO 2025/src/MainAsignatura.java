public class MainAsignatura {
    public static void main (String [] args){
        Asignatura poo=new Asignatura();
        poo.setNombre("POO");
        poo.setClave("AED 1286");
        poo.setCreditos(5);
        poo.setTeoria(2);
        poo.setPractica(3);

        System.out.println(poo);
    }
}
