package mega.sena;

//objeto que atrela um jogador a um bilhete de 6 numeros
public class Bilhete {
	private String jogador;
	private int[] jogo = new int[6];

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	public String getJogo() {
		int aux = 0;
		for (int i = 0; i < this.jogo.length; i++) {
			for (int j = 0; j < this.jogo.length; j++) {
				if (this.jogo[i] < this.jogo[j]) {
					aux = this.jogo[i];
					this.jogo[i] = this.jogo[j];
					this.jogo[j] = aux;
				}
			}
		}
		return this.jogo[0] + " " + this.jogo[1] + " " + this.jogo[2] + " " + this.jogo[3] + " " + this.jogo[4] + " "
				+ this.jogo[5];
	}

	public void setJogo(int[] jogo) {
		this.jogo = jogo;
	}

}
