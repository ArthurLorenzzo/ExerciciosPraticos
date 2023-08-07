package listaExercicios4;

public abstract class AnimalTerrestreAB extends AnimalAB {

	
	protected int qtdPatas;
	
	
	public AnimalTerrestreAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int patas) {
		super(nome, idade, tipoAnimal, habitat, peso, altura);
		this.qtdPatas = patas;
	}
	
	
	

	

	
	
}
