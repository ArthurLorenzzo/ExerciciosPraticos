package heranca;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;
	
	
	public void obterSaldo() {
		
		double diferenca = valorCredito - valorDivida;
		System.out.println("A diferença entre Credito e divida é " + diferenca);
		
	}
	
	
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	
}
