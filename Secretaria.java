
public class Secretaria extends Funcionario {

	public Secretaria(String nome, String cpf, String idade, String matricula, double salario) {
		super(nome, cpf, idade, matricula, salario);

	}

	public Secretaria(String nome, String cpf, String idade, String matricula, double salario, double salarioTotal,
			double comissaoTotal, double totalVendas) {
		super(nome, cpf, idade, matricula, salario, salarioTotal, comissaoTotal, totalVendas);

	}

	public void calculaSalario() {

		this.salarioTotal = this.salario * 0.92;

		System.out.println("O salário é: " + this.salarioTotal);
	}

//	public void calculaComissao() {
//
//		
//		System.out.println("Secretaria não tem comissao!");
//	}
}
