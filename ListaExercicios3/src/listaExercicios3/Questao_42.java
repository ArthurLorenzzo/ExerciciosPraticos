package listaExercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questao_42 {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("---Gerando 40 grupos com 3 n�meros em ordem crescente!---");
        
        for (int i = 1; i <= 40; i++) {
            List<Integer> grupo = new ArrayList<>();
            
            for (int j = 0; j < 3; j++) {
                int numeroSorteado = random.nextInt(60);
                grupo.add(numeroSorteado);
            }
            
            grupo.sort(null);
            
            System.out.print("Grupo " + i + ": ");
            for (int numero : grupo) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
        
    }
}
