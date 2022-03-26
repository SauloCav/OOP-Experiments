package Empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Funcionario {
	
	private String CPF = "";
	private String nome = "";
	private char sexo;
	private double salarioBruto;
	private GregorianCalendar dataDeNascimento;
	private GregorianCalendar dataDeAdmissao;
	
	public Funcionario() {
		
		this.dataDeAdmissao = new GregorianCalendar();
		
	}
	
	public Funcionario(String cPF, String nome, GregorianCalendar dataDeAdmissao) {
		
		super();
		CPF = cPF;
		this.nome = nome;
		this.dataDeAdmissao = dataDeAdmissao;
		
	}

	public Funcionario(String cPF, String nome, char sexo, double salarioBruto, GregorianCalendar dataDeNascimento,
			GregorianCalendar dataDeAdmissao) {
		
		super();
		CPF = cPF;
		this.nome = nome;
		this.sexo = sexo;
		this.salarioBruto = salarioBruto;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDeAdmissao = dataDeAdmissao;
		
	}
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public GregorianCalendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(GregorianCalendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public GregorianCalendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(GregorianCalendar dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public boolean validaCPF() {
		
		return (this.CPF.length() == 14);
		
	}
	
	public boolean validaDataNascimento() {
		
		return (this.dataDeNascimento.get(Calendar.YEAR) > 1920);
		
	}
	
	public boolean validaDataDeAdmissao() {
		
		return (this.dataDeAdmissao.get(Calendar.YEAR) >= 1995);
		
	}
	
	int idadeFuncionario() {
		
		GregorianCalendar dat = new GregorianCalendar();
		
		return (dat.get(Calendar.YEAR) - (this.dataDeNascimento.get(Calendar.YEAR)));
		
	}
	
	public double salarioLiquido() {
		
		if(this.salarioBruto<=3000) {
			
			return (this.salarioBruto*(0.83));
			
		}
		else {
			
			return (this.salarioBruto*(0.73));
			
		}
		
	}

	public double getBonificacao() {
		
		return (this.salarioBruto*12)*0.02;
		
	}
	
	public GregorianCalendar dataDeAposentadoria() {
		
		GregorianCalendar apos = new GregorianCalendar();
		
		int dia = (this.dataDeAdmissao.get(Calendar.DAY_OF_MONTH));
		int mes = (this.dataDeAdmissao.get(Calendar.MONTH));
		int ano = (this.dataDeAdmissao.get(Calendar.YEAR)+35);
		
		apos.set(ano, mes, dia);
		
		return apos;
		
	}
	
	public boolean eMaisVelho(Funcionario f) {
		
		return ((this.dataDeNascimento.get(Calendar.YEAR))<(f.dataDeNascimento.get(Calendar.YEAR)));
		
	}
	
	public boolean equals(Funcionario f) {
		
		return ((this.nome==f.nome) && (this.CPF==f.CPF) && (this.sexo==f.sexo));
		
	}

	@Override
	public String toString() {
		return "Funcionario [CPF=" + CPF + ", nome=" + nome + ", sexo=" + sexo + ", salarioBruto=" + salarioBruto
				+ ", dataDeNascimento=" + dataDeNascimento + ", dataDeAdmissao=" + dataDeAdmissao + ", validaCPF()="
				+ validaCPF() + ", validaDataNascimento()=" + validaDataNascimento() + ", validaDataDeAdmissao()="
				+ validaDataDeAdmissao() + ", idadeFuncionario()=" + idadeFuncionario() + ", salarioLiquido()="
				+ salarioLiquido() + ", getBonificacao()=" + getBonificacao() + ", dataDeAposentadoria()="
				+ dataDeAposentadoria() + "]";
	}
	
	

}
