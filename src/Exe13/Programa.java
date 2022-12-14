package Exe13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> valores= new ArrayList<>();
		ArrayList<Double> total = new ArrayList<>();
		
		String path = "C:\\temp\\Lista.txt";
		String newPath = "C:\\temp\\Total.txt";
		
		double valorAux;
		double valor;
		String nome;
		int a = 0;
		int b = 0;
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
			String line = br.readLine();
			
			while (line != null) {
				nomes.add(line);
				line = br.readLine();
			}
		
			String listaNome[] = nomes.toString().split(",");
			nomes.clear();
		
			while (a < 30) {
				if (a == 0 || a%3 == 0 && a!=1) {
					nome = listaNome[a];
					nomes.add(nome);

					
				}else {
					valor = (Float.parseFloat(listaNome[a]));
					valores.add(valor);
				}
				a++;
	           
			}
			
			while(b < 19) {
				valorAux = valores.get(b);
				b++;
				valorAux *= valores.get(b);
				total.add(valorAux);
				b++;
			}
			
		
			
			for (int contador = 0; contador < 10; contador++) {
				bw.write(nomes.get(contador)+ ",");
				bw.write(Double.toString(total.get(contador)));
				bw.newLine();
			}
			
			}catch(IOException e) {
				
				  System.out.println("Erro no arquivo - " + e.getMessage());
			}
	}

}
