package Exe6;

public class ContaPoupanca extends Conta{
    private double rentabilidade;
 
    public double getRentabilidade() {
        return rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupanca() {
    }
   
    public ContaPoupanca(String agencia, String numero, double salario, double rentabilidade) {
        super(agencia, numero, salario);
       
        this.rentabilidade = rentabilidade;
    }
    
    public void Juros() {
    	
    }
    
    public void Deposito(double valor) {
	 	super.Deposito(valor);
	 	
	 	valor = valor - 100.00;
	 	this.setSaldo(valor);
 }
}