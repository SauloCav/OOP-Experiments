package Teste;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import Cupoms.Colecao;
import Cupoms.ColecaoItem;
import Cupoms.CupomFiscal;
import Cupoms.GeradorCupom;
import Cupoms.Item;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GeradorCupom gc = new GeradorCupom();
		ColecaoItem ci = new ColecaoItem();
		CupomFiscal[] i = new CupomFiscal[100];
		
		GregorianCalendar data = new GregorianCalendar();
		data.set(2020, 06, 05);
		i[0] = new CupomFiscal("ALPHA LOGIC", "00.123.123/1234-12", "", "00.234.234/2345-23", 4000);
		i[0].setCodigo(123);
		i[0].setNome("Play 5");
		i[0].setValorUnitario(5000);
		i[0].setDataCadastro(data);
		
		GregorianCalendar data1 = new GregorianCalendar();
		data1.set(2020, 07, 07);
		i[1] = new CupomFiscal("CRISTALS", "00.789.789/7894-78", "", "00.456.456/4567-45", 8000);
		i[1].setCodigo(234);
		i[1].setNome("TV Plasma");
		i[1].setValorUnitario(1500);
		i[1].setDataCadastro(data1);
		
		GregorianCalendar data2 = new GregorianCalendar();
		data2.set(2020, 01, 01);
		i[2] = new CupomFiscal("Casas Quebec", "00.159.4159/4567-23", "123.123.123-12", "", 7000);
		i[2].setCodigo(789);
		i[2].setNome("Poltrona");
		i[2].setValorUnitario(5200);
		i[2].setDataCadastro(data2);
		
		//Inserindo 3 obejtos
		ci.inserir(i[0]);
		
		ci.inserir(i[1]);
		
		ci.inserir(i[2]);
		
		//Imprimindo dados
		ci.imprimirDadosColecao();
		
		//pesquisando codigo
		ci.pesquisar(789);
		
		//pesquisando por nome
		ci.pesquisar("Play 5");
		
		//pesquisando por preco
		ci.pesquisar(5000.00, 5200.00);
		
		//pesquisando por data
		ci.pesquisar(data, data2);
		
		//pesquisando por qtd
		ci.pesquisar(0, 2);
		
		//Os seguintes métodos resultaram uma exception
		
		//ci.pesquisarex(1, 2); TENTA ACESSAR INDICES MAIORES QUE O TAMANHO DO VETOR
		
		//ci.pesquisarex("Play 5"); TENTA ACESSAR INDICES QUE POSSUEM VALORAÇÃO NULL
		
		
		
	}

}
