package herancaEPolimorfismo;

public class Veterinario {

	public void examinar(Animal animal) {
		System.out.print("Examinando " + animal.getNome() + " ");
		animal.emitirSom();

	}

}
