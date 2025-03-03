public class Profesionista {
    private String nombre;
    private String profesion;
    private double sueldo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
