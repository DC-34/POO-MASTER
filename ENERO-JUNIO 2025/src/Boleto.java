public class Boleto {
    private double precio;
    private int asiento;
    private String evento;


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "precio=" + precio +
                ", asiento=" + asiento +
                ", evento='" + evento + '\'' +
                '}';
    }
}
