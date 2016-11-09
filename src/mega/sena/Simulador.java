package mega.sena;

import java.util.InputMismatchException;
import java.util.Scanner;

//classe responsavel pela simulacao de sorteios feitos pelos jogadores
public class Simulador {

	private Scanner entrada = new Scanner(System.in);
	private Bilhete[] bilhetes = new Bilhete[3];

	public void simularTresJogadores() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do jogador(a): " + (i + 1));

			Bilhete bilhete = new Bilhete();
			bilhete.setJogador(entrada.next());

			int count = 0, numero = 0;

			while (count < 6) {
				int[] numeros = new int[6];

				for (int j = 0; j < 6;) {
					System.out.println("Jogador(a) " + bilhete.getJogador() + ",informe o número " + (j + 1) + ":");
					try {
						numero = entrada.nextInt();
						if (numero < 1 || numero > 60) {
							System.out.println("Digite apenas números entre 1 e 60:");
						} else {
							numeros[j] = numero;
							j++;
							count++;
						}
						if (j == 6) {
							bilhete.setJogo(numeros);
							bilhetes[i] = bilhete;
						}
					} catch (InputMismatchException e) {
						entrada = new Scanner(System.in);
						System.out.println("Digite apenas números!");
					}
				}
			}
		}

		for (int j = 0; j < bilhetes.length; j++) {
			System.out
					.println("Jogador " + bilhetes[j].getJogador() + ", numeros escolhidos: " + bilhetes[j].getJogo());
		}
	}
}
