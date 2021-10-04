package Calculos_Salariais;

public class Vend extends Vendedor {

	public Vend() {
		super();
	}

	public Vend(String nome, double salBase, double totalVendas, double numeroDeDependentes) {
		super(nome, salBase, totalVendas, numeroDeDependentes);
	}

	@Override
	public String toString() {
		return "Vend [getNome()=" + getNome() + ", isSalBase()=" + isSalBase() + ", isTotalVendas()=" + isTotalVendas()
				+ ", getNumeroDeDependentes()=" + getNumeroDeDependentes() + "]";
	}

}
