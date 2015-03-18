
package cuadrado;

public class Rectangulo {
    float ladoMayor;
    float ladoMenor;

    public Rectangulo() {
        
    }

    public Rectangulo(float ladoMayor, float ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    
    public float calcularArea(){
        return ladoMayor * ladoMenor;
    }

    public float getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(float ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public float getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(float ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
}
