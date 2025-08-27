import java.util.Scanner;

public class mainEstadisticas {

    // Método para calcular el promedio
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    // Método para calcular la desviación estándar
    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = lee.nextDouble();
        }

        double prom = promedio(numeros);
        double desv = desviacion(numeros);

        System.out.println("\nResultados:");
        System.out.println("Promedio = " + prom);
        System.out.println("\nDesviación estándar = " + desv);

        lee.close();
    }
}
