package NombreOrdenador69;

import java.util.Arrays;

public class NombreOrdenador {
    
    private String etiqueta;
    

    public NombreOrdenador(String etiqueta) {
        if (compruebaFormato(etiqueta)){
            this.etiqueta = etiqueta;
            devuelve(etiqueta);
        }
        else {
        System.out.println("Error de formato");
    }
}
    
    void devuelve(String etiqueta){

        String subst1=etiqueta.substring(2, 4);
        String subst2=etiqueta.substring(4, 6);
        System.out.println("AULA "+subst1+"; Nº de equipo: "+subst2);
    }
    
    boolean compruebaFormato(String etiqueta) {
        boolean bandera = true;
        System.out.println("Eti: "+etiqueta);
        if (etiqueta.length()!=6)
            bandera=false;
        else {
            if (etiqueta.charAt(0)!='P' || etiqueta.charAt(0)!='p') 
                bandera=false;
            else{
                if (etiqueta.charAt(1)!='C' || etiqueta.charAt(1)!='c') 
                bandera=false;
                else {
                    String substring1 = etiqueta.substring(2, 4);
                    String [] valoresPosibles1 = {"05","16","18","25","20","21"};
                    if (Arrays.asList(valoresPosibles1).contains(substring1)==false) {
                        bandera = false;
                    }
                    else {
                        if (bandera) {
                            
                        }
                    
                    }
                    
                 
                }
                
            }
                
            
        }
        
        return bandera;
    }
    
    
    
    
}
