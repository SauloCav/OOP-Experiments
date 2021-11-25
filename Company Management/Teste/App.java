package Teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import Empresa.Funcionario;
import Empresa.OperacaoFuncionario;
import Empresa.GerenciaFuncionario;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		GerenciaFuncionario F = new GerenciaFuncionario();
		
		int n;
		
		System.out.printf("Insira n: ");
		n = input.nextInt();
		
		F.criaObjeto(n);
		
		F.showVet(n);
		
		F.testaFun(n);

	}

}
