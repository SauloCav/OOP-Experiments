package Empresa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Analista extends Funcionario{
	
	private String diagrama[];

	public Analista() {
		super();
		this.diagrama = new String[5];
	}

	public Analista(String cPF, String nome, char sexo, double salarioBruto, GregorianCalendar dataDeNascimento, GregorianCalendar dataDeAdmissao, String diagrama[]) {
		super(cPF, nome, sexo, salarioBruto, dataDeNascimento, dataDeAdmissao);
		this.diagrama = diagrama;
	}
	
	public boolean dominaMesmaDiagrama(Analista a) {
		
		return ((this.diagrama)==(a.diagrama));
			
	}
	
	@Override
	public double getBonificacao() {
		
		return (this.getSalarioBruto()*12)*0.03;
		
	}

	@Override
	public String toString() {
		return "Analista [diagrama=" + Arrays.toString(diagrama) + ", getBonificacao()=" + getBonificacao()
				+ ", getCPF()=" + getCPF() + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getSalarioBruto()=" + getSalarioBruto() + ", getDataDeNascimento()=" + getDataDeNascimento()
				+ ", getDataDeAdmissao()=" + getDataDeAdmissao() + ", validaCPF()=" + validaCPF()
				+ ", validaDataNascimento()=" + validaDataNascimento() + ", validaDataDeAdmissao()="
				+ validaDataDeAdmissao() + ", idadeFuncionario()=" + idadeFuncionario() + ", salarioLiquido()="
				+ salarioLiquido() + ", dataDeAposentadoria()=" + dataDeAposentadoria() + "]";
	}

}
