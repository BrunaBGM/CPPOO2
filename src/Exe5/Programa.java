package Exe5;

import java.util.Scanner;

			public class Programa {

			public static void main(String[] args) {
				
				Scanner ler = new Scanner(System.in);
				try {
				
				PessoaFisica pf = new PessoaFisica();
				
				pf.setNome("Bruna");
				pf.setTelefone("1112345678");
				pf.setCpf("1234567891011");
				pf.Imposto(0);
				
				System.out.printf("Nome: %s, Telefone: %s, CPF: %s ", pf.getNome(),pf.getTelefone(),pf.getCpf());
				
				
				PessoaJuridica pj = new PessoaJuridica();
				
				pj.setNome("Puzzle Game Bar");
				pj.setTelefone("1112345678");
				pj.setCnpj("0123456789");
				pj.Imposto(0);

				System.out.printf("\n\nEmpresa: %s, Telefone: %s, CNPJ: %s", pj.getNome(),pj.getTelefone(),pj.getCnpj());

			}
			
			catch( Exception e) {
				  
				  System.out.println("Erro no arquivo - " + e.getMessage());

			 }

		}

}