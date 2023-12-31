package exercicioAula;

public class Cliente {
	
	private String cpf;
	private String nome;
    private String endereco;
    private String anoNascimento;

    public Cliente(String cpf, String nome, String endereco, String anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", anoNascimento=" + anoNascimento
				+ "]";
	}

    
    

}
