package org.soujava;

public class Main {

	public static void main(String[] args) {
		double calculo = CalculadoraV2.of(Operacao.SOMA).calcular(2, 3);
		System.out.println("SOMA " + calculo);

		calculo = CalculadoraV2.of(Operacao.SUBTRACAO).calcular(2, 3);
		System.out.println("SUBSTRAÇÃO " + calculo);

		calculo = CalculadoraV2.of(Operacao.DIVISAO).calcular(2, 3);
		System.out.println("DIVISAO " + calculo);

		calculo = CalculadoraV2.of(Operacao.MULTIPLICAO).calcular(2, 3);
		System.out.println("MULTIPLICAÇÃO " + calculo);
	}
}
