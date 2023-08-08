package herancaEPolimorfismo;

public class Main {

	public static void main(String[] args) {
		Veterinario veterinario  = new Veterinario();
		
		Cachorro cachorro = new Cachorro("Rex" , 20);
		Cavalo cavalo = new Cavalo ("Thor" , 30);
		Preguica preguica = new Preguica("Ramon" , 5);
		
		veterinario.examinar(preguica);
		veterinario.examinar(cavalo);
		veterinario.examinar(cachorro);

	}

}
