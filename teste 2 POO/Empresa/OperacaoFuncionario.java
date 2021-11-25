package Empresa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class OperacaoFuncionario {
	
	public static void validaFuncionarios(Funcionario func[], int n) {
		
		Funcionario F = new Funcionario();
		
		int i, c=0;
		
		for(i=0; i<n; i++) {
			
			c=0;
			
			System.out.printf("\n\nFuncionario: %d", i+1);
			System.out.printf("\nNome: %s", func[i].nome);
			
			if(F.validaCPF(func[i].CPF)) {
				
				System.out.printf("\nCPF: %s [Valido]", func[i].CPF);
				
			}
			else {
				
				System.out.printf("\nCPF: %s [Invalido]", func[i].CPF);
				c++;
				
			}
			
			if((func[i].sexo == 'f')||(func[i].sexo == 'm')){
				
				if(func[i].sexo == 'f') {
					
					System.out.printf("\nSexo: Feminino [Valido]");
					
				}
				
				if((func[i].sexo == 'm')) {
					
					System.out.printf("\nSexo: Masculino [Valido]");
					
				}
				
			}
			else {
				
				System.out.printf("\nSexo [Invalido]");
				c++;
				
			}
			
			if(F.validaDataNascimento(func[i].dataDeNascimento)) {
				
				System.out.printf("\nData de nascimento [Valido]");
				
			}
			else {
				
				System.out.printf("\nData de nascimento [invalido]");
				c++;
				
			}
			
			if(F.validaDataDeAdmissao(func[i].dataDeAdmissao)) {
				
				System.out.printf("\nData de admissao [Valido]");
				
			}
			else {
				
				System.out.printf("\nData de admissao [Invalido]");
				c++;
				
			}
			
			if(c>0) {
				
				System.out.printf("\nFuncionario [Invalido]");
				
			}
			else {
				
				System.out.printf("\nFuncionario [Valido]");
				
			}
			
		}
		
	}
	
	public static void sexoFuncionarios(Funcionario func[], int n) {
		
		int cf=0, cm=0, i;
		
		for(i=0; i<n; i++) {
			
			if(func[i].sexo == 'f') {
			
				cf++;
			
			}
		
			if(func[i].sexo == 'm') {
			
				cm++;
			
			}
		
		}
		
		System.out.printf("\n\nNumero de funcionarios do sexo masculino: %d", cm);
		System.out.printf("\nNumero de funcionarios do sexo feminino: %d", cf);
		
	}
	
	public static void salarioFuncionarios(Funcionario func[], int n) {
		
		Funcionario F = new Funcionario();
		
		double maior=0, menor=0, sal=0;
		int i, mai=0, mei=0;
		
		maior = F.salarioLiquido(func[0].salarioBruto);
		menor = F.salarioLiquido(func[0].salarioBruto);
		
		for(i=0; i<n; i++) {
			
			sal = F.salarioLiquido(func[i].salarioBruto);
			
			if(menor > sal) {
				
				menor = sal;
				mei = i;
				
			}
			if(maior < sal) {
				
				maior = sal;
				mai = i;
				
			}
			
		}
		
		System.out.printf("\n\nMaior salario liquido %s: %f$", func[mai].nome, maior);
		System.out.printf("\nMenor salario liquido %s: %f$", func[mei].nome, menor);
		
		
	}
	
	public static void idadesFuncionarios(Funcionario func[], int n) {
		
		Funcionario F = new Funcionario();
		
		int i, mai=0, mei=0, maior=0, menor=0, idade=0;
		
		for(i=0; i<n; i++) {
			
			if(F.validaDataNascimento(func[i].dataDeNascimento)) {
			
				idade = F.idadeFuncionario(func[i].dataDeNascimento);
			
				if(i==0) {
					
					maior = idade;
					menor = idade;
					
				}
				else {
					
					if(menor > idade) {
				
						menor = idade;
						mei = i;
				
					}
					if(maior < idade) {
				
						maior = idade;
						mai = i;
					
					}
					
				}
			
			}
			
		}
		
		System.out.printf("\n\nFuncionario mais velho %s: %d anos", func[mai].nome, maior);
		System.out.printf("\n\nFuncionario mais novo %s: %d anos", func[mei].nome, menor);
		
	}
	
	public static void igualdadeFuncionarios(Funcionario func[], int n) {
		
		Funcionario F = new Funcionario();
		
		int i=0, j=0, c=0, cont=0, indice=0; 
		String[] vet = new String[n];
		
		for(i=0; i<n; i++) {
			
			vet[i] = "nnn";
			
		}
		
		for(i=0; i<n; i++) {
			
			c=0;
			
			for(j=0; j<n; j++) {
				
				if(F.equals(func[i].CPF, func[i].nome, func[i].sexo, func[j].CPF, func[j].nome, func[j].sexo)) {
					
					c++;
					
				}
				
				if(c==2) {
					
					vet[i] = func[i].nome;
					cont++;
					
				}
					
			}
			
		}
		
		if(cont>0) {
			
			System.out.printf("\n\nFuncionario(s) repetido(s)");
			
			for(i=0; i<n; i++) {
				
				if((vet[i]).equals("nnn")) {
					
				}
				else {
					
					System.out.printf("\n%s", vet[i]);
					
				}
			
			}
		
		}
		else {
			
			System.out.printf("\n\nNao ha Funcionario(s) repetido(s)");
			
		}

	}
	
	
}
