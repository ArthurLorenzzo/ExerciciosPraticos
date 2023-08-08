package herancaEPolimorfismo;

public class FuncionarioNivelMedio extends FuncionarioNivelBasico{


    public FuncionarioNivelMedio(String nome, String codigoFuncional, String escola, ECargos cargo) {
        super(nome, codigoFuncional, escola, cargo);
        setAumentoSalarialPorNivel(getRendaBasica() * 0.5);
        atualizaRendaTotal();
    }
    public FuncionarioNivelMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        setAumentoSalarialPorNivel(getRendaBasica() * 0.5);
        atualizaRendaTotal();
    }


}
