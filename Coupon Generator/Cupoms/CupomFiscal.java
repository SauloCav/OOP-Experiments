package Cupoms;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CupomFiscal extends Item {
	
	private String nomeLoja = "";
	private String cnpj = "";
	private String cpfConsumidor = "";
	private String cnpjConsumidor = "";
	private double dinheiroRecebido;
	ColecaoItem listaItem;
	
	public CupomFiscal() {
		super();
	}

	public CupomFiscal(int codigo, String nome, double valorUnitario, GregorianCalendar dataCadastro) {
		super(codigo, nome, valorUnitario, dataCadastro);
	}

	public CupomFiscal(String nomeLoja, String cnpj, String cpfConsumidor, String cnpjConsumidor,
			double dinheiroRecebido) {
		super();
		this.nomeLoja = nomeLoja;
		this.cnpj = cnpj;
		this.cpfConsumidor = cpfConsumidor;
		this.cnpjConsumidor = cnpjConsumidor;
		this.dinheiroRecebido = dinheiroRecebido;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCpfConsumidor() {
		return cpfConsumidor;
	}
	
	public void setCpfConsumidor(String cpfConsumidor) {
		this.cpfConsumidor = cpfConsumidor;
	}
	
	public String getCnpjConsumidor() {
		return cnpjConsumidor;
	}
	
	public void setCnpjConsumidor(String cnpjConsumidor) {
		this.cnpjConsumidor = cnpjConsumidor;
	}
	
	public double getDinheiroRecebido() {
		return dinheiroRecebido;
	}
	
	public void setDinheiroRecebido(double dinheiroRecebido) {
		this.dinheiroRecebido = dinheiroRecebido;
	}
	
	boolean validarCNPJ(String cn) {
		
		return (cn.length() == 18);
		
	}

	boolean validarCPF(String cp) {
		
		return (cp.length() == 14);
		
	}

}
