# ATIVIDADE AVALIATIVA PRÁTICA - Implementação de uma aplicação que permite o usuário informar 2 números reais e realizar a divisão deles. A aplicação deve ter os seguintes itens:


## Exigências da Aplicação

### 1. Estrutura do Projeto:
- Criar um projeto chamado `ProjetoAP1_SEUNOME`.

### 2. Interface Gráfica:
- Criar um `JFrame` com as seguintes características:
  - Dimensões: 600 x 250.
  - Não redimensionável.
  - Título: "Atividade Prática I - SEU NOME".
- Configurar o `contentPane` para conter três painéis principais dividindo a tela em três áreas de componentes, utilizando apenas gerenciadores de layout aprendidos em aula:
  - `FlowLayout`
  - `BoxLayout`
  - `GridLayout`
  - `BorderLayout`.

### 3. Painéis e Componentes:

#### **Painel 1 (Superior):**
- Contém um `JTextField` para exibir os resultados das divisões.
- Configuração do tamanho: `setPreferredSize(new Dimension(600, 70))`.
- Fonte: Tahoma, tamanho 30, em negrito.

#### **Painel 2 (Central):**
- Contém:
  - Dois `JLabel`s com os textos:
    - "Primeiro Número"
    - "Segundo Número".
  - Dois `JTextField`s para entrada dos números.
- Componentes alinhados à esquerda.
- Espaçamento vertical (gap): 30.
- Fonte dos textos: Tahoma, tamanho 14, em negrito.

#### **Painel 3 (Inferior):**
- Contém dois `JButton`s com os textos:
  - "Dividir"
  - "Limpar".
- Fonte dos botões: Tahoma, tamanho 14, em negrito.

#### **Estilo dos Painéis:**
- Todos os painéis devem:
  - Ter bordas configuradas.
  - Ter a cor de fundo: `Color.PINK`.

### 4. Funcionalidades:

#### Botão **"Dividir"**:
- Realizar a divisão dos números informados nos campos de entrada.
- Exibir o resultado no `JTextField` superior.

#### Botão **"Limpar"**:
- Limpar os campos de entrada e o campo de resultado.

### 5. Tratamento de Exceções:
- Monitorar e tratar as exceções:
  - **`NumberFormatException`**:
    - Caso os valores inseridos não sejam números válidos.
    - Emitir uma mensagem informativa no console.
    - Limpar todos os campos.
  - **`ArithmeticException`**:
    - Caso ocorra tentativa de divisão por zero.
    - Emitir uma mensagem informativa no console.
    - Limpar todos os campos.

### 6. Observação Importante:
- Atividade individual.
- Códigos copiados/adaptados de outras fontes resultarão na desconsideração da nota para todos os envolvidos.


