
package conversor;

public class Conversor {
    
    public  static double EURO_LIBRA=0.867321968, LIBRA_EURO=1/0.867321968, EURO_DOLAR=1.06325, DOLAR_EURO=1/1.06325;
    
    // falta poner los SETs por si se quieren cambiar los valores
   
    public static void eurosALibras(double cantidad){
        System.out.println(cantidad+" euros son "+(cantidad*EURO_LIBRA)+" libras esterlinas británicas\n\n");
    }
    
    public static void librasAEuros (double cantidad){
        System.out.println(cantidad+" libras esterlinas británicas son "+(cantidad*LIBRA_EURO)+" euros\n\n");
        
    }
    
    public static void eurosADolares(double cantidad){
        System.out.println(cantidad+" euros son "+(cantidad*EURO_DOLAR)+" dólares estadounidenses\n\n");
    }
    
    public static void dolaresAEuros(double cantidad) {
        System.out.println(cantidad+" dólares estadounidenses son "+(cantidad*DOLAR_EURO)+" euros\n\n");
        
    }

    
}
