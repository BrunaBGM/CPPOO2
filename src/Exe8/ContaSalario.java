package Exe8;

public class ContaSalario extends Conta{
	
	private double depositoEmp;

	 public double DepositoEmp() {
	        return depositoEmp;
	    }
	 
	    public void setDepositoEmp(double depositoEmp) {
	        this.depositoEmp = depositoEmp;
	    }
	   
	    public ContaSalario() {
	    }
	   
	    public ContaSalario(String agencia, String numero, double saldo, double depositoEmp) {
	        super(agencia, numero, saldo);
	        	this.depositoEmp = depositoEmp;
	    }
	    
	    public void Transferir(double saldo) {
	    	this.saldo+=saldo;
	    }
	    
	    public void Sacar(double saldo) {
	    	this.saldo-=saldo;
	    }
	
}
