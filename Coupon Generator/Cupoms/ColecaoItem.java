package Cupoms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ColecaoItem implements Colecao {
	
	Item it;
	Item[] dados = new Item[100];
	private int PosicaoCorrente = 0;
	private int qtd = 0;
	
	public Item[] getDados() {
		return dados;
	}

	public void setDados(Item dados) {
		this.dados[this.PosicaoCorrente] = dados;
	}

	public int getPosicaoCorrente() {
		return PosicaoCorrente;
	}

	public void setPosicaoCorrente(int posicaoCorrente) {
		PosicaoCorrente = posicaoCorrente;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public boolean inserir(Item x) {
		
		if(this.getQtd()<100) {
			this.setDados(x);
			this.setPosicaoCorrente(this.getPosicaoCorrente()+1);
			this.setQtd(this.getQtd()+1);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public boolean remover() {
		
		if(this.getQtd()>0) {
			this.setPosicaoCorrente(0);
			this.setQtd(0);
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean remover(int indice) {
		
		if(indice<qtd) {
			
			Item[] itt = new Item[this.qtd];
			int i, j=0;
			
			for(i=0; i<qtd; i++) {
				
				itt[i] = this.dados[i];
				
			}
			
			for(i=0; i<qtd; i++) {
				
				if(i!=indice) {
					
					 this.dados[j] = itt[i];
					 j++;
					 
				}
				
			}
			
			qtd--;
			
			return true;
			
		}
		else {
			
			return false;	
			
		}
		
	}
	
	@Override
	public void atualizar(Item x, int indice) {
		
		this.dados[indice] = x;
		
	}

	@Override
	public boolean pesquisar(Item x) {
		
		int j;
		
		for(j=0; j<qtd; j++) {
			
			if(x == this.dados[j]) {
				System.out.printf("Objeto encontrado!\n");
				return true;
			}
			
		}
		
		System.out.printf("Objeto nao encontrado!\n");
		return false;
		
	}

	@Override
	public boolean colecaoEstaVazia() {
		
		if(this.getQtd()<=0) {
			System.out.printf("Colecao vazia!\n");
			return true;
		}
		else {
			System.out.printf("Colecao nao vazia!\n");
			return false;
		}
		
	}

	@Override
	public void imprimirDadosColecao() {
		
		int i=1;
		
		System.out.printf("\n-------------------------------------- Dados --------------------------------------\n");
		for(Item itt: getDados()) {
			if(i<=qtd) {
				System.out.printf("------------------- Dados na posicao %d -------------------\n", i-1);
				System.out.printf("Codigo: %d\n", itt.getCodigo());
				System.out.printf("Nome: %s\n", itt.getNome());
				System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
				itt.printDat();
				System.out.printf("-----------------------------------------------------------\n");
				i++;
			}
		}
		System.out.printf("-----------------------------------------------------------------------------------\n\n");
		
	}

	@Override
	public Item retornarObjeto(int indice) {
		
		int i=0;
		
		for(Item itt: getDados()) {
			
			if(i==indice) {
				
				System.out.printf("\n------------------- Objeto solicitado -------------------\n");
				System.out.printf("Codigo: %d\n", itt.getCodigo());
				System.out.printf("Nome: %s\n", itt.getNome());
				System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
				itt.printDat();
				System.out.printf("---------------------------------------------------------\n");
				
			}
			
			i++;
			
		}
		
		return this.dados[indice];
		
	}

	public void pesquisar(int codigo) {
		
		int i=0;
		
		for(Item itt: getDados()) {
			
			if(i<qtd) {
			
				if(codigo == getDados()[i].getCodigo()) {
				
					System.out.printf("\n------------------- Objeto solicitado -------------------\n");
					System.out.printf("Codigo: %d\n", itt.getCodigo());
					System.out.printf("Nome: %s\n", itt.getNome());
					System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
					itt.printDat();
					System.out.printf("---------------------------------------------------------\n");
				
				}
			}
			
			i++;
			
		}
		
	}
	
	public void pesquisar(String nome) {
		
		int i=0;
		
		for(Item itt: getDados()) {
			
			if(i<qtd) {
			
			if(nome.equals(dados[i].getNome())) {
				
				
				
					System.out.printf("\n------------------- Objeto solicitado -------------------\n");
					System.out.printf("Codigo: %d\n", itt.getCodigo());
					System.out.printf("Nome: %s\n", itt.getNome());
					System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
					itt.printDat();
					System.out.printf("---------------------------------------------------------\n");
					
				}
				
			}
			else {
				break;
			}
			
			i++;
			
		}
		
	}
	
	public void pesquisar(double precoInicial, double precoFinal) {
			
		int i=0;
		System.out.printf("\n-------------------------------- Dados Solicitados --------------------------------\n");
		for(Item itt: getDados()) {
			
			if(i<qtd) {
			
				if((precoInicial==itt.getValorUnitario()) || (precoFinal==itt.getValorUnitario())) {
				
					System.out.printf("\n------------------- Objeto solicitado -------------------\n");
					System.out.printf("Codigo: %d\n", itt.getCodigo());
					System.out.printf("Nome: %s\n", itt.getNome());
					System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
					itt.printDat();
					System.out.printf("---------------------------------------------------------\n");
					
				}
				
			}
			else {
				break;
			}
			
			i++;
		}
		System.out.printf("-----------------------------------------------------------------------------------\n\n");
		
	}
	
	public void pesquisar(GregorianCalendar dataInicial, GregorianCalendar dataFinal) {
		
		int i=0;
		System.out.printf("\n-------------------------------- Dados Solicitados --------------------------------\n");
		for(Item itt: getDados()) {
			
			if(i<qtd) {
			
				if((dataInicial==itt.getDataCadastro()) || (dataFinal==itt.getDataCadastro())) {
				
					System.out.printf("\n------------------- Objeto solicitado -------------------\n");
					System.out.printf("Codigo: %d\n", itt.getCodigo());
					System.out.printf("Nome: %s\n", itt.getNome());
					System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
					itt.printDat();
					System.out.printf("---------------------------------------------------------\n");
					
				}
				
			}
			else {
				break;
			}
			
			i++;
		}
		System.out.printf("-----------------------------------------------------------------------------------\n\n");
		
	}
	
	public void pesquisar(int qtdInicial, int qtdFinal) {
		
		int i=qtdInicial;
		System.out.printf("\n-------------------------------- Dados Solicitados --------------------------------\n");
		
		for(Item itt: getDados()) {
			if(i<=qtdFinal) {
				System.out.printf("\n------------------- Objeto solicitado -------------------\n");
				System.out.printf("Codigo: %d\n", itt.getCodigo());
				System.out.printf("Nome: %s\n", itt.getNome());
				System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
				itt.printDat();
				System.out.printf("---------------------------------------------------------\n");
			}
			i++;
		}
		System.out.printf("-----------------------------------------------------------------------------------\n\n");
		
	}
	
	public void printCupom() {
		
		int i = 1;
		double total=0;
		
		for(Item itt: getDados()) {
			if(i<=this.getQtd()) {
				System.out.printf("   %d            %d  %s           %.2f\n", i, itt.getCodigo(), itt.getNome(), itt.getValorUnitario());
				System.out.printf("pika\n");
				total = total + itt.getValorUnitario();
			}
			i++;
		}
		
		System.out.printf("   TOTAL                             %.2f\n",  total);
		
	}
	
	public double total() {
		
		double s = 0, i = 0;
		
		for(Item itt: getDados()) {
			if(i<this.qtd) {
				s = s + itt.getValorUnitario();
			}
			i++;
		}
		
		return s;
		
	}
	
	public void pesquisarex(String nome) {
	
		int i=0;
		
		for(Item itt: getDados()) {
			
			if(i<qtd) {
			
			if(nome.equals(dados[i].getNome())) {
				
					System.out.printf("\n------------------- Objeto solicitado -------------------\n");
					System.out.printf("Codigo: %d\n", itt.getCodigo());
					System.out.printf("Nome: %s\n", itt.getNome());
					System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
					itt.printDat();
					System.out.printf("---------------------------------------------------------\n");
					
			}
			}
			
		}
		
	}

	public void pesquisarex(int qtdInicial, int qtdFinal) {
		
		int i=qtdInicial;
		System.out.printf("\n-------------------------------- Dados Solicitados --------------------------------\n");
		
		for(Item itt: getDados()) {
				System.out.printf("\n------------------- Objeto solicitado -------------------\n");
				System.out.printf("Codigo: %d\n", itt.getCodigo());
				System.out.printf("Nome: %s\n", itt.getNome());
				System.out.printf("Valor unitario: %.2f\n", itt.getValorUnitario());
				itt.printDat();
				System.out.printf("---------------------------------------------------------\n");
		}
		System.out.printf("-----------------------------------------------------------------------------------\n\n");
		
	}
}

