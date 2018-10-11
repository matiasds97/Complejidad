package org.polinomios;



public class Polinomio {
	private int grado;
	private double [ ] coeficientes;
	//el primer indice es el termino de grado n, el ultimo es el termino independiente. datazo
	
	public Polinomio(int grado, double[] coeficientes) {
		super();
		this.grado = grado;
		this.coeficientes = coeficientes;
	}
	
	
	double evaluarMSucesivas(double x ) { 		//Complejidad computacional O(n^2)	
		double resultadoFinal = 0, potencia=1;
		for(int i =0;i<grado;i++) {
			for(int j =0;j<i;j++)
				potencia = x*x;
			resultadoFinal += potencia * coeficientes[i];
		}
	resultadoFinal += coeficientes[grado];
	return resultadoFinal;
		
	}
	
	double evaluarRecursiva(double x) { 		//Complejidad computacional O(n^2), creo
		double resultadoFinal=0;
		for(int i =0;i<grado;i++)
		{
			resultadoFinal+= potenciaRec(x,i) * coeficientes[i];
			
		}
		resultadoFinal += coeficientes[grado];
		
		return resultadoFinal;
	}
	
	double potenciaRec(double base,int exp) {
		if(exp ==0) return 1;
		return base*potenciaRec(base,exp-1);
	}
	
	
	
	/*
	//puede ser que sea programacion dinamica? quien sabe
	 */
	double evaluarDinamica(double x ) { 	//Complejidad computacional O(n)
		double resultadoFinal = 0, potencia=1;
		for(int i =grado -1;i>=0;i--) {
			potencia *= x;
			resultadoFinal += potencia * coeficientes[i];
		}
	resultadoFinal += coeficientes[grado];
	return resultadoFinal;
	}
	
	double evaluarMejorada(double x) {
		double resultado = 0;
		double[] potencias = new double[(int) this.grado + 1];
		for(int i = 0; i <= this.grado; i++) {
			potencias[i] = potenciaRec(x, this.grado - i);
			resultado += potencias[i] * this.coeficientes[i];
		}
		return resultado;
	}
	
	double evaluarRecursivaPar(double x) { 			//Complejidad final O(n*log[n])
		double resultadoFinal =0;
		int i;
		for(i=0;i<grado;i++)
			resultadoFinal += potenciaRec2(x,i) * coeficientes[i];
		resultadoFinal += coeficientes[i];
		return resultadoFinal;
	}

	 double potenciaRec2(double base, int exp) {	 //Complejidad computacional O(log[n])
		 if(exp==0) 
			 return 1;
		 if(exp%2==0) 
			 return potenciaRec2(base*base,exp/2);
		 else
			 return base*potenciaRec2(base,exp-1);
	}
	 
	 double evaluarPow(double x) { 		 //java math.pow no hace multiplicaciones sucesivas. Es O(1).
		 double resultadoFinal = 0;
		 for(int i=0;i<grado;i++)
			 resultadoFinal += Math.pow(x, grado -i) * coeficientes[i];
		 resultadoFinal += coeficientes[grado];
		 return resultadoFinal;
	 }
	
	 double evaluarHorner(double x) {
		 double resultadoFinal =0;
		 for(int i = 0; i<=grado;i++)
			 resultadoFinal = resultadoFinal*x +coeficientes[i];
		 return resultadoFinal;
	 }
	
	
}
