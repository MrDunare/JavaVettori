
public class EsSommaNoMultipli3 {

	public static void main(String[] args) {
		
		int i = 0 ;
		int somma = 0;
		
		int[] vett = {1,3,6,2,12};
		
		while (i<vett.length) {
			
			if(!(vett[i] % 3 == 0))
				somma += vett[i];
			
			i++;
		}
		
		System.out.println("la somma dei multipli di 3 vale " + somma);


	}

}
