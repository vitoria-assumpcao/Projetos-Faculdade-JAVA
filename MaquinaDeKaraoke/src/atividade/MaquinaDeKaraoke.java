package atividade;

import java.util.LinkedList;

public class MaquinaDeKaraoke {

    private LinkedList<String> filaDeMusicas;  // Fila de músicas

    // Construtor para inicializar a fila
    public MaquinaDeKaraoke() {
        filaDeMusicas = new LinkedList<>();
    }

    // Método para adicionar uma música na fila
    public void adicionarMusica(String musica) {
        filaDeMusicas.addLast(musica);  // Adiciona no final da fila
        System.out.println("Música \"" + musica + "\" adicionada à fila.");
    }

    // Método para listar todas as músicas na fila
    public void listarMusicas() {
        if (filaDeMusicas.isEmpty()) {
            System.out.println("A fila de músicas está vazia.");
        } else {
            System.out.println("Fila de músicas:");
            for (String musica : filaDeMusicas) {
                System.out.println("- " + musica);
            }
        }
    }

    // Método para simular a execução e remoção de uma música da fila
    public void tocarMusica() {
        if (filaDeMusicas.isEmpty()) {
            System.out.println("Não há músicas para tocar.");
        } else {
            String musica = filaDeMusicas.removeFirst();  // Remove a primeira música da fila
            System.out.println("Tocando: \"" + musica + "\"");
        }
    }
}