package ExePoo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Circulo> listaCirculos = new ArrayList<Circulo>();
		ArrayList<Quadrado> listaQuadrados = new ArrayList<Quadrado>();
		ArrayList<Retangulo> listaRetangulos = new ArrayList<Retangulo>();
		
		int quantidade;
		String opcao;	
		
	try {
		System.out.printf("Quantas formas deseja criar?");
		quantidade = ler.nextInt();
		
		for (int i=0; i < quantidade; i++) {	
			
			System.out.printf("Deseja criar: circulo, quadrado ou retângulo?");
			opcao = ler.next();
			opcao = opcao.replaceAll("\\s+","");
			opcao = opcao.toUpperCase();
			
			if(opcao.equals("CIRCULO")) {	
				
				System.out.printf("Digite o tamanho do raio: ");
				double raio = ler.nextDouble();	
				
				Circulo c = new Circulo(raio);			
				listaCirculos.add(c);
					
			}else if(opcao.equals("QUADRADO")) {
				
				System.out.printf("Digite o tamanho do altura: ");
				double altura = ler.nextDouble();
				
				System.out.printf("Digite o tamanho do base: ");
				double base = ler.nextDouble();
				
				Quadrado quadrado = new Quadrado(altura, base);
				listaQuadrados.add(quadrado);			
				
			}else if(opcao.equals("RETANGULO"))  {
				
				System.out.printf("Digite o tamanho do altura: ");
				double altura = ler.nextDouble();
				
				System.out.printf("Digite o tamanho do lado: ");
				double lado = ler.nextDouble();
				
				Retangulo retangulo = new Retangulo(altura, lado);
				listaRetangulos.add(retangulo);			
			}else {
				System.out.print("Forma geométrica não encontrada!");
			}
		}
		
		for(Circulo c: listaCirculos) {
			System.out.printf("Circulo -> Raio: %f, Perimetro: %f, Diametro: %f ", c.getRaio(), c.CalcularPerimetro(), c.getDiametro());
			System.out.printf("\n");
		}
		
		for(Quadrado q: listaQuadrados) {
			System.out.printf("Quadrado -> Altura: %f , Base: %f , Area: %f", q.getAltura(),q.getBase(),q.CarcularArea());
			System.out.printf("\n");
	}
		for(Retangulo r: listaRetangulos) {
			System.out.printf("Retângulo -> Altura: %f, Lado: %f, Area: %f", r.getAltura(), r.getLado(), r.CarcularArea());
			System.out.printf("\n");	
		}
		
	}
	catch(Exception e) {
		 System.out.println("Erro no sistema!" + e.getMessage());
    }
    finally {
    	 System.out.println("Fim do programa");
    }

  }
}