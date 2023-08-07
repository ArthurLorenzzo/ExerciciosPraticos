
package listaExercicios4;

public class Peixe extends AnimalMarinhoAB {

	public Peixe(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura) {
		super(nome, idade, tipoAnimal, habitat, peso, altura);
	}

	@Override
	public void comer() {
		
		qtdComida += 1;
		System.out.println(qtdComida + " foi o que o peixe comeu ");
		
	}

	@Override
	public void dormir() {
		tempoDormida += 0; 
		System.out.println(qtdComida + " foi a quantidade de horas que o peixe dorme ");
		
	}

	@Override
	public void moverse() {
		
		distanciaPercorrida += 50;
		System.out.println(qtdComida + " foi a distancia percorrida pelo peixe ");
	}
	
	

}
