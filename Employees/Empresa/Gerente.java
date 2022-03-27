package Empresa;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Gerente extends Funcionario{
	
	private String metodologiaDesenvolvimento[];

	public Gerente() {
		super();
		this.metodologiaDesenvolvimento = new String[5];
	}

	public Gerente(String cPF, String nome, char sexo, double salarioBruto, GregorianCalendar dataDeNascimento, GregorianCalendar dataDeAdmissao, String metodologiaDesenvolvimento[]) {
		super(cPF, nome, sexo, salarioBruto, dataDeNascimento, dataDeAdmissao);
		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}
	
	public boolean dominaMesmasMetodologias(Gerente g) {
		
		return ((this.metodologiaDesenvolvimento)==(g.metodologiaDesenvolvimento));
			
	}
	
	@Override
	public double getBonificacao() {
		
		return (this.getSalarioBruto()*12)*0.05;
		
	}

	@Override
	public String toString() {
		return "Gerente [metodologiaDesenvolvimento=" + Arrays.toString(metodologiaDesenvolvimento)
				+ ", getBonificacao()=" + getBonificacao() + ", getCPF()=" + getCPF() + ", getNome()=" + getNome()
				+ ", getSexo()=" + getSexo() + ", getSalarioBruto()=" + getSalarioBruto() + ", getDataDeNascimento()="
				+ getDataDeNascimento() + ", getDataDeAdmissao()=" + getDataDeAdmissao() + ", validaCPF()="
				+ validaCPF() + ", validaDataNascimento()=" + validaDataNascimento() + ", validaDataDeAdmissao()="
				+ validaDataDeAdmissao() + ", idadeFuncionario()=" + idadeFuncionario() + ", salarioLiquido()="
				+ salarioLiquido() + ", dataDeAposentadoria()=" + dataDeAposentadoria() + "]";
	}

}
