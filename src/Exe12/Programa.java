package Exe12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Programa {


		public static void main(String[] args) {
			String nome;
			int unidade;
			double preco;
			
			
			Scanner sc = new Scanner (System.in);
			
			
			
			String path = "C:\\temp\\Lista.txt";
			
			
			 try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
				 
				 for (int i = 0 ; i < 2 ; i++) {
					 System.out.println("Digite o nome do produto: ");
					 nome = sc.next();
				
					 bw.write(nome + ",");
					 
					 System.out.println("Digite a unidade do produto: ");
					 unidade = sc.nextInt();
					 bw.write(Integer.toString(unidade)+ ",");
			
					 
					 System.out.println("Digite o preço do produto: ");
					 preco = sc.nextDouble();
					 bw.write(Double.toString(preco));
				
					 
					 bw.newLine();
				 }
		     }
			  catch( IOException e) {
				  
				  System.out.println("Erro no arquivo - " + e.getMessage());

			  }
			 
			 sc.close();
		}

}
