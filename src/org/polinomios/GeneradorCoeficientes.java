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
		
		for(int i = 0; i < 1000; i++) {
			pw.println(r.nextInt(1001) - 500);
		}
		
		fw.close();
	}
}