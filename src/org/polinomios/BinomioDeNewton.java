package org.polinomios;

public class BinomioDeNewton {
	public double a;
	public double b;
	public double grado;

	/**
	 * @param a     Es el primer termino del binomio (aX + b)^n
	 * @param b     Es el segundo termino del binomio (aX + b)^n
	 * @param grado Es el exponente al cual está elevado el binomio.
	 */
	public BinomioDeNewton(double a, double b, double grado) {
		this.a = a;
		this.b = b;
		this.grado = grado;
	}

	/**
	 * Se resuelve con la fórmula propuesta en el enunciado empleando el método pow
	 * de la clase Math y utilizando el método factorial recursivo.
	 * 
	 * @param k Es el grado del término cuyo coeficiente se desea obtener.
	 * @return Devuelve el valor del coeficiente del término de grado K.
	 */
	public double obtenerCoeficienteK(int k) { //O(1)
		return factorial(this.grado) / (factorial(k) * factorial(this.grado - k)) * Math.pow(this.a, this.grado - k)
				* Math.pow(this.b, k);
	}

	/**
	 * Se resuelve con la fórmula propuesta en el enunciado empleando el método
	 * potencia propio de la clase BinomioDeNewton y utilizando el método factorial
	 * recursivo.
	 * 
	 * @param k Es el grado del término cuyo coeficiente se desea obtener.
	 * @return Devuelve el valor del coeficiente del término de grado K.
	 */
	public double obtenerCoeficienteKSinPow(int k) {
		return factorial(this.grado) / (factorial(k) * factorial(this.grado - k)) * potencia(this.a, this.grado - k)
				* potencia(this.b, k);
	}

	/**
	 * Se resuelve con la fórmula propuesta en el enunciado empleando el método
	 * potenciaRecursivo propio de la clase BinomioDeNewton y utilizando el método
	 * factorial recursivo.
	 * 
	 * @param k Es el grado del término cuyo coeficiente se desea obtener.
	 * @return Devuelve el valor del coeficiente del término de grado K.
	 */
	public double obtenerCoeficienteKRecursivo(int k) {
		return factorial(this.grado) / (factorial(k) * factorial(this.grado - k))
				* potenciaRecursiva(this.a, this.grado - k) * potenciaRecursiva(this.b, k);
	}

	/**
	 * @return Devuelve un array que contiene los coeficientes del polinomio
	 *         obtenido luego de aplicar el teorema del binomio.
	 */
	public double[] obtenerCoeficientes() { // Solo para grados naturales.
		double[] coeficientes = new double[(int) (this.grado + 1)];
		for (int i = (int) this.grado; i >= 0; i--)
			coeficientes[(int) this.grado - i] = obtenerCoeficienteK(i);
		return coeficientes;
	}

	public double[] obtenerCoeficientesSinPow() { // Solo para grados naturales.
		double[] coeficientes = new double[(int) (this.grado + 1)];
		for (int i = (int) this.grado; i >= 0; i--)
			coeficientes[(int) this.grado - i] = obtenerCoeficienteKSinPow(i);
		return coeficientes;
	}

	/**
	 * @return Devuelve un array que contiene los coeficientes del polinomio
	 *         obtenido luego de aplicar el teorema del binomio, aplicando potencia
	 *         recursiva.
	 */
	public double[] obtenerCoeficientesRecursivo() {
		double[] coeficientes = new double[(int) (this.grado + 1)];
		for (int i = (int) this.grado; i >= 0; i--)
			coeficientes[(int) this.grado - i] = obtenerCoeficienteKRecursivo(i);
		return coeficientes;
	}

	/**
	 * Calcula potencias con multiplicaciones sucesivas.
	 * 
	 * @param base
	 * @param exponente
	 * @return Se devuelve la potencia resultante de elevar la base al exponente.
	 */
	public double potencia(double base, double exponente) {
		double resultado = base;
		if (exponente == 0)
			return 1;
		for (; exponente > 1; exponente--)
			resultado *= base;
		return resultado;
	}

	/**
	 * Calcula potencias de forma recursiva.
	 * 
	 * @param base
	 * @param exponente
	 * @return Se devuelve la potencia resultante de elevar la base al exponente.
	 */
	public double potenciaRecursiva(double base, double exponente) {
		if (exponente == 0)
			return 1;
		if (exponente == 1)
			return base;
		return base * potenciaRecursiva(base, exponente - 1);
	}

	/**
	 * Factorial Recursivo
	 * 
	 * @param n Numero a obtener el factorial.
	 * @return Se obtiene el factorial del parámetro n.
	 */
	private double factorial(double n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

}
