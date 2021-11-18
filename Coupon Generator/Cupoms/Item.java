package Cupoms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class Item {
	
	private int codigo;
	private String nome = "";
	private double valorUnitario;
	private GregorianCalendar dataCadastro;
	
	public Item() {
		super();
	}

	public Item(int codigo, String nome, double valorUnitario, GregorianCalendar dataCadastro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valorUnitario = valorUnitario;
		this.dataCadastro = dataCadastro;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public GregorianCalendar getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(GregorianCalendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	void printDat() {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		GregorianCalendar data = new GregorianCalendar();
		
		int dia = (this.dataCadastro.get(Calendar.DAY_OF_MONTH));
		int mes = (this.dataCadastro.get(Calendar.MONTH));
		int ano = (this.dataCadastro.get(Calendar.YEAR));
		
		data.set(ano, mes, dia);
		
		formatador.format(data.getTime());
		String str = formatador.format(data.getTime());
		
		System.out.printf("Data de cadastro: %s\n", str);
	}
	
    void printDataeHora() {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		GregorianCalendar data = new GregorianCalendar();
		java.util.Date d = new Date();
		String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		
		int dia = (data.get(Calendar.DAY_OF_MONTH));
		int mes = (data.get(Calendar.MONTH));
		int ano = (data.get(Calendar.YEAR));
		
		data.set(ano, mes, dia);
		
		formatador.format(data.getTime());
		String str = formatador.format(data.getTime());
		
		System.out.printf("%s %s\n", str, dStr);
		
	}

}
