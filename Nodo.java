package lde;

public class Nodo {

	//classe que cria a ferramenta nodo
	private int valor;
	private Nodo proximo, anterior;
	
	
	public Nodo () {
		this.setValor(0);
		this.setProximo(this.setAnterior(null));
				
	}
	
	
	public Nodo (int v, Nodo p, Nodo a) {
		this.valor = v;
		this.proximo = p;
		this.anterior = a;
		
	}

	

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public Nodo getAnterior() {
		return anterior;
	}


	public Nodo setAnterior(Nodo anterior) {
		this.anterior = anterior;
		return anterior;
	}


	public Nodo getProximo() {
		return proximo;
	}


	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
}
