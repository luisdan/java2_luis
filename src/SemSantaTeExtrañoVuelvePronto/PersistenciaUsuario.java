
package SemSantaTeExtrañoVuelvePronto;

import java.io.*;

public class PersistenciaUsuario {
    
    //asociacion debil
    public void guardar(Usuario u) throws Exception{
       //paso1: crear el archivo
       File file = new File ("D:\\archivar.yo ");
        
       
       //paso2: para sacar el archivo
       FileOutputStream fos = new FileOutputStream(file);
       
       
       //paso3: llenarlo
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(u);
       oos.close();
       
    }
    
    public Usuario leer()throws Exception{
        
        File file = new File ("D:\\archivar.yo ");
        
        FileInputStream fis = new FileInputStream(file);
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        Usuario u = new Usuario();
        u = (Usuario)ois.readObject();
        
        return u;
        }
        
    }
    
  
