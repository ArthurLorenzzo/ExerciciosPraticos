package listaExercicios3;

public class Questao_52 {
    public static void main(String[] args) {
        int totalGraos = 0;

        for (int casa = 1; casa <= 64; casa++) {
            totalGraos += Math.pow(2, casa - 1);
        }

        int graosPorSaco = 1000000;
        int totalSacos = totalGraos / graosPorSaco;

        System.out.println("Total de grãos de arroz: " + totalGraos);
        System.out.println("Total de sacos de arroz: " + totalSacos);
    }
}
