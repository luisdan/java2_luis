
package SemSantaTeExtrañoVuelvePronto;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ProbarSerializado {


    public static void main(String[] args) {
        Usuario u = new Usuario();
                u.setEmail("hola@hola.com");
                u.setNombre("daniel");
                u.setSueldo(60000);
        
        PersistenciaUsuario per = new PersistenciaUsuario();
        
        try {
            per.guardar(u);
            System.out.println("usuario guardado con exito");
            
        } catch (Exception ex) {
    
        System.out.println(ex.getMessage());
        
        }
        
}

}
