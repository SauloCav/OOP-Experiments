package Calculos_Salariais;

public abstract class Vendedor {
	
	private String nome = "";
	private double salBase;
	private double totalVendas;
	private double numeroDeDependentes;
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nome, double salBase, double totalVendas, double numeroDeDependentes) {
		super();
		this.nome = nome;
		this.salBase = salBase;
		this.totalVendas = totalVendas;
		this.numeroDeDependentes = numeroDeDependentes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double isSalBase() {
		return salBase;
	}

	public void setSalBase(double salBase) {
		this.salBase = salBase;
	}

	public double isTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getNumeroDeDependentes() {
		return numeroDeDependentes;
	}

	public void setNumeroDeDependentes(double numeroDeDependentes) {
		this.numeroDeDependentes = numeroDeDependentes;
	}
	
}
