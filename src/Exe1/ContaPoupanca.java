package Exe1;

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
}