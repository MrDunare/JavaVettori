
public class Es11di11 {

	public static void main(String[] args) {
		
//		Dato un array di N interi scrivere un algoritmo (o programma Java) per trovare la media dei suoi
//		valori e contare i valori sopra la media.

		
			
			int[] vett = {1,20,6,2,12};
			int i = 0 ;
			
			int somma = 0;
			
			while (i<vett.length) {
		
				somma += vett[i];
	
				i++;
					
			}
			double media = somma /(double) vett.length;
		
			int cont = 0;
			
			for (int j = 0; j < vett.length; j++) {
				
				if(vett[j] >= media)
					cont++;
				
			}
			
			System.out.println("la media vale " + media / vett.length);
			System.out.println(cont);
			
	}
	

}
