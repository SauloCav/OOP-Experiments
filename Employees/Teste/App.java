package Teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import Empresa.Funcionario;
import Empresa.OperacaoFuncionario;
import Empresa.Programador;
import Empresa.Analista;
import Empresa.Gerente;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		OperacaoFuncionario fun = new OperacaoFuncionario();
		Funcionario[] vetorFunc = new Funcionario[12];
		
		vetorFunc[0] = new Programador();
		vetorFunc[1] = new Programador();
		vetorFunc[2] = new Programador();
		vetorFunc[3] = new Programador();
		vetorFunc[4] = new Programador();
		vetorFunc[5] = new Programador();
		vetorFunc[6] = new Analista();
		vetorFunc[7] = new Analista();
		vetorFunc[8] = new Analista();
		vetorFunc[9] = new Analista();
		vetorFunc[10] = new Gerente();
		vetorFunc[11] = new Gerente();
		
		vetorFunc[0].setSalarioBruto(5000);
		vetorFunc[0].setNome("billy");
		GregorianCalendar data = new GregorianCalendar();
		data.set(1996, 06, 05);
		vetorFunc[0].setDataDeAdmissao(data);
		vetorFunc[0].setSexo('m');
		
		vetorFunc[1].setSalarioBruto(8000);
		vetorFunc[1].setNome("maria");
		GregorianCalendar data1 = new GregorianCalendar();
		data1.set(1998, 04, 21);
		vetorFunc[1].setDataDeAdmissao(data1);
		vetorFunc[1].setSexo('f');
		
		vetorFunc[2].setSalarioBruto(4000);
		vetorFunc[2].setNome("jack");
		GregorianCalendar data2 = new GregorianCalendar();
		data2.set(1997, 05, 01);
		vetorFunc[2].setDataDeAdmissao(data2);
		vetorFunc[2].setSexo('m');
		
		vetorFunc[3].setSalarioBruto(1000);
		vetorFunc[3].setNome("james");
		GregorianCalendar data3 = new GregorianCalendar();
		data3.set(2008, 12, 21);
		vetorFunc[3].setDataDeAdmissao(data3);
		vetorFunc[3].setSexo('m');
		
		vetorFunc[4].setSalarioBruto(5000);
		vetorFunc[4].setNome("ana");
		GregorianCalendar data4 = new GregorianCalendar();
		data4.set(2001, 11, 13);
		vetorFunc[4].setDataDeAdmissao(data4);
		vetorFunc[4].setSexo('f');
		
		vetorFunc[5].setSalarioBruto(10000);
		vetorFunc[5].setNome("lennon");
		GregorianCalendar data5 = new GregorianCalendar();
		data5.set(1995, 02, 25);
		vetorFunc[5].setDataDeAdmissao(data5);
		vetorFunc[5].setSexo('m');
		
		vetorFunc[6].setSalarioBruto(6000);
		vetorFunc[6].setNome("john");
		GregorianCalendar data6 = new GregorianCalendar();
		data6.set(2000, 11, 28);
		vetorFunc[6].setDataDeAdmissao(data6);
		vetorFunc[6].setSexo('m');
		
		vetorFunc[7].setSalarioBruto(2500);
		vetorFunc[7].setNome("samantha");
		GregorianCalendar data7 = new GregorianCalendar();
		data7.set(2018, 04, 21);
		vetorFunc[7].setDataDeAdmissao(data7);
		vetorFunc[7].setSexo('f');
		
		vetorFunc[8].setSalarioBruto(2000);
		vetorFunc[8].setNome("bartolomeu");
		GregorianCalendar data8 = new GregorianCalendar();
		data8.set(1999, 03, 16);
		vetorFunc[8].setDataDeAdmissao(data8);
		vetorFunc[8].setSexo('m');
		
		vetorFunc[9].setSalarioBruto(2000);
		vetorFunc[9].setNome("platao");
		GregorianCalendar data9 = new GregorianCalendar();
		data9.set(2015, 10, 02);
		vetorFunc[9].setDataDeAdmissao(data9);
		vetorFunc[9].setSexo('m');
		
		vetorFunc[10].setSalarioBruto(3500);
		vetorFunc[10].setNome("athena");
		GregorianCalendar data10 = new GregorianCalendar();
		data10.set(2012, 06, 06);
		vetorFunc[10].setDataDeAdmissao(data10);
		vetorFunc[10].setSexo('f');
		
		vetorFunc[11].setSalarioBruto(4000);
		vetorFunc[11].setNome("saul");
		GregorianCalendar data11 = new GregorianCalendar();
		data11.set(2010, 10, 10);
		vetorFunc[11].setDataDeAdmissao(data11);
		vetorFunc[11].setSexo('m');
		
		fun .aposentadoria(vetorFunc);
		fun.bonificacoes(vetorFunc);
		fun.sexoFuncionarios(vetorFunc);
		fun.salarioFuncionarios(vetorFunc);
		
	}

}


