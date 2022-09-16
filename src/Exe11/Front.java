package Exe11;

public class Front extends TecnoDesenvolvimento implements Tecnologia{
	
	protected boolean compatibilidade;
	
	
public boolean getCompatibilidade() {
		return compatibilidade;
}
	
public void setCompatibilidade(boolean compatibilidade) {
		this.compatibilidade=compatibilidade;
} 
	
	public Front() {
		
	}
	
	public Front(String lingProgramacao,String princFramework,String descLinguagem,String descFramework,boolean compatibilidade) {
			super(lingProgramacao,princFramework,descLinguagem, descFramework);
			this.compatibilidade=compatibilidade;
			
	}
	
	static void Comparar(boolean comparador) {
		System.out.printf("Compatível: ");
		if(comparador == true) {
			
			System.out.printf("É compatível com Web");
		}else {
			System.out.printf("É compatível com Mobile");
		}

	 }
	
	@Override
	public void DescricaoLinguagem() {
		
		
	}

	@Override
	public void DescricaoFramework() {
		
		
	}
}
