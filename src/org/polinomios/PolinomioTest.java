package org.polinomios;
import org.junit.Test;
import org.junit.Assert;
public class PolinomioTest {
	
	@Test
	public void testMSucesivas() {
		int grado =2;
		double pol[] = {1,1,2};
		
		Polinomio cuadrado = new Polinomio(grado,pol);
		
		Assert.assertEquals(4, cuadrado.evaluarMSucesivas(1),0.0);
	}
	
	@Test
	public void testRecursiva() {
		int grado = 2;
		double pol[] = {1, 1, 2};
		Polinomio cuadrado = new Polinomio(grado,pol);
		
		Assert.assertEquals(4, cuadrado.evaluarRecursiva(1), 0);
	}
	
	@Test 
	public void testDinamica() {
		int grado = 2;
		double pol[] = {1, 1, 2};
		Polinomio cuadrado = new Polinomio(grado,pol);
		Assert.assertEquals(4, cuadrado.evaluarDinamica(1), 0);
	}

	
	@Test
	public void testRecursiva2() {
		int grado =2;
		double pol[] = {1, 1, 2};
		Polinomio cuadrado = new Polinomio(grado,pol);
		
		Assert.assertEquals(4, cuadrado.evaluarHorner(1), 0);
		
		Assert.assertEquals(4, cuadrado.evaluarRecursivaPar(1), 0);
	}
	
	@Test
	public void testPow() {
		int grado = 2;
		double pol[] = {1, 1, 2};
		Polinomio cuadrado = new Polinomio(grado,pol);
		Assert.assertEquals(4, cuadrado.evaluarPow(1), 0);
	}
	
	@Test
	public void testHorner() {
		int grado = 2;
		double pol[] = {1,1,2};
		Polinomio cuadrado = new Polinomio(grado,pol);
		Assert.assertEquals(8, cuadrado.evaluarHorner(2),0);
	}
	
}
