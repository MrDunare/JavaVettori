import java.util.Scanner;

public class Es7di11 {

	public static void main(String[] args) {
		
		
			
			Scanner key = new Scanner(System.in);
			
			int i = 0 ;
			int cont = 0;
			
			
			int[] vett = {1,3,6,3,3,1,2,12,2,2,2,2,2};
			int k = key.nextInt();
			
			while(i < vett.length) {
				
				if(vett[i] == k)
					cont++;
				
				i++;
					
			}
			
			System.out.println("con k = " + k + " ci sono " + cont + " valori k");
			
			key.close();
			
	}

}
