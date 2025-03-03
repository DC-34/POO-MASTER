public class Balon {
    private String marca;
    private String color;
    private String tipo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
