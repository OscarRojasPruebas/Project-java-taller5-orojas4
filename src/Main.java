import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("=             CALCULADORA TALLER 05              =");
        System.out.println("==================================================");

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(num1, num2);//Se crea instancia de la clase Calculadora

        System.out.println("==================================================");
        System.out.println("-Por favor, elige la operación a realizar:       -");
        System.out.println("-       1: Suma                                  -");
        System.out.println("-       2: Resta                                 -");
        System.out.println("-       3: Multiplicación                        -");
        System.out.println("-       4: División                              -");
        System.out.println("==================================================");
        System.out.println("Digite su opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch(opcion) {
            case 1:
                resultado = calculadora.suma();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = calculadora.resta();
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicar();
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                resultado = calculadora.dividir();
                if (!Double.isNaN(resultado)) {
                    System.out.println("El resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}