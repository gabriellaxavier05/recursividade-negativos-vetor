package view;

import cotroller.NegativosVetorController;

public class PrincipalNegVetor {

	public static void main(String[] args) {
		
		//instanciando a classe controller e criando um objeto
		NegativosVetorController nv = new NegativosVetorController();
		
		int vetor[] = {1, 5, 2, 6, 3, -3};
		int tamanho = 6;
		
		//chamando a função recursiva
		int negvet = nv.negativosVetor(vetor, tamanho);
		System.out.println("Quantidade de números negativos no vetor: " + negvet);

	}

}
