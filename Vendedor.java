
public class Vendedor extends Secretaria {

	private double totalVendas;
	private double comissaoTotal;
	

	public Vendedor(String nome, String cpf, String idade, String matricula, double salario, double totalVendas) {
		super(nome, cpf, idade, matricula, salario);
		this.totalVendas = totalVendas;
	}


	public double getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	
	public double getComissaoTotal() {
		return comissaoTotal;
	}


	public void setComissaoTotal(double comissaoTotal) {
		this.comissaoTotal = comissaoTotal;
	}

	public void calculaComissao() {
		
		this.comissaoTotal = this.totalVendas * 0.05;	
		System.out.println("Comissão total é: "+this.comissaoTotal);	
	}


	
	
}
