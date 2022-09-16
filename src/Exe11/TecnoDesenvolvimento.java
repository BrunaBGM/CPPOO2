package Exe11;

public abstract class TecnoDesenvolvimento {
	
	protected String lingProgramacao;
	protected String princFramework;
	protected String descLinguagem;
	protected String descFramework;

	protected String getLingProgramacao() {
		return lingProgramacao;
	}
	
	protected void setLingProgramacao(String lingProgramacao) {
		this.lingProgramacao=lingProgramacao;
	}
	
	protected String getPrincFramework() {
		return princFramework;
	}
	
	protected void setPrincFramework(String princFramework) {
		this.princFramework=princFramework;
	}
	
	protected String getDescLinguagem() {
		return descLinguagem;
	}
	
	protected void setDescLinguagem(String descLinguagem) {
		this.descLinguagem=descLinguagem;
	}
	
	protected String getDescFramework() {
		return descFramework;
	}
	
	protected void setDescFramework(String descFramework) {
		this.descFramework=descFramework;
	}
	
	TecnoDesenvolvimento(){
		
	}
	
	TecnoDesenvolvimento(String lingProgramacao,String princFramework, String descLinguagem, String descFramework){
		this.lingProgramacao=lingProgramacao;
		this.princFramework=princFramework;
		this.descLinguagem=descLinguagem;
		this.descFramework=descFramework;
	}

}