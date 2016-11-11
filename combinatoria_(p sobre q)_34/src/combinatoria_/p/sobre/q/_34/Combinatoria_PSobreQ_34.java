package combinatoria_.p.sobre.q._34;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Combinatoria_PSobreQ_34 {

    public static void main(String[] args) throws IOException {
        
        
        int p, q, psobreq;

        InputStreamReader flujo;
        flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        System.out.println("Vamos a calcular la combinatoria de p sobre q");
        System.out.println("Introduce p (tiene que ser mayor o igual que q)");
        p=Integer.parseInt(teclado.readLine());
        System.out.println("Introduce q");
        q=Integer.parseInt(teclado.readLine());
        
        if (p<=0 || q<0 || p<q){
            System.out.println("Error. No se puede calcular");

        }
        else if (q==0 || p==q){
            System.out.println("p sobre q da como resultado 1");

        }
        else if (p-q==1 || q==1) { 
            System.out.println("p sobre q da como resultado "+p);
       
        }
        else {
        psobreq=calculaFactorial(p)/(calculaFactorial(q)*calculaFactorial(p-q));
            System.out.println("p sobre q da como resultado "+psobreq);
        }
          
    }
    
    
    
    public static int calculaFactorial(int n)  {
        int factorial;

        factorial=1;
        if (n>0) {
            for (int i=1;i<=n;i++){
                    factorial=factorial*i;                    
                }
        }   
        return factorial;
    }    
}
   
   

 