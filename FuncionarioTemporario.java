package funcionários;

class FuncionarioTemporario extends Funcionarios {

	// Atributos da classe
	private int duracaoContrato;

	// Método construtor
	public FuncionarioTemporario(String nome, String cargo, double salario, int duracaoContrato) {
		super(nome, cargo, salario, false, duracaoContrato);
		this.setDuracaoContrato(duracaoContrato);
	}

	// polimorfismo aplicado no Método calcularBeneficios() na classe
	public double calcularBeneficios() {
		// Lógica para calcular benefícios de funcionários temporários
		return getSalario() * 0.05 * getDuracaoContrato(); // 5% do salário por mês de contrato
	}

	// Métodos acessores
	public void setDuracaoContrato(int duracaoContrato) {
		this.duracaoContrato = duracaoContrato;
	}

	public int getDuracaoContrato() {
		return duracaoContrato;
	}
}
