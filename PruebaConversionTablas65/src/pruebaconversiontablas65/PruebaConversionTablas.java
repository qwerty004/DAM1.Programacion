/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconversiontablas65;

/**
 *
 * @author dam116
 */
public class PruebaConversionTablas {
    public static void main(String [] args) {
        String s1="prueba";
        String cadena="12da4";
//        int i=70;
        int i='a';
        char []tabla={'1' ,'2' ,'3' ,'4' ,'5'}; //tabla cadena
        int [] numeros={1,2,3};
        char [] letras={ 'h' , 'o' , 'l' , 'a'};
        // ********* de datos basico a cadenas
        s1=String.valueOf(i) ;
        System.out.println("cadena "+ s1) ;
        //**** de tabla a cadena
        s1=String.valueOf(letras) ;
        System.out.println("letras como cadena "+ s1);
        // ***** de cadena a tabla
        char [] vector=cadena.toCharArray() ;
        
        for ( i=0;i<vector.length; i++){
            System.out.println("elemento "+ vector [i]);        
        }
        //** solo un trozo para vector en posicin 1
        s1.getChars(0,3,vector,1);
        
        
        
        
        for( i=0 ; i<vector.length ; i++){
            System.out.println("nuevo elemento "+ vector[i] ) ;
        }
        //****+Devuelve Lma cadena del objeto pasado
        s1= String.valueOf(tabla) ;
        System.out.println(" la tabla coma cadena "+ s1) ;
        System.out.println ( "montar cadena con numeros: ") ;
        s1=new String () ;
        for (i=0 ; i<numeros.length ; i++) {
            s1=s1+String.valueOf(numeros[i]) ;
        }
        System.out.println("cadena "+ s1) ;
        
    }
}
