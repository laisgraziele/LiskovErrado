
public abstract class  Funcionario extends Pessoa {


		private String matricula;
		protected double salario;
		protected double salarioTotal;
		protected double comissaoTotal;
		protected double totalVendas;

		public Funcionario(String nome, String cpf, String idade, String matricula, double salario) {
			super(nome, cpf, idade);
			this.matricula = matricula;
			this.salario = salario;
			this.salarioTotal = 0;
		}
		
		

		public Funcionario(String nome, String cpf, String idade, String matricula, double salario, double salarioTotal, double comissaoTotal,
				double totalVendas) {
			super(nome, cpf, idade);
			this.matricula = matricula;
			this.salario = salario;
			this.salarioTotal = salarioTotal;
			this.comissaoTotal = comissaoTotal;
			this.totalVendas = totalVendas;
		}



		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		
		public Funcionario(String nome, String cpf, String idade) {
			super(nome, cpf, idade);
		}



		public void calculaSalario() {
			
			 this.salarioTotal = this.salario * 0.92;	
			 
			System.out.println("O salário é: " +this.salarioTotal);
		}
		
		public void calculaComissao() {
			
			this.comissaoTotal = this.totalVendas * 0.05;	
			System.out.println("Comissão total é: "+this.comissaoTotal);	
		}
		

}
