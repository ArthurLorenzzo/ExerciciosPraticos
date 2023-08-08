package herancaEPolimorfismo;

public class FuncionarioNivelSuperior extends FuncionarioNivelMedio{

    protected String universidade;


    public FuncionarioNivelSuperior(String nome, String codigoFuncional, String escola, String universidade, ECargos cargo) {
        super(nome, codigoFuncional, escola, cargo);
        this.universidade = universidade;
        setAumentoSalarialPorNivel(getRendaBasica() * 1);
        atualizaRendaTotal();
    }

    public FuncionarioNivelSuperior(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
        setAumentoSalarialPorNivel(getRendaBasica() * 1);
        atualizaRendaTotal();
    }
}
