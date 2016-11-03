package moldeo_datos_15;
public class Moldeo_datos_15 {
    public static void main(String[] args) {
        int x=3;
        double y;
        y = 5.15615454;
        float z, raiz;
        z=x + 8.96F; //probar sin letra
        z=(float)(200*y+x); // hacer con y sin moldeo
        System.out.println("valor float: "+z);
        System.out.println("valor double: "+ (double)z);
        System.out.println("valor int: "+ (int)z);
        System.out.println("valor byte: "+ (byte)z);
        System.out.println("valor double de y: "+ y);
        
        // int d=(float)x/2; error
        
        z= (float)(200F*+x); // probar error alt+enter sugerido
        
        // raiz=(float)Math.sqrt)(10): // perdida de dato
    }
    
}
