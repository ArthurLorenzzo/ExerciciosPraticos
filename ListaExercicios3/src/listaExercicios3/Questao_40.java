package listaExercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_40 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDePessoas;
        List<Integer> idades = new ArrayList<>();

        System.out.println("Digite o numero de pessoas do grupo: ");
        numeroDePessoas = Integer.parseInt(scanner.next());

        int idadeAtual;
        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", (i+1));
            idadeAtual = Integer.parseInt(scanner.next());
            idades.add(idadeAtual);
        }
        idades.sort(Integer::compareTo);
        int menorIdade = idades.get(0);
        int maiorIdade = idades.get(idades.size()-1);

        int soma = 0;
        for (var idade : idades){
            soma += idade;
        }
        int media = soma/idades.size();

        System.out.printf("A pessoa mais velha tem %d anos, a mais nova tem %d anos e a media geral das idades é de %d anos.",maiorIdade,menorIdade,media);



    }
}
