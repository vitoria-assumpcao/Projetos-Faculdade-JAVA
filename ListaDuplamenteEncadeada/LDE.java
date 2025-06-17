package lde;

public class LDE {
	private Nodo inicio;

	public LDE() {

		this.setInicio(null);

	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public void insereValor(int valor) {

		Nodo novo = new Nodo(valor, null, null);

		if (this.inicio == null) {
			this.inicio = novo;  // se a lista estiver vazia irá adicionar o novo valor no primeiro nodo;
		} 
		
		else if (valor < this.inicio.getValor()) {  //irá verificar o valor que quer ser inserido com o valor setado do início;
			
			novo.setProximo(this.inicio); //condição sendo verdadeira, o próximo será o antigo valor que era inicial
			this.inicio.setAnterior(novo); //ainda como se fosse o segundo a adicionar o início será o novo valor
			this.inicio = novo;  //inicio se torna o novo valor de nodo
		}
		
		
		else {
			Nodo aux = this.inicio;  //implementa um ponteiro auxiliar para navegar entre os nodos

			/*adiciona um loop while para o ponteiro aux caminhar pelos nodos depois do inicial e verificar
			 * enquanto ainda existir um próximo nodo e se o valor do próximo nodo for menor
			 * do que o valor que quer ser inserido
			 */
			while (aux.getProximo() != null && aux.getProximo().getValor() < valor) {
				
				aux = aux.getProximo();
			}
			
			
			// quando é encontrado o final da lista, sabemos que o valor a ser inserido é o maior
			if (aux.getProximo() == null) {
				aux.setProximo(novo); //então o ultimo nodo será apontado p novo nodo, inserido no fim
				novo.setAnterior(aux); // e o novo nodo aponta de volta pro anterior
			}

			/*o ultimo else irá servir para quando o valor a ser inserido não será nem o maior nem 
			 * o menor, por isso entrará no meio da LDE.
			 */
			else {
				
			Nodo proximo = aux.getProximo(); 
			/* para realizar a inserção no meio, preciso salvar em
			* uma nova variavel o que ficará como próximo do novo nodo
			*/
			
			novo.setProximo(proximo); /*então o nodo salvo em proximo vai ser setado como proximo depois
			do  novo nodo*/
			novo.setAnterior(aux);//e aux está o nodo que está sendo setado como anterior ao novo nodo add
			aux.setProximo(novo); //setando o proximo do aux como o novo nodo
			proximo.setAnterior(novo); //e setando o anterior do proximo como o novo nodo
			
			}

		}

	}

	public void imprime() {

		/*método basico para imprimir os números da lista, verificando se primeiramente ela
		 * não está vazia como inicio sendo nulo, e depois implementando um ponteiro aux
		 * para caminhar entre os nodos começando no inicio e colocando um contador "posicao" que
		 * conta enquanto o ponteiro aux caminhar e imprimir os valores.
		 */
		if (this.inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			Nodo aux = this.inicio;
			int posicao = 1;
			while (aux != null) {
				System.out.println("Valor: " + aux.getValor() + ", está na posição: " + posicao);
				aux = aux.getProximo();
				posicao++;
			}
		}

	}
	

	public void pesquisa(int valor) {
		
		// Verifica se a lista está vazia
		
		if (this.inicio == null) {
			System.out.println("Lista vazia!");
			return;
		}

		/*Nesse método utilizamos tambem um ponteiro aux que caminha entre os nodos para pesquisar o
		 * valor solicitado e usa um boolean para marcar quanto encontrar
		 */
		
		Nodo aux = this.inicio;
		int posicao = 1;
		boolean encontrou = false;

		while (aux != null) {  //enquanto a lista não tiver vazia
			if (aux.getValor() == valor) {  //se o ponteiro encontrar um nodo com o mesmo valor
				System.out.println("Valor encontrado na posição: " + posicao);
				
				encontrou = true; //muda o boolean para verdade
				break; 
			}
			aux = aux.getProximo(); //se nao continua pegando o proximo
			posicao++;     //e adicionando ao contador
		}

		if (!encontrou) {  //se o boolean retornar falso avisa que não foi encontrado
			System.out.println("Valor não encontrado!");
		}
	}
	

	public void removeValor(int valor) {

		
		if (this.inicio == null) {
			System.out.println("Lista vazia!");
		}

		
		else {

			boolean encontrou = false;  
			
			if (this.inicio.getProximo() == null) { //verifica se o proximo nodo é nulo a partir do inicio
				//oq implica em uma lista de 1 valor só

				
       // verifica se encontrou o valor se nao encontrou vai la pro if (!encontrou)
				if (this.inicio.getValor() == valor) {

					System.out.println("Valor: " + this.inicio.getValor() + " removido!");
					this.inicio = null; //seta o inicio como nulo pois só existia um valor na lista
					encontrou = true;
				}
			}

			
			else {
				/*se a lista tiver mais de um valor irá cair nesse else, onde será implementado um
				 * ponteiro aux para caminhar entre os nodos (lista com mais de um valor)
				 */
				Nodo aux = this.inicio;

				while (aux != null) { //enquanto o aux não for nulo, irá caminhar pela lista para encontrar o valor solicitado

					if (aux.getValor() == valor) {

						encontrou = true;
						System.out.println("Valor: " + aux.getValor() + " removido!");
						
						//encontrando o valor no meio da lista (quando anterior não for nulo ele não é o primeiro)
						
						if (aux.getAnterior() != null) {
							//nodo anterior aponta para o próximo do removido
							aux.getAnterior().setProximo(aux.getProximo()); 
							/*ajeitaremos a lista para remover o valor e encadeá-lo novamente
							 * pegando o ponteiro do setProximo do nodo anterior e setando para o nodo
							 * desse proximo (que era o proximo do novo removido)
							 */
						}

						else {
							this.inicio = aux.getProximo(); //se o anterior for nulo então só coloca o novo nodo como inicio
						}
						if (aux.getProximo() != null) { //quando tiver nodo no Proximo (o valor a ser removido nao esta no fim)
							//o proximo nodo aponta de volta para o anterior do removido
							aux.getProximo().setAnterior(aux.getAnterior());
						//pega o getProximo do nodo Proximo e seta o setAnterior para o getAnterior
						}
						
						//seta os ponteiros do nodo removido para nulo (a lixeira do java recolhe depois)
						aux.setProximo(null); 
						aux.setAnterior(null);
						aux = null;
						break;
					}
					aux = aux.getProximo(); //se não for o valor encontrado continua no loop
				}
			}
			if (!encontrou) {
				System.out.println("Valor não encontrado!");
			}

		}
	}
}
