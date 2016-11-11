
package prueba_pinta_combinatoria_p1;


public class Prueba_pinta_combinatoria_p1 {

   
    public static void main(String[] args) {
    int n=9;
//        for (int i=1;i<n;i++){
//            for (int j=i;j<n;j++){
//                System.out.println("a(" +i+","+j+")= "+i+","+(j+1));
//
//            
//            }
//        }
//        
//        for (int i=1;i<n;i++){
//            for (int j=i;j<n;j++){
//                System.out.print(i+","+(j+1)+"   ");
//
//            }
//                            System.out.println("");
//        }
//        
//       
 //       System.out.println("---------------");
        
        for (int i=1;i<n;i++){
            for (int j=1;j<n;j++){
                if (j<i){
                    System.out.print("     ");
                }
                else
                System.out.print(i+","+(j+1)+"  ");

            }
                            System.out.println("");
        }
        
        
    }
    
}
