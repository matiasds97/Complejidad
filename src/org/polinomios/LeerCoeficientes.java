package org.polinomios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerCoeficientes {
	
	public static double[] leerArchCoeficientes() throws FileNotFoundException {
		File arch = new File("coeficientes.in");
		Scanner sc = new Scanner(arch);
		
		double[] coeficientes = new double[sc.nextInt()];
		
		for(int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = sc.nextInt();
		}
		
		sc.close();
		
//		long res = 0;
//		for(int i = 0; i < coeficientes.length; i++) 
//			res += coeficientes[i];
//		
//		System.out.println(res);
		return coeficientes;
	}
}
