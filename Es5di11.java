
public class Es5di11 {

	public static void main(String[] args) {
		
		//Dato un array di N interi scrivere un algoritmo (o programma Java) per contare gli elementi pari.
		
		
		int i = 0 ;
		int cont = 0;
		
		int[] vett = {10,8,3,15,5};
		
		while (i<vett.length) {
			
			if(vett[i] % 2 == 0 )
				cont++;
			
			i++;
				
		}
		
		System.out.println("i numeri pari sono " + cont);

	}

}
