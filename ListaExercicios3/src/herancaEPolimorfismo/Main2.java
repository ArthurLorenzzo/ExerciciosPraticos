package herancaEPolimorfismo;

public class Main2 {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Cachorro", 0);
		Animal cavalo = new Cavalo("Cavalo", 0);
		Animal preguica = new Preguica("Preguica", 0);
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		

	}

}
