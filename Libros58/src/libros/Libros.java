
package libros;

public class Libros {

    
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String editorial;
    private float precio;
    
 Libros(String titulo, String autor, String editorial) {
        this.titulo=titulo;
        this.autor=autor;
        this.editorial=editorial;
 }
 Libros(String titulo, String autor) {
      this.titulo=titulo;
      this.autor=autor;
     
 }
 Libros (){
     this("","","");
     
 }
  
  public void setAnoPublicacion (int anoPublicacion) {
      this.anoPublicacion=anoPublicacion;
  }
   
    public void setEditorial (String editorial){
        this.editorial=editorial;
    }
  
    public void setPrecio (float precio) {
        this.precio=precio;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public float getPrecio() {
        return precio;
    }
    
    public void mostrar () {
        System.out.println("\nTitulo  "+this.titulo+"\nEditorial   "+this.editorial+"\nAutor   "+this.autor);
    }
    
}
