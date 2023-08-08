package heranca;

public class Main {

	public static void main(String[] args) {
		
		Fornecedor p1 = new Fornecedor("Jose", "Avenida", "11947028029", 100, 200);
		
		p1.obterSaldo();

//		Testando Classe Administrador
		Administrador adm = new Administrador("Gustavo", "São Paulo", "(11)99999-9999",
				5, 5000.0, 10.0, 1000.0);

		System.out.println("Nome: " + adm.getNome());
		System.out.println("Endereço: " + adm.getEndereco());
		System.out.println("Telefone: " + adm.getTelefone());
		System.out.println("Código setor: " + adm.getCodigoSetor());
		System.out.println("Salário base: " + adm.getSalarioBase());
		System.out.println("Imposto: " + adm.getImposto());
		System.out.println("Ajuda de custo: " + adm.getAjudaDeCusto());
		System.out.println("Salário total: " + adm.calcularSalario());

	}

}
