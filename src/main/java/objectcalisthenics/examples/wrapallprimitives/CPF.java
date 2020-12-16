package objectcalisthenics.examples.wrapallprimitives;

import lombok.Data;

@Data
public class CPF {

    private String numero;
    
    public CPF (String numero) throws CPFInvalidoException
    {
        if (!estaValido(numero))
            throw new CPFInvalidoException(numero);

        this.numero = numero;
    }

    private boolean estaValido(String numero)
    {
        return true;
    }

}