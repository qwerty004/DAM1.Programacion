        
/* Mecanizar ,compilar, ejecutar,entender orden de operaciones
* y comentar cada linea de codigo
*/


package operadores2;

    public class Operadores2 {
        public static void main (String args[]){ 

//definicion de variables
    int y = 7, x = 5;
    int x_mas, mas_y, mayor, q;
    boolean positivo=false;
    
    y *= x + 1;
    System.out.println("l- y*(x+1)="+ y);
    y /= 5+x;
    System.out.println("2- y/(5+x)="+y);
    y = --x+2;
    System.out.println ("3- --x + 2="+ y);
    System.out.println ("x="+ x+". y= "+y);
    x_mas = x++;
    mas_y = ++y;
    System.out.println("4- x_mas = "+x_mas+ " mas_y= "+ mas_y +" x= "+x+" y= "+y);

    q = 2*++y;
    System.out.println(" 2 * (y+1) = "+ q);
    q = 2*x++;
    System.out.println(" 2 * x = "+ q);
    mayor = x>y ? x++ : --y;
    if (mayor>0){
        System.out.println(" mayor es distinto de cero");
    // positivo=true; 
    }
    if (!positivo) {
    System.out.println("positivo es ??????"); 
    }
        }
    
    }
