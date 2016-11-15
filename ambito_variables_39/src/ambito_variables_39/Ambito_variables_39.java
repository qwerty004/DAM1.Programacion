package ambito_variables_39;

public class Ambito_variables_39 {
    
    
static int var1 = 333;

    public static void main(String[] args) {
         // System.out.println("1- var1(global) = "+ var1); 
        //bloque var. locales
        int var1 = 100; //avisa de posibles errores
            System.out.println("2- var1(local) ="+ var1); 
        
            { int var2=88888;
//            int var1 =88; //error var local ya definida ****
                System. out.println("3- var1(local) = "+var1); 
            metodoprueba();
            }//............. 
            
            
}//fin main() 


static void metodoprueba(){
    byte numero=88;
    System.out.println("5- var1 = "+ var1);// mostrar var2?? 
    }
}

