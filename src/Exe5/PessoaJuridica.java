package Exe5;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
	PessoaJuridica(){
		
	}
	
	PessoaJuridica(String nome,String telefone,String cnpj){
		super(nome,telefone);
		this.cnpj=cnpj;
	}
	
	public void Auxilio(double valor) {
		
	}
	
	public void Imposto(double valor) {
		super.Imposto(valor);
		
		valor = valor + 2.000;
		this.setFatura();
	}
}
