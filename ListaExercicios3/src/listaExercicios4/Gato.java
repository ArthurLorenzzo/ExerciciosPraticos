package listaExercicios4;


public class Gato extends AnimalTerrestreAB {

	
	
	
	public Gato(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int patas) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
	}

	@Override
	public void comer() {
		
		qtdComida += 10;
		System.out.println(qtdComida + " foi o que o gato comeu ");
		
	}

	@Override
	public void dormir() {
		
		tempoDormida += 14; 
		System.out.println(qtdComida + " foi a quantidade de horas que o gato dorme ");
		
	}

	@Override
	public void moverse() {
		
		distanciaPercorrida += 12;
		System.out.println(qtdComida + " foi a distancia percorrida pelo gato ");
		
	}

	
	
}
