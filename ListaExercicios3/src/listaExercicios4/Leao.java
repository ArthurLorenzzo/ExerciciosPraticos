package listaExercicios4;

public class Leao extends AnimalTerrestreAB{

	
	public Leao(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int patas) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
	}

	@Override
	public void comer() {
		
		qtdComida += 10;
		System.out.println(qtdComida + " foi o que o Leão comeu ");
		
	}

	@Override
	public void dormir() {
		tempoDormida += 16; 
		System.out.println(qtdComida + " foi a quantidade de horas que o Leão dorme ");
		
	}

	@Override
	public void moverse() {
		
		distanciaPercorrida += 2;
		System.out.println(qtdComida + " foi a distancia percorrida pelo Leão ");
	}
	
	
}
