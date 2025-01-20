# Atividade 6 - Máquina de Karaokê

## Descrição
Esta aplicação em Java implementa uma "Máquina de Karaokê" que permite:
- Adicionar músicas a uma fila.
- Listar todas as músicas na fila.
- Simular a execução das músicas em ordem de entrada na fila.

## Requisitos da Aplicação

1. **Fila de Músicas:**
   - Deve utilizar uma estrutura de dados para gerenciar a fila de músicas (neste caso, `LinkedList`).

2. **Funcionalidades Principais:**
   - **Adicionar Música:**
     - Usuários podem adicionar músicas à fila usando um método que insere as músicas no final da fila.
   - **Listar Músicas:**
     - Lista todas as músicas presentes na fila no momento.
   - **Tocar Música:**
     - Remove e exibe a música que está sendo "tocada" (a primeira na fila).

3. **Interatividade:**
   - O programa principal (`ProgramaPrincipal`) permite que o usuário insira nomes de músicas via entrada de texto.
   - Digitar "não" encerra o processo de adição de músicas e inicia a execução das mesmas.

4. **Execução em Ordem:**
   - As músicas devem ser tocadas na mesma ordem em que foram adicionadas.

## Estrutura do Código

### Classe `MaquinaDeKaraoke`

1. **Atributos:**
   - `filaDeMusicas`: Gerencia a fila de músicas usando `LinkedList`.

2. **Métodos:**
   - `adicionarMusica(String musica)`: Adiciona uma música ao final da fila.
   - `listarMusicas()`: Lista todas as músicas na fila. Exibe uma mensagem caso a fila esteja vazia.
   - `tocarMusica()`: Remove e exibe a primeira música da fila.

### Classe `ProgramaPrincipal`

1. **Objetivo:**
   - Interagir com o usuário para adicionar músicas e gerenciar a fila da Máquina de Karaokê.

2. **Fluxo:**
   - Solicita ao usuário o nome de uma música e a adiciona à fila.
   - O processo continua até que o usuário insira "não".
   - Lista todas as músicas adicionadas.
   - Executa todas as músicas em ordem.

## Como Executar

1. Compile as classes `MaquinaDeKaraoke` e `ProgramaPrincipal`.
2. Execute a classe `ProgramaPrincipal`.
3. Insira os nomes das músicas conforme solicitado pelo programa.
4. Digite "não" para finalizar e iniciar a execução das músicas.


