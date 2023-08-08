package herancaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Questao_10 {
	
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
        
        for (int i = 1; i < funcionarios.size(); i++) {
            if(i<=1){
                funcionarios.get(i-1).setCargo(ECargos.GERENTE);
            }else if (i<=3){
            	funcionarios.get(i-1).setCargo(ECargos.SUPERVISOR);;
            }else {
            	funcionarios.get(i-1).setCargo(ECargos.VENDEDOR);;
            }
        }

        double soma = 0;
        double somaBasico = 0;
        double somaMedio = 0;
        double somaSuperior = 0;

        for (int i = 0; i < funcionarios.size(); i++) {
            soma+=funcionarios.get(i).getRendaTotal();

            if(funcionarios.get(i) instanceof FuncionarioNivelSuperior) {
                somaSuperior += funcionarios.get(i).getRendaTotal();
            }else if (funcionarios.get(i) instanceof FuncionarioNivelMedio) {
                somaMedio += funcionarios.get(i).getRendaTotal();
            }
            else if(funcionarios.get(i) instanceof FuncionarioNivelBasico){
                somaBasico += funcionarios.get(i).getRendaTotal();
            }
        }

        System.out.println("Custos de funcionarios Basicos: " + somaBasico);
        System.out.println("Custos de funcionarios Medios: " + somaMedio);
        System.out.println("Custos de funcionarios Superiores: " + somaSuperior);
        System.out.println("\nCustos Totais: " + soma);


    }

}
