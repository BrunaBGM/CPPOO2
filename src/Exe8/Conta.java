package Exe8;

public class Conta {

	   protected String agencia;
	   protected String numero;
	   protected double saldo;
	  
	   public String getAgencia() {
	       return agencia;
	   }

	   public void setAgencia(String agencia) {
	       this.agencia = agencia;
	   }

	   public String getNumero() {
	       return numero;
	   }

	   public void setNumero(String numero) {
	       this.numero = numero;
	   }

	   public double getSaldo() {
	       return saldo;
	   }

	   public void setSaldo(double saldo) {
	       this.saldo = saldo;
	   }

	   
	   Conta(){
	      
	   }
	  
	   Conta(String agencia, String numero, double salario){
	       this.agencia = agencia;
	       this.numero = numero;
	       this.saldo = salario;
	   }
	  
	   public void Deposito(double valor) {
		   this.saldo += saldo;
	   }
	  
	   public void Deposito(double valor, String cliente) {
	       this.saldo += valor;
	   }
	  
	   public void Deposito(double valor, String cliente, String telefoneCliente) {
	       this.saldo+= valor;
	   }

}
