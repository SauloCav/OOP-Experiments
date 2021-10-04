package Calculos_Salariais;

public class Results implements Calculos {

	@Override
	public double calcularComissao(double totalVendas) {
		
		double c = 0;
		
		if(totalVendas > 50000 && totalVendas <= 100000) {
			c = (totalVendas*(0.02));
		}
		if(totalVendas > 100000 && totalVendas <= 150000) {
			c = (totalVendas*(0.02));
		}
		if(totalVendas > 150000) {
			c = (totalVendas*(0.07));
		}
		
		return c;
		
	}
	
	@Override
	public double calcularSalarioBruto(double salBase, double totalVendas) {
		
		double c = calcularComissao(totalVendas);
		
		return c + salBase;
		
	}

	@Override
	public double calcularBonus(double totalVendas) {
		
		double b = 0;
		
		if(totalVendas > 50000) {
			b = 500;
		}
		
		return b;
		
	}

	@Override
	public double calcularIRPF(double salBase, double totalVendas) {
		
		double sb = calcularSalarioBruto(salBase, totalVendas);
		double irpf = 0;
		
		if((sb > 1434.59) && (sb <= 2150)) {
			irpf = (sb*(0.075));
		}
		if((sb > 2150) && (sb <= 2866.70)) {
			irpf = (sb*(0.15));
		}
		if((sb > 2866.70) && (sb <= 3582)) {
			irpf = (sb*(0.225));
		}
		if(sb > 3582) {
			irpf = (sb*(0.275));
		}
		
		return irpf;
		
	}

	@Override
	public double calcularINSS(double salBase, double totalVendas) {
		
		double sb = calcularSalarioBruto(salBase, totalVendas);
		double inss = 0;
		
		if(sb <= 965.67) {
			inss = (sb*(0.08));
		}
		if((sb > 965.67) && (sb <= 1609.45)) {
			inss = (sb*(0.09));
		}
		if((sb > 1609.45) && (sb <= 3218.90)) {
			inss = (sb*(0.11));
		}
		
		return inss;
		
	}

	@Override
	public double calcularSalarioFamilia(double salBase, double totalVendas, double numeroDeDependentes) {
		
		double sb = calcularSalarioBruto(salBase, totalVendas);
		double sf = 0;
		
		if(sb <= 5000.40) {
			sf = (numeroDeDependentes * 25.66);
		}
		
		if((sb > 5000.40) && (sb <= 7521.20)) {
			sf = (numeroDeDependentes * 18.08);
		}
		
		return sf;
		
	}

	@Override
	public double calcularSalarioLiquido(double salBase, double totalVendas, double numeroDeDependentes) {
		
		double sb = calcularSalarioBruto(salBase, totalVendas);
		double irpf = calcularIRPF(salBase, totalVendas);
		double inss = calcularINSS(salBase, totalVendas);
		double bonus = calcularBonus(totalVendas);
		double salarioFamilia = calcularSalarioFamilia(salBase, totalVendas, numeroDeDependentes);
		double salLiquido;
		
		salLiquido = (((sb - irpf) - inss) + (bonus + salarioFamilia));
		
		return salLiquido;
		
	}

}
