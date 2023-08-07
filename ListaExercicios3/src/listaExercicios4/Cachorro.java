package listaExercicios4;

public class Cachorro extends AnimalTerrestreAB {

	
	
	
	public Cachorro(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int patas) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		
		qtdComida += 5;
		System.out.println(qtdComida + " foi o que o cachorro comeu ");
		
	}

	@Override
	public void dormir() {
		tempoDormida += 6; 
		System.out.println(qtdComida + " foi a quantidade de horas que o cachorro dorme ");
		
	}

	@Override
	public void moverse() {
		
		distanciaPercorrida += 15;
		System.out.println(qtdComida + " foi a distancia percorrida pelo cachorro ");
	}
		
	

}
