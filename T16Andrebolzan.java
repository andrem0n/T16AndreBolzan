public class T16Andrebolzan {

	public static void main(String[] args) {
		
		int TAM = 20,i;
		int V[] = new int [TAM];
		
		for(i =0; i < TAM; i++){
			V[i] = i+3;
		}
		
		System.out.print("Vetor: ");
		for(i =0; i < TAM; i++){
			System.out.print(V[i] + " ");
		}
		System.out.println(" ");
		
		System.out.print("Vetor multiplos de 3: ");
		for(i =0; i < TAM; i++){
			if(V[i] % 3 == 0){
				System.out.print(V[i] + " ");
			}
		}
	}

}

