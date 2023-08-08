package herancaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Questao_11 {

	public static void main(String[] args) {


        List<Funcionario> funcionarios = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            if(i<=4){
                funcionarios.add(new FuncionarioNivelBasico(("funcionario"+ i) , ""+i,"Escola "+ i));
            }else if (i<=8){
                funcionarios.add(new FuncionarioNivelMedio(("funcionario"+ i) , ""+i,"Escola "+ i));
            }else {
                funcionarios.add(new FuncionarioNivelSuperior("funcionario"+ i , ""+i,"Escola "+ i, "Universidade"));
            }
        }
        
        for (int i = 0; i < funcionarios.size(); i++) {
            if(i<1){
                funcionarios.get(i).setCargo(ECargos.GERENTE);
            }else if (i<3){
            	funcionarios.get(i).setCargo(ECargos.SUPERVISOR);;
            }else {
            	funcionarios.get(i).setCargo(ECargos.VENDEDOR);;
            }
        }

        funcionarios.forEach(funcionario -> System.out.println(funcionario.toString()));
    }
}
