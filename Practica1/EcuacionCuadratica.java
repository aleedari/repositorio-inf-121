

public class EcuacionCuadratica {
    private float a;
    private float b;
    private float c;
    
    //constructor

    public EcuacionCuadratica(float a, float b, float c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    
    //metodos

    public float getDiscriminante(){
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRaiz1(){
        if (this.getDiscriminante() >=0){
            return (-this.b + Math.sqrt(this.getDiscriminante()))/2*this.a;
    }
        else{
        return 0;
        }

    }

    public double getRaiz2(){
        if (this.getDiscriminante() >=0){
            return (-this.b - Math.sqrt(this.getDiscriminante()))/2*this.a;
    }
        else{
            return 0;
        }
    }
}
