package cgrados55;

public class CGrados55 {
    private float gradosC; //grados centigrados 
    public void centigradosAsignar(float gC){ 
        gradosC = gC; //establecer el atributo grados centigrados 
    }
    public float fahrenheitObtener(){ //controlar division
        return 9F/5F * gradosC + 32; //retornarlos grados fahrenheit equivalen 
    }
    public float centigradosObtener(){
        return gradosC; // retornar los grados centigrados 
    } 
}
