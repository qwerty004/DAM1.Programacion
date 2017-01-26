package aplicacion;


import static java.lang.Math.*;

/**
 * 
 * @author dam116
 */
public class Circulo {
     double radio;
    double area;
    final String color;


    public Circulo() {
        this.color="ccc";
        
    }
   
        /**
     * 
     * @param radiazo 
     */
    public Circulo(double radiazo) {
        this.radio=radiazo;
        this.color="aaa";
        
    }
    

    /**
     * 
     * @param radio 
     */
    public Circulo (float radio){
           this.color="bbbb";
        this.radio=radio;
    }

    
    
    static String mostrarRadio(Circulo circulo1){
        return "\n El radio de este círculo es "+circulo1.radio;
    }

    


/**
 * Calcula longitud
 * @return 
 */
    public double calcularLonxitude(){
        return radio*2*PI;

    }
    /**
     *  Calcula el area
     * @return 
     */
    public double calcularArea(){
        return pow(this.radio,2)*PI;
    }
/**
 * 
 * @return 
 */
    public double getRadio() {
        return radio;
    }
/**
 * 
 * @param radiazo 
 */
    public void setRadiazo(double radiazo) {
        this.radio = radiazo;
    }
   

    
}
