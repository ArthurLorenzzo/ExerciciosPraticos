public class Questao52 {
    public static void main(String[] args) {
        int totalGr�os = 0;

        for (int casa = 1; casa <= 64; casa++) {
            totalGr�os += Math.pow(2, casa - 1);
        }

        int gr�osPorSaco = 1000000;
        int totalSacos = totalGr�os / gr�osPorSaco;

        System.out.println("Total de gr�os de arroz: " + totalGr�os);
        System.out.println("Total de sacos de arroz: " + totalSacos);
    }
}
