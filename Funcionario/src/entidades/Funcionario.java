package entidades;

public class Funcionario {
	
	public String nome;
	public double SalarioBruto;
	public double taxa;
	
	public double NovoSalario() {
		return SalarioBruto - taxa;
	}
	public void AumentoSalarial(double porcentagem) {
		SalarioBruto += SalarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", NovoSalario());
	}
	

}
