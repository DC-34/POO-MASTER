public class MainClases {
    public static void main (String [] args){
        Computadora c1=new Computadora();
        c1.setMarca("Lenovo");
        c1.setProcesador("AMD");
        c1.setRam(8);
        c1.setAlmacenamiento(500);
        c1.setPrecio(10000);

        System.out.println(c1);


        Computadora c2=new Computadora();
        c2.setMarca("Asus");
        c2.setProcesador("Intel");
        c2.setRam(32);
        c2.setAlmacenamiento(1000);
        c2.setPrecio(20000);

        System.out.println(c2);

        Profesionista p1 = new Profesionista();
        p1.setNombre("Pedro");
        p1.setProfesion("Ingeniero");
        p1.setSueldo(20000);

        System.out.println(p1);

        Profesionista p2 = new Profesionista();
        p2.setNombre("Juan");
        p2.setProfesion("Medico");
        p2.setSueldo(18000);

        System.out.println(p2);

        Balon b1 = new Balon();
        b1.setMarca("Adidas");
        b1.setColor("Blanco");
        b1.setTipo("Futbol");

        System.out.println(b1);

        Balon b2 = new Balon();
        b2.setMarca("Wilson");
        b2.setColor("Cafe");
        b2.setTipo("Basquetbol");

        System.out.println(b2);

        Manzana m1 = new Manzana();
        m1.setColor("Roja");
        m1.setPeso(300);
        m1.setDulzura(9);

        System.out.println(m1);

        Manzana m2 = new Manzana();
        m2.setColor("Verde");
        m2.setPeso(200);
        m2.setDulzura(8);

        System.out.println(m2);

        Boleto bo1 = new Boleto();
        bo1.setPrecio(2500);
        bo1.setAsiento(8);
        bo1.setEvento("Concierto");

        System.out.println(bo1);

        Boleto bo2 = new Boleto();
        bo2.setPrecio(120);
        bo2.setAsiento(6);
        bo2.setEvento("Cine");

        System.out.println(bo2);
    }
}
