package Exe7;

public class Pessoa {

	protected String nome;
	protected String telefone;
	protected double fatura;
	
	
	public String getNome() {
		return nome;	
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public double setFatura() {
		return fatura;
	}
	
	public void getFatura(double fatura) {
		this.fatura=fatura;
	}
	
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}
	
		Pessoa(){
		}
		
		Pessoa(String nome,String telefone,double fatura){
			this.nome=nome;
			this.telefone=telefone;	
	}
		public void Imposto(double valor) {
			this.fatura += valor;
	}
		
		public void Imposto(double valor, String contribuinte) {
		       this.fatura += valor;
	}
		  
		public void Imposto(double valor, String contribuinte, String telefoneContribuinte) {
		       this.fatura += valor;
	}
}