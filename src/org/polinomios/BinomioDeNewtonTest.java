package org.polinomios;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BinomioDeNewtonTest {

	@Test
	void test() {
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		Assert.assertEquals(4, binomio.obtenerTerminoK(2), 0);
	}
	
	@Test
	void test2() {
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		Assert.assertEquals(4, binomio.obtenerTerminoKSinPow(2), 0);
	}
	
	@Test
	void testPotencia() {
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		Assert.assertEquals(1048576, binomio.potencia(4, 10), 0);
	}
	
	
	@Test
	void testCoeficientes() {
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		double[] coeficientes = new double[] {4, 12, 9};
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientes(), 0);
	}
	
	@Test
	void testCoeficientes2() {
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] {32, 560, 3920, 13720, 24010, 16807};
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientes(), 0);
	}
	
	@Test
	void testPotenciaRecursiva() {
		BinomioDeNewton bn = new BinomioDeNewton(7, 2, 5);
	}

}
