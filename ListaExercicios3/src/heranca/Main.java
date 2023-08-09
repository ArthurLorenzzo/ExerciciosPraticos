package heranca;

public class Main {

	public static void main(String[] args) {
		
		Fornecedor p1 = new Fornecedor("Jose", "Avenida", "11947028029", 100, 200);

		p1.obterSaldo();

		System.out.println("-------------------------");

//		Testando Classe Administrador
		System.out.println("*** ADMINISTRADOR ***");
		Administrador adm = new Administrador("Gustavo", "São Paulo", "(11)99999-9999",
				5, 5000.0, 10.0, 1000.0);

		System.out.println(adm.toString());
		System.out.println("Salário total: " + adm.calcularSalario());

		System.out.println("-------------------------");

//		Testando Classe Operário
		System.out.println("*** OPERÁRIO ***");
		Operario op = new Operario("Jonas", "Bahia", "(11)11111-1111",
				8, 3000.0, 5.0, 1500.0, 2.5);

		System.out.println(op.toString());
		System.out.println("Salário total: " + op.calcularSalario());

		System.out.println("-------------------------");
		
		System.out.println("*** VENDEDOR ***");
		Vendedor vend = new Vendedor("Andre", "Rio de Janeiro", "(11)2222-1111", 10, 4000.0, 2.0, 3000.0, 5.0);

		System.out.println(vend.toString());
		System.out.println("Salário total: " + vend.calcularSalario());

		System.out.println("-------------------------");
	}
}
