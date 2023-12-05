package funcionários;

public class Main {

	public static void main(String[] args) {

		// Criação de instâncias de funcionários efetivos com herança
		FuncionarioEfetivo fe[] = new FuncionarioEfetivo[5];
		fe[0] = new FuncionarioEfetivo("Maria", "Estagiário", 1500, true);
		fe[1] = new FuncionarioEfetivo("José", "Financeiro", 2500, false);
		fe[2] = new FuncionarioEfetivo("Joana", "Administrativo", 2000, true);
		fe[3] = new FuncionarioEfetivo("Will", "Gestão", 2800, true);
		fe[4] = new FuncionarioEfetivo("Junior", "Estagiário", 1500, false);

		// Criação de instâncias de funcionários temporários com herança
		FuncionarioTemporario ft[] = new FuncionarioTemporario[5];
		ft[0] = new FuncionarioTemporario("Jonas", "Estagiário", 1500, 6);
		ft[1] = new FuncionarioTemporario("Roberto", "Assistente Administrativo", 2000, 15);
		ft[2] = new FuncionarioTemporario("Karen", "Estagiário", 1500, 3);
		ft[3] = new FuncionarioTemporario("Maurílio", "Financeiro", 2500, 10);
		ft[4] = new FuncionarioTemporario("Kevin", "Administrativo", 2000, 9);

		// Apresentação do início do programa
		System.out.println("-----------------------------------------------------------");
		System.out.println("************** GERÊNCIAMENTO DE FUNCIONÁRIOS **************");
		System.out.println("-----------------------------------------------------------");
		System.out.println();

		// Aplicação do método calcularBeneficios() nas instâncias conforme o salário e plano de saúde
		System.out.println("FUNCIONÁRIOS EFETIVADOS:");
		System.out.println();
		// Aplicação do método info() para mostrar os dados do funcionário 
		fe[0].info();
		System.out.println("Benefícios do funcionário efetivo: R$ " + fe[0].calcularBeneficios());
		System.out.println();
		fe[1].info();
		System.out.println("Benefícios do funcionário efetivo: R$ " + fe[1].calcularBeneficios());
		System.out.println();
		fe[2].info();
		System.out.println("Benefícios do funcionário efetivo: R$ " + fe[2].calcularBeneficios());
		System.out.println();
		fe[3].info();
		System.out.println("Benefícios do funcionário efetivo: R$ " + fe[3].calcularBeneficios());
		System.out.println();
		fe[4].info();
		System.out.println("Benefícios do funcionário efetivo: R$ " + fe[4].calcularBeneficios());
		System.out.println();
		
		// Aplicação do método calcularBeneficios() nas instâncias conforme o salário e a duração do contrato
		System.out.println("FUNCIONÁRIOS TEMPORÁRIOS:");
		System.out.println();
		ft[0].info();
		System.out.println("Benefícios do funcionário temporário: R$ " + ft[0].calcularBeneficios());
		System.out.println();
		ft[1].info();
		System.out.println("Benefícios do funcionário temporário: R$ " + ft[1].calcularBeneficios());
		System.out.println();
		ft[2].info();
		System.out.println("Benefícios do funcionário temporário: R$ " + ft[2].calcularBeneficios());
		System.out.println();
		ft[3].info();
		System.out.println("Benefícios do funcionário temporário: R$ " + ft[3].calcularBeneficios());
		System.out.println();
		ft[4].info();
		System.out.println("Benefícios do funcionário temporário: R$ " + ft[4].calcularBeneficios());
	}
}
