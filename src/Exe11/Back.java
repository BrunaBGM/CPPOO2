package Exe11;

public class Back extends TecnoDesenvolvimento  implements Tecnologia {

		
protected boolean conteinerizar;
		
		
public boolean getConteinerizar() {
			return conteinerizar;
}
		
public void setConteinerizar(boolean conteinerizar) {
			this.conteinerizar=conteinerizar;
}
		
public Back() {
			
}
		
	public Back(String lingProgramacao,String princFramework, String descLinguagem, String descFramework,boolean conteinerizar) {
		super(lingProgramacao,princFramework,descLinguagem, descFramework);
		this.conteinerizar=conteinerizar;
}

@Override
public void DescricaoLinguagem() {
			
}

@Override
public void DescricaoFramework() {

			
	}
}
