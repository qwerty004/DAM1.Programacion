
package libros;

public class ApLibros {
    
    public static void main(String[] args) {
        Libros obra1 = new Libros ("Harry Potter","Rowling","Salamandra");
        Libros obra2 = new Libros ("Alicia en el PM","Carroll");
      
        System.out.println("Editorial: "+obra1.getEditorial());
        
//        obra1.setAnoPublicacion(1990);
        System.out.println("El año de publi de la obra 1 es  "+obra1.getAnoPublicacion());
        
        
        obra1.mostrar();
        
        Libros obra3 = new Libros();
       
                
                System.out.println("editorial"+obra3.getEditorial());
    }
    
}
