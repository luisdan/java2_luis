
package cuadrado;

public class Arreglos1 {
    
    public static void main(String[] args) {
        int x[] = new int [3];   // con esta forma de declararlos la ventaja es que el usuario es el que va a dar los valores
        x[0]=127;
        x[1]=200;
        x[2]=23;
        //x[3]=12;
        
        int z[] = {1,20,45};  //la desventaja de declarar el arreglo de esta forma es que ya dejas los valores establecidos por defecto
        
        int[]y = new int[3];  //otra forma de declarar los arreglos
        
        /*
        for (int i=0; i<x.length; i++){ //LENGTH dice que va a llegar al maximo valor del arreglo
            
            System.out.println(x[i]);
        }
        */
        
        /*
        //CICLO "FOR" MEJORADO
        for(int algodon:x){     //tiene que ser del mismo tipo de datos que del arreglo
            System.out.println(algodon);
        }
        
        */
        
        for (int i=0; i<3; i++){    //ArrayIndexOutOfBoundsException   Cuando el FOR esta en 3
            
            System.out.println(x[i]);
        }
        
        int a=2;
        int b=0;
        
        System.out.println(a/b);    //ArithmeticException   o   Infinity cuando 'b' es FLOAT
        
        System.out.println("si ocurre una excepcion nunca me veras");    //ArrayIndexOutOfBoundsException   Cuando el FOR esta en 3

        
    }
    
}
