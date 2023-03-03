
public class EsStampaCaselle {

	public static void main(String[] args) {
		
		/*
		 * dato un vettore di Stringhe gia init
		 * 
		 * stampare tutte le stringhe si trovano in una posizione pari del vettore
		 * 
		 * 
		 * 
		 */
		String [] vettStringhe = {"cane","gatto","pallone","volpe","racchetta","sasso"};
		int i = 0;
		
		while(i<vettStringhe.length) {
			
			if(i % 2 == 0) 
				System.out.println(vettStringhe[i]);
			
			i++;	
			
		}

	}

}
