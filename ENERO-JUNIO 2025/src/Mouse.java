public class Mouse {
    private String DPI;
    private boolean alambrico;
    private boolean inalambrico;

    public String getDIP() {
        return DPI;
    }

    public void setDIP(String DIP) {
        this.DPI = DIP;
    }

    public boolean isAlambrico() {
        return alambrico;
    }

    public void setAlambrico(boolean alambrico) {
        this.alambrico = alambrico;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "DIP='" + DPI + '\'' +
                ", alambrico=" + alambrico +
                ", inalambrico=" + inalambrico +
                '}';
    }

    public Mouse(String DPI){
        this.DPI = DPI;
    }
    public Mouse(boolean alambrico, boolean inalambrico){
        this.inalambrico = inalambrico;
        this.alambrico = alambrico;
    }
    public Mouse(String DPI,boolean alambrico, boolean inalambrico){
        this.DPI = DPI;
        this.inalambrico = inalambrico;
        this.alambrico = alambrico;
    }
    public Mouse(){

    }
}
