
public class Es4di11 {

	public static void main(String[] args) {
		
		int[] vett = {10,8,6,5,3,12};
		int i = 0 ;
		int somma = 0;
		
		
		while (i<vett.length) {
			
			if(vett[i] % 2 == 0 && vett[i] % 3 == 0)
				somma += vett[i];
			
			i++;
				
		}
		
		
		System.out.println("La somma vale " + somma);

	}

}
