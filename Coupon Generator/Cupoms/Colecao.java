package Cupoms;

	public interface Colecao {
	
		public boolean inserir(Item i);
	
		public boolean remover();
	
		public boolean remover(int indice);
		
		public void atualizar(Item i, int indice);
	
		public boolean pesquisar(Item i);
	
		public boolean colecaoEstaVazia();
	
		public void imprimirDadosColecao();
	
		public Item retornarObjeto(int indice);

}
