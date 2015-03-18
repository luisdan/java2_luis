
package cuadrado;

public class Circulo implements Superficies {       // CON EL IMPLEMENTS VA A OBLIGAR A LA CLASE A HEREDAR SU METODO ABSTRACTO DE #SUPERFICIES#
    float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea(){
        return 3.1416f * radio * radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
