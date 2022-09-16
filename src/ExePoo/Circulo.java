package ExePoo;

public class Circulo extends Quadrilateros implements IFormaGeometrica {

	double raio;
	double diametro;
	
	public Circulo (double tamanhoRaio) {
		setRaio(tamanhoRaio);
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	@Override
	public double CarcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalcularPerimetro() {
		double diametroCalc = this.raio * 2;
		setDiametro(diametroCalc);
		double perimetroCalc = diametroCalc * 3.14;
		return perimetroCalc;
	}
}
