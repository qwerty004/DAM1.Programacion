package conversor;

import static conversor.Menu.*;
import java.io.IOException;


public class ApConversor {

  
    public static void main(String[] args) throws IOException {
        try {
            elegirMenu();
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
       
    }
    
}
