
package SemSantaTeExtrañoVuelvePronto;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    String nombre;
    float sueldo;
    String email;

    public Usuario() {
    }
    
    
    public Usuario(String nombre, float sueldo, String email) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}
