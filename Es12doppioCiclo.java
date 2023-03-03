
public class Es12doppioCiclo {

	public static void main(String[] args) {
		
		/*
		 * doppio ciclo
		 */
		
		int [] array = {1,2,3,4,5,3,6,7,8};
		
		int cont = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Sto considerando " + array[i]);
			
			for (int j = i+1; j < array.length; j++) {
				
				System.out.println("Sto facendo il confronto tra : " + array[i] + " e " + array[j]);
				
				if(array[i] == array[j] ) {
					cont++;
					break;
				}
			}
			
			System.out.println(" ");
			
			if(cont >= 1) 
				break;
				
		}
		
		if(cont >= 1) 
			System.out.println("ok");
		else
			System.out.println("no");

	}

}
