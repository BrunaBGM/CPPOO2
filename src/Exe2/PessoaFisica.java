package Exe2;

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
	
	public void Imposto(double valor) {
		super.Imposto(valor);
		
		valor=valor + 200;
		this.setFatura();	
	}
} 