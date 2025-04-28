public class Ejercicio_Interfaz {
    /*
    Crear una interfaz llamada Conectable con los métodos:
    - conectarDerecha
    - conectarIzquierda
    Crear una clase concreta llamada Nodo que contenga los campos:
    - nombre
    - valor

    Implementar en la clase Nodo la interfaz, de tal manera que
    un nodo en la izquierda se conecte con el nodo a su derecha y
    automaticamnete el nodo a su derecha se conecte con el nodo izquierda
    De igual manera si el nodo a la derecga se conecte con el nodo a la izquierda automaticamente el nodo
    izquierdo se conecte con el nodo derecho
     */

    public static void main(String[] args) {
        Nodo a = new Nodo("A", 1);
        Nodo b = new Nodo("B", 2);
        Nodo c = new Nodo("C", 3);

        a.conectarDerecha(b);
        b.conectarDerecha(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

interface Conectable {
    void conectarDerecha (Nodo nodo);
    void conectarIzquierda (Nodo nodo);
}

class Nodo implements Conectable {
    String nombre;
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo (String nombre, int valor) {
        this.nombre=nombre;
        this.valor = valor;
    }

    public void conectarDerecha(Nodo nodo){
        this.derecha=nodo;
        if (nodo != null)
            nodo.izquierda=this;
    }
    public void conectarIzquierda(Nodo nodo){
        this.izquierda=nodo;
        if (nodo != null)
            nodo.derecha=this;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", izquierda=" + izquierda +
                ", derecha=" + derecha +
                '}';
    }

}


