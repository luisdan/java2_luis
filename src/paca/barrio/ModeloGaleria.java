
package paca.barrio;

import java.util.ArrayList;

public class ModeloGaleria {
    public static ArrayList<Galeria> generarGaleria(){
        ArrayList<Galeria> arreglo = new ArrayList<Galeria>();
        Galeria g1 = new Galeria("Titulo 1", "MI descripcion 1", "/paca/barrio/uno.jpg" );
        Galeria g2 = new Galeria("Titulo 2", "Descripcion 2", "/paca/barrio/dos.jpg" );
        Galeria g3 = new Galeria("Titulo 3", "Descripcion 2", "/paca/barrio/tres.jpg" );
        
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        
        return arreglo;
    }
    
}
