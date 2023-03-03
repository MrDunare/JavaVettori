import java.util.Scanner;

public class EsVettori3riempimentoManuale {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int lunghezzaVett = 0;
		
		
		//finchè lunghezzaVett è minore di 0 continuo a chiedere quanti elementi
		while(lunghezzaVett <= 0) {
			
			System.out.println("Inserisci la dimensione :  ");
			lunghezzaVett = key.nextInt();
		}	
			
		System.out.println("ok creo un vettore di " + lunghezzaVett + " elementi");
		
	
		//creo vettore
		int [] vett = new int[lunghezzaVett];
		
		int i = 0;
		
		
		/*Finchè la i che sta a 0 è minore della lunghezza del vettore aggiungo elementi al vettore
		 * incremento la i
		 */
		
		while(i< vett.length) {
			
			System.out.println("inserisci elemento");
			
			vett[i] = key.nextInt();
			
			i++;
			
		}
		System.out.println("------------");
		
		//rimetto la i a 0
		i = 0;

		//lettura del vettore		
		while(i<vett.length) {
			System.out.print(vett[i] + "\t");
			i++;
		}
				
		key.close();
		
	}

}
