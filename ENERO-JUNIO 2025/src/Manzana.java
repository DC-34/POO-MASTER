public class Manzana {
    private String color;
    private double peso;
    private int dulzura;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDulzura() {
        return dulzura;
    }

    public void setDulzura(int dulzura) {
        this.dulzura = dulzura;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "color='" + color + '\'' +
                ", peso=" + peso +
                ", dulzura=" + dulzura +
                '}';
    }
}
