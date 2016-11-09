package mega.sena;

import java.util.Scanner;

//classe inicial
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int opt = -1;
		Scanner entrada = new Scanner(System.in);

		while (opt != 9) {
			// menu
			System.out.println("\n------------------------------------------");
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Sortear 3000 ");
			System.out.println("2. Sortear 3000 e apurar a quantida de vezes que o numero foi sorteado");
			System.out.println("3. Sortear 3000 e apurar as 15 duplas que mais sairam");
			System.out.println("4. Sortear 3000 e apurar os 15 números que mais sairam");
			System.out.println(
					"5. Sortear 3000 e listar a quantidade de jogadas desde a ultima vez que o número foi sorteado");
			System.out.println("6. Simular 3 jogadores");
			System.out.println("9. Sair: ");

			// opção digitada é válida
			try {
				opt = entrada.nextInt();
			} catch (Exception e) {
				System.out.println("Digite apenas números!");
			}

			MegaSena mega = new MegaSena();
			Estatistica estatistica = new Estatistica();

			// escolhe o que fazer
			switch (opt) {
			case 1:
				mega.sortear3000();
				break;
			case 2:
				estatistica.getQtdSorteados(mega.sortear3000());
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Izabela programe essa funcionalidade");
				break;

			case 6:
				Simulador simulador = new Simulador();
				simulador.simularTresJogadores();
				break;

			case 9:
				System.out.println("Bye bye");
			}

		}

	}

}
