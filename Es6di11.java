
public class Es6di11 {

	public static void main(String[] args) {
		
		int i = 0 ;
		int cont = 0;
		
		int[] vett = {1,3,6,2,12};
		
		while (i<vett.length) {
			
			if(!(vett[i] % 2 == 0) )
				cont++;
			
			i++;
				
		}
		
		System.out.println("i numeri dispari sono " + cont);

	}

}
