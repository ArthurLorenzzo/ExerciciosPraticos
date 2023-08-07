import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Questao_35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listaDeNumeros = new ArrayList<>();
        Integer tamanhoDaLista;
        int valorMin;
        int valorMax;


        System.out.print("Digite o tamanho da lista de números aleatórios: ");
        tamanhoDaLista = Integer.parseInt(scanner.next());
        System.out.print("Digite o valor minimo dessejado: ");
        valorMin = Integer.parseInt(scanner.next());
        System.out.print("Digite o valor maximo dessejado: ");
        valorMax = Integer.parseInt(scanner.next());

        Random geradorDeNumeros = new Random();
        int numeroAleatorio;

        for (int i = 0; i < tamanhoDaLista; i++) {
             numeroAleatorio = geradorDeNumeros.nextInt(valorMin,(valorMax+1));
            listaDeNumeros.add(numeroAleatorio);
        }

        System.out.println(listaDeNumeros);

    }
}
