package ExePoo;

public class Retangulo extends Quadrilateros implements IFormaGeometrica {
	
	double lado;

	public Retangulo(double altura , double lado) {
		
		setLado(lado);
		setAltura(altura);
	}
	
	public void setLado (double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	@Override
	public double CarcularArea() {		
		double areaCalc = this.altura * this.lado;
		return areaCalc;
	}

	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}