import java.util.Scanner;
public class Calculadora {
    private double num1;
    private double num2;

    // Constructor de la clase
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double suma() {
        return num1 + num2;
    }

    // Método para restar
    public double resta() {
        return num1 - num2;
    }

    // Método para multiplicar
    public double multiplicar() {
        return num1 * num2;
    }

    // Método para dividir
    public double dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Retorna 'Not a Number' en caso de división por cero
        }
    }
}