package ordenador57;
public class ApOrdenador {
    public static void main(String[] args) {
       Ordenador nuevopc = new Ordenador("Lenovo","Intel i3");
       nuevopc.setPantalla("Samsung");
       nuevopc.mostrarEstado();
       nuevopc.encenderOrdenador();
       nuevopc.mostrarDatos();
    }

}