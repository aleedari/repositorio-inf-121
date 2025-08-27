import java.util.Scanner;

public class mainEcuacionLineal {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = lee.nextDouble();
        System.out.print("Ingrese b: ");
        double b = lee.nextDouble();
        System.out.print("Ingrese c: ");
        double c = lee.nextDouble();
        System.out.print("Ingrese d: ");
        double d = lee.nextDouble();
        System.out.print("Ingrese e: ");
        double e = lee.nextDouble();
        System.out.print("Ingrese f: ");
        double f = lee.nextDouble();

        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("Solución:");
            System.out.println("x = " + ecuacion.getX());
            System.out.println("y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución.");
        }

        lee.close();
    }
}

