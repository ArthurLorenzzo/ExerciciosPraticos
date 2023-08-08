package herancaEPolimorfismo;

import java.util.ArrayList;

public class Zoologico {
    public static void main(String[] args) {

        ArrayList<Animal> jaulas = new ArrayList<>() {
            {
                add(new Cachorro("Cachorro1", 10));
                add(new Cachorro("Cachorro2", 9));
                add(new Cachorro("Cachorro3", 6));
                add(new Cachorro("Cachorro4", 5));
                add(new Cavalo("Cavalo1", 7));
                add(new Cavalo("Cavalo2", 8));
                add(new Cavalo("Cavalo3", 2));
                add(new Preguica("Preguica1", 3));
                add(new Preguica("Preguica2", 1));
                add(new Preguica("Preguica3", 4));
            }
        };

        jaulas.forEach(x -> {
            System.out.println("Animal: " + x.getNome());
            System.out.print("Som: ");
            x.emitirSom();
            if (x instanceof Cachorro cachorro) {
                cachorro.correr();
            }
            if (x instanceof Cavalo cavalo) {
                cavalo.correr();
            }
            System.out.println();
        });
    }
}
