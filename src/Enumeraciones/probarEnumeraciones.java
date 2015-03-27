
package Enumeraciones;

public class probarEnumeraciones {


    public static void main(String[] args) {
        
        
        maquinaBuena maquina = new maquinaBuena();
        maquina.setEstado(EstadoDeMaquina.atascada);
        System.out.println("el estado de la maquina es: " + maquina.getEstado());
        
    }
    
}
