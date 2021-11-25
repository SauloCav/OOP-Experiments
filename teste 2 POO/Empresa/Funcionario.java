package Empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funcionario {
	
	String CPF = "";
	String nome = "";
	char sexo;
	double salarioBruto;
	GregorianCalendar dataDeNascimento;
	GregorianCalendar dataDeAdmissao;
	
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
	
	public boolean validaCPF(String CPF) {
		
		return (CPF.length() == 14);
		
	}
	
	public boolean validaDataNascimento(GregorianCalendar dataDeNascimento) {
		
		return (dataDeNascimento.get(Calendar.YEAR) > 1920);
		
	}
	
	public boolean validaDataDeAdmissao(GregorianCalendar dataDeAdmissao) {
		
		return (dataDeAdmissao.get(Calendar.YEAR) > 1995);
		
	}
	
	int idadeFuncionario(GregorianCalendar dataDeNascimento) {
		
		GregorianCalendar dat = new GregorianCalendar();
		
		return (dat.get(Calendar.YEAR) - (dataDeNascimento.get(Calendar.YEAR)));
		
	}
	
	public double salarioLiquido(double salarioBruto) {
		
		if(salarioBruto<=3000) {
			
			return (salarioBruto*(0.83));
			
		}
		else {
			
			return (salarioBruto*(0.73));
			
		}
		
	}
	
	public boolean equals(String cPF, String nome, char sexo, String cPFf, String nomee, char sexoo) {
		
		return (((cPF).equals(cPFf))&&((nome).equals(nomee))&&(sexo==sexoo));
		
	}
	
	public String toString() {
		
		return "Nome:" + this.nome + "| CPF: " + this.CPF;
		
	}
	

}
