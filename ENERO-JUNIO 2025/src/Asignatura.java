public class Asignatura {
    private String nombre;
    private int creditos;
    private int teoria;
    private int practica;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getTeoria() {
        return teoria;
    }

    public void setTeoria(int teoria) {
        this.teoria = teoria;
    }

    public int getPractica() {
        return practica;
    }

    public void setPractica(int practica) {
        this.practica = practica;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", teoria=" + teoria +
                ", practica=" + practica +
                ", clave='" + clave + '\'' +
                '}';
    }
}
