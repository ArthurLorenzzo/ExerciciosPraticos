package listaExercicios4;

public abstract class AnimalAB implements AnimalF {

	
	protected String nome;
	protected int idade;
	protected String tipoAnimal;
	protected String habitat;
	protected double peso;
	protected double altura;
	
	
	protected int qtdComida;
	protected int distanciaPercorrida;
	protected int tempoDormida;
	
	
	public AnimalAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tipoAnimal = tipoAnimal;
		this.habitat = habitat;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}
	
	
}
