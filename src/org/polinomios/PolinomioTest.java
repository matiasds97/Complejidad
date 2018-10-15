package org.polinomios;

import org.junit.Test;
import org.junit.Assert;

public class PolinomioTest {

	@Test
	public void testMSucesivas() {
		int grado = 4;
		double pol[] = { 5, 2, 3, 4, 2};
		Polinomio polinomio = new Polinomio(grado, pol);
		Assert.assertEquals(16, polinomio.evaluarMSucesivas(1), 0.0);
	}

	@Test
	public void testRecursiva() {
		int grado = 4;
		double pol[] = { 5, 2, 3, 4, 2};
		Polinomio polinomio = new Polinomio(grado, pol);

		Assert.assertEquals(16, polinomio.evaluarRecursiva(1), 0);
	}
	
	@Test
	public void testRecursivaPar() {
		int grado = 4;
		double pol[] = { 5, 2, 3, 4, 2 };
		Polinomio polinomio = new Polinomio(grado, pol);
		Assert.assertEquals(16, polinomio.evaluarRecursivaPar(1), 0);
	}

	@Test
	public void testDinamica() {
		int grado = 4;
		double pol[] = {5, 2, 3, 4, 2};
		Polinomio polinomio = new Polinomio(grado, pol);
		Assert.assertEquals(16, polinomio.evaluarProgDinamica(1), 0);
	}
	
	@Test
		public void testDinamicaMejorada() {
			int grado = 4;
			double pol[] = {5, 2, 3, 4, 2};
			Polinomio polinomio = new Polinomio(grado, pol);
			Assert.assertEquals(16, polinomio.evaluarMejorada(1), 0);
		}

	@Test
	public void testEvaluarPow() {
		int grado = 4;
		double pol[] = {5, 2, 3, 4, 2};
		Polinomio polinomio = new Polinomio(grado, pol);
		Assert.assertEquals(16, polinomio.evaluarPow(1), 0);
	}

	@Test
	public void testEvaluarHorner() {
		int grado = 4;
		double pol[] = {5, 2, 3, 4, 2};
		Polinomio polinomio = new Polinomio(grado, pol);
		Assert.assertEquals(118, polinomio.evaluarHorner(2), 0);
	}

}
