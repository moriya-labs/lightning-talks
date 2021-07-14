package org.soujava;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.Objects;

public class CalculadoraV2 {
	
	private final Calcular calcular;

	private CalculadoraV2(final Calcular calcular) {
		this.calcular = calcular;
	}

	public static CalculadoraV2 of(final Calcular calcular) {
		checkArgument(Objects.nonNull(calcular), "Tipo da operação não informada");
		return new CalculadoraV2(calcular);
	}

	public double calcular(final double numerador, final double denominador) {
		return calcular.calcular(numerador, denominador);
	}
	
	// Outros metodos
}