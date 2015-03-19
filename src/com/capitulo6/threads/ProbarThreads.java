
package com.capitulo6.threads;

public class ProbarThreads {

    public static void main(String[] args) {
        System.out.println("probar threads");
        //PASO 1 <CREARLO>
        Facil t1 = new Facil();     //PRIMER THREAD HEREDANDO LAS CLASE THREAD
        Facil t11 = new Facil();
        
        
        Regular r1 = new Regular();     //SEGUNDO THREAD IMPLEMENTANDO LAS CLASE RUNNEBLE
        Thread t2 = new Thread(r1);
        
        
        Thread t3 = new Thread(new Runnable(){      //TERCER THREAD USANDO LAS CLASES INTERNAS ANONIMAS (BACKGROUD)
            public void run() {
                System.out.println("soy un thread mucho mejor!");
            }
            
        }
        );
        
        
        
        relojito treloj = new relojito();
        
        
        
        //PASO 2 <INICIALIZARLO>
        t1.start();
        t11.start();
        
        t2.start();
        t3.start();
        
        //treloj.start();
        
    }
    
}
