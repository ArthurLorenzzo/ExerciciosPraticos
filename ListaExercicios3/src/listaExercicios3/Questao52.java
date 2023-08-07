public class Questao52 {
    public static void main(String[] args) {
        int totalGrãos = 0;

        for (int casa = 1; casa <= 64; casa++) {
            totalGrãos += Math.pow(2, casa - 1);
        }

        int grãosPorSaco = 1000000;
        int totalSacos = totalGrãos / grãosPorSaco;

        System.out.println("Total de grãos de arroz: " + totalGrãos);
        System.out.println("Total de sacos de arroz: " + totalSacos);
    }
}
