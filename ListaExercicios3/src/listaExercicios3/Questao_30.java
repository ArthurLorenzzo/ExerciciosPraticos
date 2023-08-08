package listaExercicios3;

import java.util.Scanner;

public class Questao_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as coordenadas do primeiro retângulo:");
        System.out.print("Ponto 1 (x y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Ponto 2 (x y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Retangulo retangulo1 = new Retangulo(new Ponto(x1, y1), new Ponto(x2, y2));

        System.out.println("Informe as coordenadas do segundo retângulo:");
        System.out.print("Ponto 1 (x y): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        System.out.print("Ponto 2 (x y): ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
        Retangulo retangulo2 = new Retangulo(new Ponto(x3, y3), new Ponto(x4, y4));


        if (retangulo1.verificarSeIntercepta(retangulo2)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }
}

class Ponto {
    double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Retangulo {
    Ponto esquerdaSuperior, direitaInferior;

    public Retangulo(Ponto p1, Ponto p2) {
        double minX = Math.min(p1.x, p2.x);
        double minY = Math.min(p1.y, p2.y);
        double maxX = Math.max(p1.x, p2.x);
        double maxY = Math.max(p1.y, p2.y);

        this.esquerdaSuperior = new Ponto(minX, maxY);
        this.direitaInferior = new Ponto(maxX, minY);
    }

    public boolean verificarSeIntercepta(Retangulo other) {
        if (this.esquerdaSuperior.x > other.direitaInferior.x || other.esquerdaSuperior.x > this.direitaInferior.x) {
            return false;
        }
        if (this.esquerdaSuperior.y < other.direitaInferior.y || other.esquerdaSuperior.y < this.direitaInferior.y) {
            return false;
        }
        return true;
    }
}

