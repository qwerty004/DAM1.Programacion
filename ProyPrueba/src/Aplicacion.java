import java.util.Scanner;
public class Aplicacion {
    public static void main(String [] args) {
    
        Scanner sc=new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.println("Introduce el tiempo total en segundos");
        segundos=sc.nextInt();
        horas=segundos/3600;
	minutos=(segundos-horas*3600)/60;
	segundos=segundos-(horas*3600+minutos*60);
        System.out.println(horas+"horas "+minutos+"minutos "+segundos+"segundos");
}



}