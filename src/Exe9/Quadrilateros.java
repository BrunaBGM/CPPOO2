package Exe9;

public abstract class Quadrilateros {

	public int comprimento;
	public int largura;
	public int altura;
	public int base;
	
    public int Comprimento() {
        return comprimento;
    }
 
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
 
    public int getLargura() {
        return largura;
    }
 
    public void setLargura(int largura) {
        this.largura = largura;
    }
 
    public double getAltura() {
        return altura;
    }
 
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
 
    public void setBase(int base) {
        this.base = base;
    }
 
    Quadrilateros(){
       
    }
   
    Quadrilateros(int comprimento, int largura, int altura,int base){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.base = base;
    }
 
     public abstract void CalcularPerimetro();
	
}
