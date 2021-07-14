package org.soujava;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.google.common.collect.ImmutableMap.toImmutableMap;

public enum Operacao implements Calcular {

    SOMA("+") {
        
        @Override
        public double calcular(final double numerador, final double denominador) {
            double resultado = 0;
            
            resultado = numerador + denominador;
            
            return resultado;
        }
    },
    
    SUBTRACAO("-") {
        @Override
        public double calcular(final double numerador, final double denominador) {
        	double resultado = 0;
        	
        	resultado = numerador - denominador;
            
            return resultado;
        }
    },

    MULTIPLICAO("*") {
        @Override
        public double calcular(final double numerador, final double denominador) {
        	double resultado = 0;
        	
        	resultado = numerador * denominador;
            
            return resultado;
        }
    },

    DIVISAO("/") {
        @Override
        public double calcular(final double numerador, final double denominador) {
        	double resultado = 0;
        	
            if(denominador != 0) 
        	    resultado = numerador / denominador;
            else
                System.err.println("Não é permitida divisão por zero");
            
            return resultado;
        }
    };

    private final String simbolo;

    private static final Map<String, Operacao> operacoes = Stream.of(values())
    		.collect(toImmutableMap(k -> k.getSimbolo(), v -> v));

    private Operacao(String simbolo) {
    	checkArgument(!isNullOrEmpty(simbolo), "Tipo da operação não definido");
        this.simbolo = simbolo;
    }

    public static Operacao from(String simbolo) {
        checkArgument(!isNullOrEmpty(simbolo), "Operação não informada!");
        final Optional<Operacao> operacao = Optional.ofNullable(operacoes.get(simbolo));
        return operacao.orElseThrow(
            () -> new IllegalArgumentException(String.format("A operação %s inválida", simbolo))
        );
    }
    
    public String getSimbolo() {
        return simbolo;
    }

}
