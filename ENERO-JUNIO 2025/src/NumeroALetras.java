import java.util.Scanner;
public class NumeroALetras {
    private String[] unidades = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
    private String[] decenas = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"};
    private String[] decenas2 = {"", "", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
    private String[] centenas = {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};

    private int numero;

    public NumeroALetras() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 9999: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Número fuera de rango.");
            System.exit(0);
        }

        this.numero = num;
    }

    public String convertir() {
        if (numero == 0) return "Cero";
        if (numero == 100) return "Cien";

        int millar = numero / 1000;
        int centena = (numero % 1000) / 100;
        int decena = (numero % 100) / 10;
        int unidad = numero % 10;

        String resultado = "";

        if (millar > 0) {
            if (millar == 1) {
                resultado += "Mil ";
            } else {
                resultado += unidades[millar] + " Mil ";
            }
        }

        if (centena > 0) {
            resultado += centenas[centena] + " ";
        }

        if (decena == 1) {
            resultado += decenas[unidad];
        } else {
            if (decena > 1) {
                resultado += decenas2[decena] + " ";
                if (unidad > 0) {
                    resultado += "y " + unidades[unidad];
                }
            } else if (unidad > 0) {
                resultado += unidades[unidad];
            }
        }

        return resultado;
    }

    public String toString() {
        return convertir();
    }
}
