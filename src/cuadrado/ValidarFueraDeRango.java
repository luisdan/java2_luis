
package cuadrado;

public class ValidarFueraDeRango {
    
    public static void validar(float valor) throws ValidarRangoException {
        if (valor > 10) throw new ValidarRangoException();
    }
    
}
