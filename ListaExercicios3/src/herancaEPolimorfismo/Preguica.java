package herancaEPolimorfismo;

public class Preguica extends Animal{


    protected Preguica(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public void emitirSom() {
        System.out.println("Som de preguiça!");
    }

    public void subirEmArvore(){

    }
}
