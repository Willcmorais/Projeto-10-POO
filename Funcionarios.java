package funcionários;

public class Funcionarios {
	// Atributos da classe 
	private String nome, cargo;
	private double salario;

	// Método construtor da classe Funcionario
	public Funcionarios(String nome, String cargo, double salario, boolean plano, int contrato) {
		this.setNome(nome);
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	// Método que mostra informações do funcionário na tela
	public void info() {
		System.out.println(this.getNome() + " (" + this.getCargo() + ")");
		System.out.println("Salário Atual: " + this.getSalario());
	}

	// Método que retorna o cálculo do benefício do funcionário
	public double calcularBeneficios() {
		return 0;
	}

	// Métodos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
