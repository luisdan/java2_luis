
package enamueracionesTarea;


public class Ejecuta {


    public static void main(String[] args) {
        
        Maquina test = new Maquina();
        test.setEstado(Estados.chica);
        System.out.println("el tamaño es: " + test.estado);
        
    }
    
}
