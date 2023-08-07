package listaExercicios4;

public class Elefante extends AnimalTerrestreAB {

	public Elefante(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int patas) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
	}

	@Override
	public void comer() {
		
		qtdComida += 2;
		System.out.println(qtdComida + " foi o que o elefante comeu ");
		
	}

	@Override
	public void dormir() {
		tempoDormida += 4; 
		System.out.println(qtdComida + " foi a quantidade de horas que o elefante dorme ");
		
	}

	@Override
	public void moverse() {
		
		distanciaPercorrida += 25;
		System.out.println(qtdComida + " foi a distancia percorrida pelo elefante ");
	}

	
	
}
