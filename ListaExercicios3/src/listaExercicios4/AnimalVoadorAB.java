package listaExercicios4;

public abstract class AnimalVoadorAB extends AnimalAB {

	
	int qtdAsas;
	double invergaduraDaAsa;
	
	public AnimalVoadorAB(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int qtdAsas, double invergaduraDaAsa) {
		super(nome, idade, tipoAnimal, habitat, peso, altura);
		this.qtdAsas = qtdAsas;
		this.invergaduraDaAsa = invergaduraDaAsa;
	}
	
	
	
	
}
