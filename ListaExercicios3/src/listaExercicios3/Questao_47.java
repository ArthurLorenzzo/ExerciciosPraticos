package listaExercicios3;

import java.util.Scanner;

public class Questao_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadePacientes = 0;
        int totalIdadeHomens = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheresAlturaPeso = 0;
        int quantidadeIdade18a25 = 0;
        int idadeMaisVelho = 0;
        String nomeMaisVelho = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;
        String nomeMulherMaisBaixa = "";
        
        int limiteIMC = 25;
        
        System.out.println("Informe os dados dos pacientes. Digite \"fim\" no nome do �ltimo paciente.");
        
        while (true) {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            
            scanner.nextLine(); 
            
            quantidadePacientes++;
            
            if (sexo == 'M') {
                totalIdadeHomens += idade;
                quantidadeHomens++;
            }
            
            if (sexo == 'F' && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                quantidadeMulheresAlturaPeso++;
            }
            
            if (idade >= 18 && idade <= 25) {
                quantidadeIdade18a25++;
            }
            
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }
            
            if (sexo == 'F' && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }
            
            double imc = peso / (altura * altura);
            if (imc > limiteIMC) {
                System.out.println("Aten��o, " + nome + "! Seu IMC est� acima do limite recomendado.");
            }
        }
        
        System.out.println("Relat�rio da Cl�nica");
        System.out.println("Quantidade de pacientes: " + quantidadePacientes);
        
        if (totalIdadeHomens > 0) {
            double mediaIdadeHomens = (double) totalIdadeHomens / quantidadeHomens;
            System.out.println("M�dia de idade dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("N�o h� pacientes homens.");
        }
        
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadeIdade18a25);
        
        if (!nomeMaisVelho.isEmpty()) {
            System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
        } else {
            System.out.println("N�o h� pacientes.");
        }
        
        if (!nomeMulherMaisBaixa.isEmpty()) {
            System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
        } else {
            System.out.println("N�o h� mulheres.");
        }
        
        scanner.close();
    }
}
