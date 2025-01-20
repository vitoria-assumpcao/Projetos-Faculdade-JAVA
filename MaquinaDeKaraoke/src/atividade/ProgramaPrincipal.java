package atividade;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        int sum=0;
        Scanner leitura = new Scanner(System.in);
        MaquinaDeKaraoke maquina = new MaquinaDeKaraoke();  // Instanciando a classe corretamente




        while (true) {

            System.out.println("Digite o nome da música: ");
            String musica = leitura.nextLine();

            if (musica.equalsIgnoreCase("não")) {
                break;
            }

            maquina.adicionarMusica(musica);
            sum += 1;

        }

        maquina.listarMusicas();

        for (int i = 0; i < sum; i++) {
            maquina.tocarMusica();
        }

    }

}
