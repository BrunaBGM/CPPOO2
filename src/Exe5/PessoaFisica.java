package Exe5;

public class PessoaFisica extends Pessoa{

	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	PessoaFisica(){
		
	}
	
	PessoaFisica(String nome,String telefone,String cpf){
		super(nome,telefone);
		this.cpf=cpf;
	}
	
	public void Auxilio(double valor) {
		
	}
	
	 public void Imposto(double valor, String contribuinte) {
	       this.fatura += valor;
	}
	  
	 public void Imposto(double valor, String contribuinte, String telefoneContribuinte) {
	       this.fatura += valor;
	 }
	
	public void Imposto(double valor) {
		super.Imposto(valor);
		
		valor=valor + 200;
		this.setFatura();	
	}
	

}