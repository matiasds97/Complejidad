package org.polinomios;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BinomioDeNewtonTest {
	

	//@Test
	void obtenerCoeficienteK() {
		long startTime;
		long finishTime;
		long totalTime;
		BinomioDeNewton binomio = new BinomioDeNewton(1, 1, 170);
		startTime = System.nanoTime();
		Assert.assertEquals(14364.99, binomio.obtenerTerminoK(2), 0.1);
		finishTime = System.nanoTime();
		totalTime = finishTime - startTime;
		System.out.println("obtenerCoeficienteK:\t\t" + totalTime + "ms");
	}
	
	//@Test
	void obtenerCoeficienteKSinPow() { //No se emplea método Math.pow();
		long startTime;
		long finishTime;
		long totalTime;
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		startTime = System.nanoTime();
		Assert.assertEquals(4, binomio.obtenerTerminoKSinPow(2), 0);
		finishTime = System.nanoTime();
		totalTime = finishTime - startTime;
		System.out.println("obtenerCoeficienteKSinPow:\t" + totalTime + "ns");
		//Sin emplear el método Pow, el rendimiento mejora notablemente.
	}
	
	//@Test 
	void obtenerCoeficienteKRecursivo() {
		long startTime;
		long finishTime;
		long totalTime;
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		startTime = System.nanoTime();
		Assert.assertEquals(4, binomio.obtenerTerminoKRecursivo(2), 0);
		finishTime = System.nanoTime();
		totalTime = finishTime - startTime;
		System.out.println("obtenerCoeficienteKSinPow:\t" + totalTime + "ns");
		//Tarda menos que con pow pero mas que con la potencia directa
	}
	
	//@Test
	void obtenerTodosLosCoeficientes() {
		long startTime;
		long finishTime;
		long totalTime;
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] {32, 560, 3920, 13720, 24010, 16807};
		startTime = System.nanoTime();
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientes(), 0);
		finishTime = System.nanoTime();
		totalTime = finishTime - startTime;
		System.out.println("obtenerTodosLosCoeficientes:\t" + totalTime + "ns");
	}
	
	@Test
	void testCoeficientesSinPow() {
		long startTime;
		long finishTime;
		long totalTime;
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] {32, 560, 3920, 13720, 24010, 16807};
		startTime = System.nanoTime();
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientesSinPow(), 0);
		finishTime = System.nanoTime();
		totalTime = finishTime - startTime;
		System.out.println("obtenerTodosLosCoeficientes2:\t" + totalTime + "ns");
		//Al ser un binomio de mayor grado tarda más tiempo en realizar el cálculo.
	}
	
	//@Test
	void testCoeficienteRecursivo() {
		long startTime;
		long finishTime;
		long totalTime;
		BinomioDeNewton binomio = new BinomioDeNewton(7, 2, 5);
		double[] coeficientes = new double[] {32, 560, 3920, 13720, 24010, 16807};
		startTime = System.nanoTime();
		Assert.assertArrayEquals(coeficientes, binomio.obtenerCoeficientesRecursivo(), 0);
		finishTime = System.nanoTime();
		totalTime = finishTime - startTime;
		System.out.println("obtenerTodosLosCoeficientesRecursivo:\t" + totalTime + "ns");
	}
	
	//@Test
	void testPotencia() {
		BinomioDeNewton binomio = new BinomioDeNewton(3, 2, 2);
		Assert.assertEquals(1048576, binomio.potencia(4, 10), 0);
	}
	
	//@Test
	void testPotenciaRecursiva() {
		BinomioDeNewton bn = new BinomioDeNewton(7, 2, 5);
		Assert.assertEquals(1048576, bn.potenciaRecursiva(4, 10),0);
	}

}
