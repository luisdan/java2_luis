
package cuadrado;

public class NumeroNoNegativoException extends Exception {
    
    public NumeroNoNegativoException(){     //creamos una excepcion con un constructor
        super("no acepto valores negativos");   //los contructores no se hederan pero con el SUPER se mandan a llamar lo que tenga el constructor
        
    }
    
}
