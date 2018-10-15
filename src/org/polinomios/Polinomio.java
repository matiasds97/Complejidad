package org.polinomios;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
	// El primer índice es el término de grado n, el ultimo es el término
	// independiente.

	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}

	/**
	 * Calcula el valor de P(x) empleando potencias sucesivas.
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarMSucesivas(double x) { // Complejidad computacional O(n^2)
		double resultadoFinal = 0, potencia = 1;
		for (int i = 0; i < grado; i++) {
			
			for (int j = 0; j < i; j++) {
				potencia = x * x;
				//System.out.println(potencia);
			}
			resultadoFinal += potencia * coeficientes[i];
		}
		resultadoFinal += coeficientes[grado];
		return resultadoFinal;
	}

	/**
	 * Calcula el valor de P(x) empleando potencias recursivas.
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarRecursiva(double x) { // Complejidad computacional O(n^2)
		double resultadoFinal = 0;
		for (int i = 0; i < grado; i++) {
			resultadoFinal += potenciaRec(x, i) * coeficientes[i];

		}
		resultadoFinal += coeficientes[grado];
		return resultadoFinal;
	}

	double potenciaRec(double base, int exp) { // Complejidad computacional O(n)
		if (exp == 0)
			return 1;
		return base * potenciaRec(base, exp - 1);
	}

	/**
	 * Calcula el valor de P(x) empleando potencias recursivas pares.
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarRecursivaPar(double x) { // Complejidad computacional O(n*log[n])
		double resultadoFinal = 0;
		int i;
		for (i = 0; i < grado; i++)
			resultadoFinal += potenciaRec2(x, i) * coeficientes[i];
		resultadoFinal += coeficientes[i];
		return resultadoFinal;
	}

	double potenciaRec2(double base, int exp) { // Complejidad computacional O(log[n])
		if (exp == 0)
			return 1;
		if (exp % 2 == 0)
			return potenciaRec2(base * base, exp / 2);
		else
			return base * potenciaRec2(base, exp - 1);
	}

	/**
	 * Calcula el valor de P(x) empleando programación dinámica.
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarProgDinamica(double x) { // Complejidad computacional O(n)
		double resultadoFinal = 0, potencia = 1;
		for (int i = grado - 1; i >= 0; i--) {
			potencia *= x;
			resultadoFinal += potencia * coeficientes[i];
		}
		resultadoFinal += coeficientes[grado];
		return resultadoFinal;
	}

	/**
	 * Calcula el valor de P(x) empleando programación dinámica.
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarMejorada(double x) { // Complejidad computacional O(n)
		double resultado = 0;
		double[] potencias = new double[(int) this.grado + 1];
		for (int i = 0; i <= this.grado; i++) {
			potencias[i] = potenciaRec(x, this.grado - i);
			resultado += potencias[i] * this.coeficientes[i];
		}
		return resultado;
	}

	/**
	 * Calcula el valor de P(x) empleando potencias con Math.pow().
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarPow(double x) { // Math.Pow() no realiza multiplicaciones sucesivas. Es O(n).
		double resultadoFinal = 0;
		for (int i = 0; i < grado; i++)
			resultadoFinal += Math.pow(x, grado - i) * coeficientes[i];
		resultadoFinal += coeficientes[grado];
		return resultadoFinal;
	}

	/**
	 * Calcula el valor de P(x) empleando el algoritmo de Horner.
	 * 
	 * @param x Valor a evaluar en x.
	 * @return Valor del polinomio evaluado en x.
	 */
	double evaluarHorner(double x) { // O(n)
		double resultadoFinal = 0;
		for (int i = 0; i <= grado; i++)
			resultadoFinal = resultadoFinal * x + coeficientes[i];
		return resultadoFinal;
	}
}
