
package cuadrado;

public class ValidarValorNoNegativo {
    
    public static void validar(float valor)throws NumeroNoNegativoException{        //THROWS metodo con Posibilidad que pudiera lanzar una excepcion se puede poner cuantas execpciones se requieran unidos por una coma
        if (valor < 0) throw new NumeroNoNegativoException();       //ocurrencia, cuando la excepcion se Cumple
    }
    
}
