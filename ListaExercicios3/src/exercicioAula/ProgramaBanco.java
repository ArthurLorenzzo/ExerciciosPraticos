package exercicioAula;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("48082892929", "Tiago", "avenida", "2003");
		
		Cliente cliente2 = new Cliente("48082892927", "Arthur", "rodovia", "2002");
				
		ContaCorrente conta = new ContaCorrente("214215315", "Conta corrente", cliente, cliente2, 50, 200);
		
		conta.credito(100);
		
		conta.debito(150);
		
		conta.credito(200);
		
		conta.debito(150);
		
		conta.resumo();
		
	}

}
