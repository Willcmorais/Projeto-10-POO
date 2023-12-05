package funcionários;

public class FuncionarioEfetivo extends Funcionarios {

	// Atributos da classe
	private boolean planoSaude;

	// Método construtor
	public FuncionarioEfetivo(String no, String carg, double sal, boolean plano) {
		super(no, carg, sal, plano, 0);
		this.setPlanoSaude(plano);
	}
	
	// polimorfismo aplicado no Método calcularBeneficios() na classe
	public double calcularBeneficios() {
		// Lógica para calcular benefícios de funcionários efetivos
		double beneficios = getSalario() * 0.1; // 10% do salário como benefício
		if (this.getPlanoSaude()) {
			beneficios += 200; // Valor adicional se possui plano de saúde
		}
		return beneficios;
	}

	public boolean getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}
}
