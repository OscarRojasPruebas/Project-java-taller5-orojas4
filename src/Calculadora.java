import java.util.Scanner;
public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double suma() {
        return num1 + num2;
    }
    public double resta() {
        return num1 - num2;
    }
    public double multiplicar() {
        return num1 * num2;
    }
    public double dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("¡Hey!¡Pilas!No se puede dividir por cero.");
            return Double.NaN;
        }
    }
}