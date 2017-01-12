
import static java.lang.Math.*;


public class Circulo {
    private double radio;
    
    Circulo(double radio) {
        this.radio=radio;
    }
    
    Circulo (){
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }



    public double calcularLonxitude(){
        return radio*2*PI;

    }
    
    public double calcularArea(){
        return pow(this.radio,2)*PI;
    }
    
    public static void mostrarRadio (Circulo circulito){
        System.out.println("El rooooidio es: "+circulito.getRadio());
    }
    
    //Outro metodo de clase que recibe dous obxetos Circulo e
//calcule e retorne o maior dos dous .
    public static Circulo devolverMayor(Circulo c1, Circulo c2){
       
        if (c1.getRadio()>c2.getRadio()) {
           return c1;            
        }
        
        else{
           return c2; 
        }

    }
    
}
