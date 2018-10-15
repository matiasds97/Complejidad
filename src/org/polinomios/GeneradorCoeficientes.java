package org.polinomios;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import org.junit.Test;

public class GeneradorCoeficientes {
	
	@Test
	public void generar() throws IOException {
		FileWriter fw = new FileWriter("coeficientes.in");
		PrintWriter pw = new PrintWriter(fw);
		Random r = new Random();
		
		pw.println(10000); //Imprime la cantidad de coeficientes que hay
		
		for(int i = 0; i < 10000; i++) {
			pw.println(r.nextInt(1001) - 500);
		}
		
		fw.close();
	}
}