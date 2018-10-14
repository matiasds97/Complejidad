package org.polinomios;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BinomioDeNewtonTest {

	@Test
	void obtenerCoeficienteK() {
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		Assert.assertEquals(13720, binomio.obtenerCoeficienteK(2), 0.1);
	}

	@Test
	void obtenerCoeficienteKSinPow() { // No se emplea método Math.pow();
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		Assert.assertEquals(13720, binomio.obtenerCoeficienteKSinPow(2), 0);
		// Sin emplear el método Pow, el rendimiento mejora notablemente.
	}

	@Test
	void obtenerCoeficienteKRecursivo() {
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		Assert.assertEquals(13720, binomio.obtenerCoeficienteKRecursivo(2), 0);
		// Tarda menos que con pow pero mas que con la potencia directa
	}

	@Test
	void obtenerTodosLosCoeficientes() {
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] { 32, 560, 3920, 13720, 24010, 16807 };
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientes(), 0);
	}

	@Test
	void testCoeficientesSinPow() {

		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] { 32, 560, 3920, 13720, 24010, 16807 };
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientesSinPow(), 0);
		// Al ser un binomio de mayor grado tarda más tiempo en realizar el cálculo.
	}

	@Test
	void testCoeficienteRecursivo() {
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] { 32, 560, 3920, 13720, 24010, 16807 };
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientesRecursivo(), 0);
	}

	@Test
	void testPotencia() {
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		Assert.assertEquals(1048576, binomio.potencia(4, 10), 0);
	}

	@Test
	void testPotenciaRecursiva() {
		BinomioDeNewton bn = new BinomioDeNewton(7, 2, 5);
		Assert.assertEquals(1048576, bn.potenciaRecursiva(4, 10), 0);
	}

}
