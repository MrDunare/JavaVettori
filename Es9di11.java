
public class Es9di11 {

	public static void main(String[] args) {
		
		int[] vett = {33,3,6,2,12,88,8,15,21,20};
		int i = 1 ;
		int massimo = vett[0];
		int indiceMassimo=0;
		
		while (i<=vett.length-1) {
			
			if(vett[i] > massimo) {
				massimo = vett[i];
				indiceMassimo=i;
			}	
				
			i++;	
				
		}
		
		System.out.println(massimo );
		System.out.println(indiceMassimo );
		
	}

}
