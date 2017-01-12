package clasesanimales1_54;

public class ClasesAnimales1_54 {

    public static void main(String[] args) {
       
        Animal migato= new Animal();
        Animal miperro = new Animal ("can");
        migato.nace();
        //migato.nombre="batman";
        migato.edad=1;
        migato.getNombre();
        migato.getEdad();
        
        Pajaro unpajaro=new Pajaro();
        unpajaro.color="rojo";
        unpajaro.setNombre("pio");
        unpajaro.peso=2;
        
        
        
    }    
}

