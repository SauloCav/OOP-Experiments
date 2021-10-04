package Calculos_Salariais;

public interface Calculos {
	
	public double calcularComissao(double totalVendas);
	
	public double calcularSalarioBruto(double salBase, double totalVendas);
	
	public double calcularBonus(double totalVendas);
	
	public double calcularIRPF(double salBase, double totalVendas);
	
	public double calcularINSS(double salBase, double totalVendas);
	
	public double calcularSalarioFamilia(double salBase, double totalVendas, double numeroDeDependentes);
	
	public double calcularSalarioLiquido(double salBase, double totalVendas, double numeroDeDependentes);

}
