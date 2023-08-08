package herancaEPolimorfismo;

public class Funcionario {

    private String nome;
    private String codigoFuncional;
    private double rendaTotal;
    private final double rendaBasica = 1000;
    private ECargos cargo = ECargos.SEM_CARGO;
    private double aumentoSalarialPorNivel = rendaBasica * 0;
    private double aumentoSalarialPorCargo = 0;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }
    public Funcionario(String nome, String codigoFuncional, ECargos cargo) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.cargo = cargo;
        atualizaRendaTotal();
    }

    protected void atualizaRendaTotal() {
        if (cargo == ECargos.GERENTE){
            aumentoSalarialPorCargo = 1500;
        }else if(cargo == ECargos.SUPERVISOR){
            aumentoSalarialPorCargo = 600;
        } else if (cargo == ECargos.VENDEDOR) {
            aumentoSalarialPorCargo = 250;
        }
        this.rendaTotal = rendaBasica + aumentoSalarialPorCargo + aumentoSalarialPorNivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public ECargos getCargo() {
        return cargo;
    }

    public void setCargo(ECargos cargo) {
        this.cargo = cargo;
        atualizaRendaTotal();
    }
    protected void setAumentoSalarialPorNivel(double aumentoSalarialPorNivel) {
        this.aumentoSalarialPorNivel = aumentoSalarialPorNivel;
    }
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", aumentoSalarialPorCargo=" + aumentoSalarialPorCargo + ", rendaTotal="
				+ rendaTotal + "]";
	}
    

}
