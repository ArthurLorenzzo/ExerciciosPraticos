package herancaEPolimorfismo;

public class FuncionarioNivelBasico extends Funcionario {

    private String escola;

    public FuncionarioNivelBasico(String nome, String codigoFuncional, String escola, ECargos cargo) {
        super(nome, codigoFuncional, cargo);
        this.escola = escola;
        setAumentoSalarialPorNivel(getRendaBasica() * 0.1);
        super.atualizaRendaTotal();
    }
    public FuncionarioNivelBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        setAumentoSalarialPorNivel(getRendaBasica() * 0.1);
        super.atualizaRendaTotal();
    }




}
