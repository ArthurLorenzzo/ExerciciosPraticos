
package listaExercicios4;

public class Pombo extends AnimalVoadorAB {

	public Pombo(String nome, int idade, String tipoAnimal, String habitat, double peso, double altura, int qtdAsas,
			double invergaduraDaAsa) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, qtdAsas, invergaduraDaAsa);
		
	}

	@Override
	public void comer() {
		
		qtdComida += 2;
		System.out.println(qtdComida + " foi o que o pombo comeu ");
		
	}

	@Override
	public void dormir() {
		tempoDormida += 5; 
		System.out.println(qtdComida + " foi a quantidade de horas que o pombo dorme ");
		
	}

	@Override
	public void moverse() {
		
		distanciaPercorrida += 100;
		System.out.println(qtdComida + " foi a distancia percorrida pelo pombo ");
	}
	

	
	
}
