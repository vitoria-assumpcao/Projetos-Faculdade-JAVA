# Trabalho 1 – Lista Duplamente Encadeada com Interface Gráfica

## Descrição  
Esta aplicação em Java implementa uma **Lista Duplamente Encadeada (LDE)** que permite ao usuário:
- Inserir valores inteiros de forma ordenada.
- Remover valores específicos da lista.
- Pesquisar por valores e obter sua posição.
- Imprimir todos os valores da lista e suas respectivas posições.

A interface gráfica (GUI) fornece um menu interativo para a execução de todas as operações, facilitando a manipulação da LDE.

---

## Requisitos da Aplicação

1. **Estrutura de Dados – LDE (Lista Duplamente Encadeada):**  
   - Os valores inteiros armazenados na lista **devem permanecer em ordem crescente**.
   - **Não são permitidos valores repetidos.**

2. **Funcionalidades Principais:**
   - **Inserir Nodo:**
     - Insere um novo nodo na posição correta da LDE, mantendo a ordenação crescente.
   - **Remover Nodo:**
     - Remove o nodo que contém um valor inteiro especificado pelo usuário.
   - **Imprimir Lista:**
     - Imprime todos os valores da LDE com suas respectivas posições.
   - **Pesquisar Valor:**
     - Verifica se um valor está presente na LDE.
     - Se encontrado, exibe a posição.
     - Se não encontrado, informa uma única vez sua ausência.

3. **Interatividade:**
   - O programa apresenta um **menu gráfico com as seguintes opções:**

| Por favor, escolha uma opção: |
| |
| 1. Inserir um nodo |
| 2. Remover um nodo |
| 3. Imprimir todos os valores da LDE |
| 4. Pesquisar um valor na LDE |


---

## Estrutura do Código

### Classe `Nodo`

- **Atributos:**
  - `int valor`: Valor inteiro armazenado no nodo.
  - `Nodo anterior`: Referência ao nodo anterior.
  - `Nodo proximo`: Referência ao próximo nodo.
- **Função:** Representa cada elemento da LDE com seus ponteiros de ligação bidirecional.

---

### Classe `LDE`

- **Atributos:**
  - `Nodo inicio`: Referência para o primeiro nodo da lista.
  - `Nodo fim`: Referência para o último nodo da lista.

- **Métodos:**
  - `inserir(int valor)`: Insere o valor na posição correta (ordem crescente).
  - `remover(int valor)`: Remove o nodo que contém o valor especificado.
  - `imprimir()`: Exibe todos os valores da LDE com suas posições.
  - `pesquisar(int valor)`: Verifica a existência do valor e exibe a posição, se aplicável.

---

### Classe `ProgramaPrincipal`

- **Objetivo:**  
  Fornecer uma interface gráfica amigável para o usuário executar todas as operações na LDE.

- **Fluxo:**  
  - Exibe o menu com as quatro opções principais.
  - Executa a ação correspondente de acordo com a escolha do usuário.
  - Exibe mensagens de sucesso, falha ou posição, conforme a operação.

---

## Como Executar

1. Compile as classes `Nodo.java`, `LDE.java` e `ProgramaPrincipal.java`.
2. Execute a classe `ProgramaPrincipal`.
3. Utilize a interface gráfica para:
   - Inserir valores inteiros.
   - Remover valores desejados.
   - Pesquisar por números na LDE.
   - Visualizar a lista completa com posições.
