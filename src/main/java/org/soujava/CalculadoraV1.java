package org.soujava;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

public class CalculadoraV1 {

    private final String simbolo;

    private CalculadoraV1(String simbolo) {
        this.simbolo = simbolo;
    }

    public static CalculadoraV1 of(String simbolo) {
        checkArgument(!isNullOrEmpty(simbolo), "Tipo da operação não informada");
        return new CalculadoraV1(simbolo);
    }

    public double calcular(double numerador, double denominador) {
        double resultado = 0;
            
        if("+".equals(this.simbolo)) {
            // Alguma regra especifica antes

            resultado = numerador + denominador;

            // metodo()

            // Alguma regra especifica depois
        } else if("-".equals(this.simbolo)) {
            // Alguma regra especifica antes

            resultado = numerador - denominador;

            // Alguma regra especifica depois
        } else if("*".equals(this.simbolo)) {
            // Alguma regra especifica antes

            resultado = numerador * denominador;

            // Alguma regra especifica depois
        } else if("/".equals(this.simbolo)) {
            // Alguma regra especifica antes

            if(denominador != 0) 
        	    resultado = numerador / denominador;
            else
                System.err.println("Não é permitida divisão por zero");

            // Alguma regra especifica depois

        } // else if(.....) {
//          Outras regras
        // } // else if(.....) {
//          Outras regras
        // } // else if(.....) {
//          Outras regras
        // } 

        return resultado;
    }

    // Outros metodos
    
}