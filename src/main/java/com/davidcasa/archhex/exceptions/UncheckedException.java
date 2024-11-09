package com.davidcasa.archhex.exceptions;

public class UncheckedException {

    /**
     * En este caso no solicita de manera obligatoria el uso de throw
     * o el uso de try catch ya que no se genera ninguna alerta ni errores
     * Este error se da en tiempo de compilacion cuando se genera una division para 0
     * Por lo cual se considera una unchecked exception
     */
    public void unCheckedException() {
        Integer numF = 100;
        Integer numC = 0;
        int result = numF / numC;
    }
}
