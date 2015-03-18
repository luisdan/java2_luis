
package com.capitulo6.threads;

public class Facil extends Thread{
    
    public void run(){
        
        try{
            Thread.sleep(3000);     //TIEMPO EN MILISEGUNDOS
        
        System.out.println("soy un thread facil");
        String nombre=Thread.currentThread().getName();
        System.out.println("me llamo " + nombre);
        
        
        }catch(InterruptedException e){   }
    }
    
}
