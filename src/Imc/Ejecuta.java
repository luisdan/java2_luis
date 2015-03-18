
package Imc;

public class Ejecuta {

    public static void main(String[] args) {
        Imc x = new Imc();
        float calcular = x.calcularImc(174f, 75f);
        System.out.println("Tu Imc es de: " + calcular);

    }
    
}


/*
public class AplicacionImc {

    public static void main(String[] args) {
        //CREAMOS UN OBJETO DE TIPO IMC
        //REFERENCIA " ejemplo "
        //INSTANCIA " new Imc(); "

        Imc ejemplo = new Imc();
        float resultado = ejemplo.calcular(1.74f, 74f);
        System.out.println("tu peso IMC: " + resultado);

        
        Imc objeto1 = new Imc();
        float resultado;
        resultado = objeto1.calcularImc(1.74f, 74f);
        System.out.println("Tu IMC es de: " + resultado);
        

    }
    
}
*/