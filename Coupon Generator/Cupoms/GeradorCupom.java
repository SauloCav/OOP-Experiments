package Cupoms;

public class GeradorCupom {
	
	public void imprimirNota(CupomFiscal c) {
		
		Item itt = new Item();
		ColecaoItem ci = new ColecaoItem();
		double troco = c.getDinheiroRecebido();
		
		System.out.printf("\n%s\n", c.getNomeLoja());
		System.out.printf("CNPJ: %s\n", c.getCnpj());
		itt.printDataeHora();
		System.out.printf("\n-----------------------------------------------\n");
		if(c.validarCNPJ(c.getCnpjConsumidor())) {
			System.out.printf("CNPJ/CPF: %s", c.getCpfConsumidor());
		}
		else if(c.validarCPF(c.getCpfConsumidor())) {
			System.out.printf("CNPJ/CPF: %s", c.getCpfConsumidor());
		}
		System.out.printf("\n-----------------------------------------------\n");
		System.out.printf("                  CUPOM FISCAL\n");
		System.out.printf("   ITEM            CODIGO/NOME           VALOR");
		System.out.printf("\n_______________________________________________\n");
		ci.printCupom();
		System.out.printf("   VALOR RECEBIDO R$                     %.2f\n", c.getDinheiroRecebido());
		troco = troco - ci.total();
		if(troco>0) {
			System.out.printf("   TROCO R$                     %.2f", troco);
		}
		else {
			System.out.printf("   FICOU DEVENDO                 %.2f", troco);
		}
		System.out.printf("\n-----------------------------------------------\n");
		
	}
	
	public  void imprimirNota(CupomFiscal c[]) {
		
		int i = 0;
		Item itt = new Item();
		ColecaoItem ci = new ColecaoItem();
		double troco = 0;
		
		for(CupomFiscal cup: c) {
			
			System.out.printf("\n%s\n", c[i].getNomeLoja());
			System.out.printf("CNPJ: %s\n", c[i].getCnpj());
			itt.printDataeHora();
			System.out.printf("\n-----------------------------------------------\n");
			if(c[i].validarCNPJ(c[i].getCnpjConsumidor())) {
				System.out.printf("CNPJ/CPF: %s", c[i].getCpfConsumidor());
			}
			else if(c[i].validarCPF(c[i].getCpfConsumidor())) {
				System.out.printf("CNPJ/CPF: %s", c[i].getCpfConsumidor());
			}
			System.out.printf("\n-----------------------------------------------\n");
			System.out.printf("                  CUPOM FISCAL\n");
			System.out.printf("   ITEM            CODIGO/NOME           VALOR");
			System.out.printf("\n_______________________________________________\n");
			ci.printCupom();
			System.out.printf("   VALOR RECEBIDO R$                     %.2f\n", c[i].getDinheiroRecebido());
			troco = c[i].getDinheiroRecebido();
			troco = troco - ci.total();
			if(troco>0) {
				System.out.printf("   TROCO R$                     %.2f", troco);
			}
			else {
				System.out.printf("   FICOU DEVENDO                 %.2f", troco);
			}
			System.out.printf("\n-----------------------------------------------\n");
			
			i++;
			
		}
		
		
	}

}
