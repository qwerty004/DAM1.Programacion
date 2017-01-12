
package clasesanimales1_54;

public class Animal {
    
     int edad;
//     String nombre;
    private String nombre;//con private solo se puede ver a nivel clase no a nivel paquete
    
    public  Animal(){}//Constructor clase java
    
    public  Animal(String n){ //Constructor clase java pero con argumentos
        nombre=n;
    }
    public void nace(){
        System.out.println("Hola mundo");
    }
    public String getNombre(){
        //System.out.println(nombre);
        return nombre;
    }
    public void getEdad(){
        System.out.println(edad);
    }
    public void setEdad(int e){
        edad=e;
    }
    public void setNombre(String n){
        nombre=n;
    }
}