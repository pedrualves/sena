package mega.sena;

//classe que com base em 3000 sorteios realizas estatisticas
public class Estatistica {

	public int[][] getQtdSorteados(int sorteados[][]) {
		// variavel para contar a exibicao de cada numero
		int count[][] = new int[60][1];

		// inicializa o array contador
		for (int i = 0; i < 60; i++) {
			count[i][0] = 0;
		}

		// conta a repeticao de cada numero
		for (int k = 0; k < 3000; k++) {
			for (int i = 0; i < 6; i++) {
				count[sorteados[k][i] - 1][0]++;
			}
		}

		// ordenar a contagem
		int aux = 0;
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (count[i][0] < count[j][0]) {
					aux = count[i][0];
					count[i][0] = count[j][0];
					count[j][0] = aux;
				}
			}
		}

		// exibe a contagem
		for (int i = count.length; i > 0; i--) {
			System.out.println("Numero " + i + " = " + count[i-1][0] + " vezes");
		}

		return count;

	}

}
