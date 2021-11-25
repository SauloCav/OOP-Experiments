package Empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GerenciaFuncionario {
	
	Funcionario[] func = new Funcionario[100];
	Funcionario fun = new Funcionario();
	OperacaoFuncionario of = new OperacaoFuncionario();
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	
	Scanner input = new Scanner(System.in);
	
	public void criaObjeto(int n) {
		
		int i, dia, mes, ano;
		
		for(i=0; i<n; i++) {
			
			System.out.printf("\n\nInsira o nome do funcionario: ");
			String nome = input.nextLine();
			
			input.nextLine();
			System.out.printf("Insira o CFP: ");
			String cpf = input.nextLine();
			
			input.nextLine();
			System.out.printf("Insira o sexo do funcionario: ");
			char sexo = input.next().charAt(0);
			
			System.out.printf("\nInsira o salario bruto do funcionario: ");
			double salbruto = input.nextDouble();
			
			System.out.printf("\nData nascimento:\n");
			GregorianCalendar datnasc = new GregorianCalendar();
			System.out.printf("Insira o dia do mes: ");
			dia = input.nextInt();
			System.out.printf("Insira o mes: ");
			mes = input.nextInt();
			System.out.printf("Insira o ano: ");
			ano = input.nextInt();
			datnasc.set(ano, mes, dia);
			formatador.format(datnasc.getTime());
			
			System.out.printf("\nData admissao:\n");
			GregorianCalendar datadm = new GregorianCalendar();
			System.out.printf("Insira o dia do mes: ");
			dia = input.nextInt();
			System.out.printf("Insira o mes: ");
			mes = input.nextInt();
			System.out.printf("Insira o ano: ");
			ano = input.nextInt();
			datadm.set(ano, mes, dia);
			formatador.format(datadm.getTime());
			
			func[i] = new Funcionario(cpf, nome, sexo, salbruto, datnasc, datadm);
			
			input.nextLine();
			
		}
		
	}
	
	public void showVet(int n) {
		
		int i, idade; 
		double sal;
		
		for(i=0; i<n; i++) {
			
			System.out.printf("\n\nNome do funcionario: %s", func[i].nome);
			System.out.printf("\nCPF do funcionario: %s", func[i].CPF);
			System.out.printf("\nSexo do funcionario: %c", func[i].sexo);
			System.out.printf("\nSalario bruto do funcionario: %f", func[i].salarioBruto);
			
			String datanas = formatador.format(func[i].dataDeNascimento.getTime());
			System.out.printf("\nData nascimento: %s", datanas);
			
			String dataadm = formatador.format(func[i].dataDeAdmissao.getTime());
			System.out.printf("\nData admissao: %s", dataadm);
			
			idade = fun.idadeFuncionario(func[i].dataDeNascimento);
			System.out.printf("\nIdade do funcionario: %d", idade);
			
			sal = fun.salarioLiquido(func[i].salarioBruto);
			System.out.printf("\nSalario liquido do funcionario: %f", sal);
			
		}
		
	}
	
	public void testaFun(int n) {
		
		int i;
		
		of.salarioFuncionarios(func, n);
		
		of.sexoFuncionarios(func, n);
		
		of.idadesFuncionarios(func, n);
		
		of.igualdadeFuncionarios(func, n);
		
		of.validaFuncionarios(func, n);
		
	}


}
