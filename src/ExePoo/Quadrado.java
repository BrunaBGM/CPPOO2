package ExePoo;

public class Quadrado extends Quadrilateros implements IFormaGeometrica {

	public Quadrado (double tamanhoAltura , double tamanhoBase) {
		
		setAltura(tamanhoAltura);
		setBase(tamanhoBase);
	}
	
	public void setBase (double base) {
		this.base=base;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	@Override
	public double CarcularArea() {
		double areaCalc = this.altura * this.base;
		return areaCalc;
	}
	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}	