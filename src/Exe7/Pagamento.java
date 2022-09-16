package Exe7;

public class Pagamento extends Pessoa implements PessoaFisica,  PessoaJuridica {


	private double pagamento;
	
	public double getPagamento() {
		return pagamento;
	}
	
	public void setPagamento(double pagamento) {
		this.pagamento=pagamento;
	}
	
	Pagamento(){
		
	}
	
	public Pagamento(String nome,String telefone,double fatura,double pagamento){
			super(nome,telefone,fatura);
		this.pagamento=pagamento;
	}
	
	public void Auxilio(double valor) {
		this.fatura+=valor;
		
	}
	
	public void  Imposto(double valor) {
		this.fatura-=valor;
	}
}
