package cuadrado;

public class cuadrado {
    
    private float lado;
   
    public float getLado() {    //ENCAPSULAMIENTO GET de LADO
        return lado;
    }
    
    public void setLado(float lado) throws NumeroNoNegativoException, ValidarRangoException {   //ENCAPSULAMIENTO SET de LADO
        ValidarValorNoNegativo.validar(lado);
        ValidarFueraDeRango.validar(lado);
        this.lado = lado;
    }
    
    public cuadrado(){   //CONSTRUCTOR   
    }
    
    public cuadrado(float lado) throws NumeroNoNegativoException, ValidarRangoException {   //CONSTRUCTOR2
        ValidarValorNoNegativo.validar(lado);
        ValidarFueraDeRango.validar(lado);
        this.lado = lado;
    }
    
    float calcularArea(){
        float area =lado*lado;
        return area;
    }


    
}


/**
 * esto sierve como DOCUMENTACION y se puede visualizar en el main para una breve explicacion de los que hace
 * @param lado 
 */