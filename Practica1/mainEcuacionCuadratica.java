import java.util.Scanner;

public class mainEcuacionCuadratica{
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("INGRESE a,b y c respectivamente:\n");
        
            float a = Float.parseFloat (lee.nextLine());
            float b = Float.parseFloat (lee.nextLine());
            float c = Float.parseFloat (lee.nextLine());
        
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a,b,c);

        if (ecuacion.getDiscriminante()>0){
            System.out.println("Raiz 1:" + ecuacion.getRaiz1());
            System.out.println("Raiz 2:" + ecuacion.getRaiz2());
        }else if(ecuacion.getDiscriminante() == 0){
            System.out.println("La Ecuacion tiene una raiz " + ecuacion.getRaiz1());
        }else{
            System.out.println("LA ECUACION NO TIENE RAICES REALES");
        }
    }
}