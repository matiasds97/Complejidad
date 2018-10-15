package org.polinomios;

import org.junit.Test;

import java.io.FileNotFoundException;

import org.junit.Assert;

public class PolinomioTest {

	long ini;

	//@Test
	public void testMSucesivas() throws FileNotFoundException {
		
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarMSucesivas(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion MSucesivas (ms) = " + (tFin - tIni));
	}

	//@Test
	public void testRecursiva() throws FileNotFoundException{
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarRecursiva(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion Recursiva (ms) = " + (tFin - tIni));
	}

	//@Test
	public void testRecursivaPar() throws FileNotFoundException{
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarRecursivaPar(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion RecursivaPar (ms) = " + (tFin - tIni));
	}

	//@Test
	public void testDinamica() throws FileNotFoundException{
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarProgDinamica(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion ProgDinamica (ms) = " + (tFin - tIni));
	}

	@Test
	public void testDinamicaMejorada() throws FileNotFoundException{
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarMejorada(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion Mejorada (ms) = " + (tFin - tIni));
	}

	//@Test
	public void testEvaluarPow() throws FileNotFoundException{
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarPow(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion Pow (ms) = " + (tFin - tIni));
	}

	//@Test
	public void testEvaluarHorner() throws FileNotFoundException{
		double[] pol = LeerCoeficientes.leerArchCoeficientes();
		int grado = pol.length - 1;
		Polinomio polinomio = new Polinomio(grado, pol);
		
		long tIni = System.currentTimeMillis();
		Assert.assertEquals(-26551, polinomio.evaluarHorner(1), 0.0);
		long tFin = System.currentTimeMillis();
		
		System.out.println("Tiempo de ejecucion Horner (ms) = " + (tFin - tIni));
	}

}
