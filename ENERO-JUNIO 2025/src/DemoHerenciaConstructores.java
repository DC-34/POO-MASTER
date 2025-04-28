public class DemoHerenciaConstructores {
    public static void main(String[] args) {

    }
}

class Animal{
    String especie;
    String tipo_nacimiento;

    public Animal(){}

    public Animal(String especie, String tipoNacimiento) {
    }
}

class Elefante extends Animal{
    private String raza;
    private double peso;

    public Elefante() {
    }

    public Elefante (String especie, String tipo_nacimiento, String raza, double peso){
        super(especie, tipo_nacimiento);
        //this/super constructores del padre
        //super. no constructores, como atributos o metodos del padre
        this.raza=raza;
        this.peso=peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "raza='" + raza + '\'' +
                ", peso=" + peso +
                '}';
    }
}