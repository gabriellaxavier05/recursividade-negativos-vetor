package cotroller;

public class NegativosVetorController {

	//função recursiva
	public int negativosVetor(int vetor[], int tamanho) {
		if (tamanho == 0) { //se o vetor estiver vazio, não terá número par
	        return 0;
	    } 
		else {
			int ultimo = vetor[tamanho - 1];
	        int vn = negativosVetor(vetor, tamanho - 1);
	        
	        if (ultimo < 0) { //o último número é negativo
	        	return vn + 1; //se o último número for negativo, somar +1 (referente ao números de vezes encontradas)
	        }
	        else { //o último número é positivo
	        	return vn;
	        }
		}
	}
}
