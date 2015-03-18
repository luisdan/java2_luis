
package Imc;

public class Imc {
    float peso;
    float estatura;

    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setEstatura(float estatura){
        this.estatura = estatura;
    }
    
    public float getEstatura(){
        return estatura;
    }
    
    
    public float calcularImc(float estatura, float peso){
        return peso / (estatura*estatura);
    }

    
    
}

/*

package octavo.java.cap1;

public class Imc 
{
    float estatura;
    float peso;
    
    public float calcularImc(float estatura, float peso){
        
        //return peso / (estatura*estatura); //ES UNA FORMA MAS DIRECTA DE MOSTRAR EL VALOR REQUERIDO
        
        float algo = peso / (estatura*estatura);
        return algo;
     
    }
    
}

*/