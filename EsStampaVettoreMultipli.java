import java.util.Scanner;

public class EsStampaVettoreMultipli {

	public static void main(String[] args) {
		
		/*
		 * prendere un numero da tasiera con scanner
		 * 
		 * stampare tutti gli elementi del vettore che sono multipli dell elemento inserito
		 * 
		 */
		
		Scanner key = new Scanner(System.in);
		int[] vett = { 6 , 8 , 36 , 98 , 12 ,24 ,98,996,109234 }; 
		
		int j = 0;
		while(j<vett.length) {
			System.out.print(vett[j] + " ");
			j++;
		}
		
		System.out.println("\n---------------- 👨‍💻");
		
		System.out.println("Inserisci il numero ");
		int numero = key.nextInt();
		int i = 0;
		
		while(i < vett.length) {
			
			if(vett[i] % numero == 0)
				System.out.println(vett[i] + " è un multiplo di "  + numero);	
		
			i++;
		}
		key.close();
	}

}
