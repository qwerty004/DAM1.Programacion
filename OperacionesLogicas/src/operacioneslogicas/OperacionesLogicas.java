
package operacioneslogicas;


public class OperacionesLogicas {

 
    public static void main(String[] args) {
        int i = 5, j = 4;
        boolean aux, verdad=true, falso=false; 
        
        //operadores logicos con booleanos
        System.out.println(" operaciones logicas...");
        System.out.println(" NOT verdad es "+ !verdad);
        System.out.println("\n NOT falso es "+ !falso);
        aux = verdad && falso;
        System.out.println("\n verdad AND falso es "+ aux);
        aux = verdad || falso;
        System.out.println("\n verdad OR falso es " + aux);
        
            //Operadores relacionales 
        System.out.println(" Mayor o igual que...");
        System.out.println(" (i>=j) = " +(i>=j));
        System.out.println(" (j>=i) = "+ (j>=i));
        System.out.println("(i!=j) = "+ (i!=j));
        
            //Operadores lógicos con enteros
        System.out.println(" operaciones logicas con enteros...");
        System.out.println("NOT(i>=j) = "+ !(i>=j));
        aux = (i>=j) && (j>=1);
        System.out.println("\n (i>=j) AND (j>=i) = "+ aux);
        aux = (i>=j) || (j>=1);
        System.out.println("(i>=j) OR (j>=i) = "+aux); 
        
        if (!aux==false)
            System.out.println("entonces es cierto"); 

        
        
    }
    
}


