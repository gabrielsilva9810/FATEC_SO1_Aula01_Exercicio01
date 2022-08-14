package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	// ATIVIDADE 01 - SISTEMAS OPERACIONAIS I
	public void operacaoVetor(int qtdVetor, int qtdVetorB) {
		
		//STRING --> TEMPO
		String var = "a";
		double tempoInicial = System.nanoTime();
		
		for (int i = 0; i < qtdVetor; i++) {
			var = var + "a";
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,  9);
		System.out.println("Tempo String do Vetor --> " + tempoTotal + "s.");
		/*-----------------------------------------------------------------------------------------*/
		
		//BUFFER --> TEMPO
		StringBuffer buffer = new StringBuffer();
		double tempoInicialB = System.nanoTime();
		
		for(int i = 0; i < qtdVetor ; i++) {
			buffer.append(qtdVetor);
		}
		
		double tempoFinalB = System.nanoTime();
		double tempoTotalB = tempoFinalB - tempoInicialB;
		tempoTotalB = tempoTotalB / Math.pow(10,  9);
		System.out.println("Tempo Buffer do Vetor --> " + tempoTotalB + "s.");
	}
	
}