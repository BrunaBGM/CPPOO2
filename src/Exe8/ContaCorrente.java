package Exe8;

public class ContaCorrente extends Conta implements ContaPoupanca {
	
	private double chequeEspecial;

	 public double getChequeEspecial() {
	        return chequeEspecial;
	    }
	 
	    public void setChequeEspecial(double chequeEspecial) {
	        this.chequeEspecial = chequeEspecial;
	    }
	   
	    public ContaCorrente() {
	    }
	   
	    public ContaCorrente(String agencia, String numero, double saldo, double chequeEspecial) {
	        super(agencia, numero, saldo);
	        	this.chequeEspecial = chequeEspecial;
	    }
	    
	    public void Transferir(double saldo) {
	    	this.saldo+=saldo;
	    }
	    
	    public void Sacar(double saldo) {
	    	this.saldo-=saldo;
	    }
	
}
