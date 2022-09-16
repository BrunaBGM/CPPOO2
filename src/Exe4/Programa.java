package Exe4;

import java.util.Scanner;

import Exe1.ContaCorrente;
import Exe1.ContaPoupanca;

public class Programa {
	 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try {
       
        ContaCorrente cc = new ContaCorrente();
       
        cc.setAgencia("0001");
        cc.setNumero("14769");
        cc.Depositar(100);
       
        cc.setChequeEspecial(500);
       
        System.out.printf("Conta Corrente: Ag: %s, Num: %s, Saldo: %.2f, Chq Esp: %.2f", cc.getAgencia(), cc.getNumero(), cc.getSaldo(), cc.getChequeEspecial());
       
       
        ContaPoupanca cp = new ContaPoupanca();
       
        cp.setAgencia("0002");
        cp.setNumero("32456");
        cp.Depositar(100);
       
        cp.setRentabilidade(2);
        
        System.out.printf("\nConta Poupança: Ag: %s, Num: %s, Saldo: %.2f, Rent: %.2f", cc.getAgencia(), cc.getNumero(), cc.getSaldo(), cp.getRentabilidade());
    
    }
	catch( Exception e) {
		  
		  System.out.println("Erro no arquivo - " + e.getMessage());

	 }
  }
}