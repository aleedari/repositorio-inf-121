
public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    //Constructor

    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Método que verifica si tiene solución (determinante != 0)
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }

    // Retorna X
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Retorna Y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

// Clase de prueba
