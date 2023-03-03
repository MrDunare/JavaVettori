
public class EsProduttoria {

	public static void main(String[] args) {
		
		/*
		 * dato un vettore creare un programma che stampa la produttoria
		 * 
		 */
		
		int[] vettore = {1,3,2,6};
		
		int i = 0;
		
		int produttoria = 1;
		
		while(i<vettore.length) {
			produttoria *= vettore[i];
			
			i++;
		}
		
		System.out.println("prodotto ----> " + produttoria);
	}

}
