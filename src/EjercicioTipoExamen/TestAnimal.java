
package EjercicioTipoExamen;

public class TestAnimal {

    public static void main(String[] args) {
        for(Animal a: GenerarAnimales.generarAnimales()){
            System.out.println(a.getNombre());
        }
    }
    
}
        /*
        for (int i=0; i<x.length; i++){ //LENGTH dice que va a llegar al maximo valor del arreglo
            
            System.out.println(x[i]);
        }
        */
        
        /*
        //CICLO "FOR" MEJORADO
        for(int i:x){     //tiene que ser del mismo tipo de datos que del arreglo
            System.out.println(i);
        }
        
        */