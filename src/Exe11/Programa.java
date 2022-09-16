package Exe11;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa extends TecnoDesenvolvimento{
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
	
	ArrayList<Back>listaBackend = new ArrayList<Back>();
	ArrayList<Front>listaFrontend = new ArrayList<Front>();
		
	int qtd;
	String opcao;
	boolean comparador;
	
	try {
	System.out.printf("Deseja cadastrar quantas tecnologias? ");
	qtd = ler.nextInt();
		
	for(int i=0; i < qtd; i++) {
		System.out.printf("Deseja cadastrar: Frontend ou Backend? ");
		opcao = ler.next();
		opcao = opcao.replaceAll("\\s+","");
		opcao = opcao.toUpperCase();
				
	if(opcao.equals("BACKEND") || opcao.equals("BACK")) {						
			Back b = new Back();
					
			System.out.printf("Digite a linguagem de programacao: ");
			String lingProgramacao = ler.next();
			b.setLingProgramacao(lingProgramacao);
					
			System.out.printf("Digite um framework: ");
			String princFramework = ler.next();
			b.setPrincFramework(princFramework);
					
			System.out.printf("Digite uma descri��o da linguagem: ");
			String descLinguagem = ler.next();
			b.setDescLinguagem(descLinguagem);
					
			System.out.printf("Digite uma descri��o do framework: ");
			String descFramework = ler.next();
			b.setDescFramework(descFramework);
								
			System.out.printf("Faz conteiniriza��o: Sim/Nao ");
			String cont=ler.next();
			
					cont.toUpperCase();	
					
			if(cont.equals("SIM")) {
				b.setConteinerizar(true);
				listaBackend.add(b);
				
			}
			else {

			}
							
			listaBackend.add(b);	
			
		} else if (opcao.equals("FRONTEND") || opcao.equals("FRONT")) {	
			
			Front f = new Front();
			
			
		 	System.out.printf("Digite a linguagem de programacao: ");
			String lingProgramacao = ler.next();
			f.setLingProgramacao(lingProgramacao);
								
			System.out.printf("Digite um framework: ");
			String princFramework = ler.next();
			f.setPrincFramework(princFramework);
								
			System.out.printf("Digite uma descri��o da linguagem: ");
			String descLinguagem = ler.next();
			f.setDescLinguagem(descLinguagem);
								
			System.out.printf("Digite uma descri��o do framework: ");
			String descFramework = ler.next();
			f.setDescFramework(descFramework);
								
			System.out.printf("� compat�vel com Web ou � compat�vel com Mobile? \n");
			comparador=ler.next() != null;
			
			Front.Comparar(true);
			
			
			listaFrontend.add(f); 
		}
		else {							
				System.out.print("Linguagem n�o encontrada!");
			}
	    
	}	
	for( Back b : listaBackend) {
		System.out.printf("Linguagem: %s \nFramework: %s \nDescri��o da Linguagem: %s \nDescri��o do framework: %s \nConteiniriza��o: %b", b.getLingProgramacao(),b.getPrincFramework(),b.getDescLinguagem(),b.getDescFramework(), b.getConteinerizar());
    }	
	for( Front f : listaFrontend) {
		System.out.printf("Linguagem: %s \nFramework: %s \nDescri��o da Linguagem: %s \nDescri��o do framework: %s \nCompatibilidade %b", f.getLingProgramacao(),f.getPrincFramework(),f.getDescLinguagem(),f.getDescFramework(), f.getCompatibilidade());						
	}
	
		}  catch(Exception e) {
        System.out.println("Erro no sistema!" + e.getMessage());
    }
	
	 finally {
		 
		 System.out.println("Fim do programa");

	    }
	
  }
}


