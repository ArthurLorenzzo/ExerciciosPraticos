package herancaEPolimorfismo;

public class Cachorro extends Animal{


    protected Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void correr(){
        System.out.println(this.getNome() + " correu!");
    }
}
