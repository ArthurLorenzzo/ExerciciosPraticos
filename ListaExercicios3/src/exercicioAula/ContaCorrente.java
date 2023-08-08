package exercicioAula;

public class ContaCorrente {
	
	private String numero;
	private String tipo;
	private Cliente primeiroTitular;
	private Cliente segundoTitular;
	private double saldo;
	private double limiteTotal;
	
	public void credito (double valor) {
		
		this.saldo += valor;	
	}
	
	public void debito (double valor) {
			
			this.saldo -= valor;	
	}
	
	public void resumo() {
		
		System.out.println(this.toString());
		
	}
	
	public String estaDevedor() {
		
		if (saldo < 0) {
			return "Voce esta devedor, fale com seu gerente";
		} else {
			return "Voce esta sem dividas, fique tranquilo";
		}
			
		
	}
	
	

	public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo,
			double limiteTotal) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.primeiroTitular = primeiroTitular;
		this.segundoTitular = segundoTitular;
		this.saldo = saldo;
		this.limiteTotal = limiteTotal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cliente getPrimeiroTitular() {
		return primeiroTitular;
	}

	public void setPrimeiroTitular(Cliente primeiroTitular) {
		this.primeiroTitular = primeiroTitular;
	}

	public Cliente getSegundoTitular() {
		return segundoTitular;
	}

	public void setSegundoTitular(Cliente segundoTitular) {
		this.segundoTitular = segundoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteTotal() {
		return limiteTotal;
	}

	public void setLimiteTotal(double limiteTotal) {
		this.limiteTotal = limiteTotal;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", tipo=" + tipo + ", primeiroTitular=" + primeiroTitular
				+ ", segundoTitular=" + segundoTitular + ", saldo=" + saldo + ", limiteTotal=" + limiteTotal +  ", Esta devedor? " + estaDevedor()  + "]";
	}
	
	
	
	

}
