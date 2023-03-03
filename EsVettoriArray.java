
public class EsVettoriArray {

	public static void main(String[] args) {
		
		/*
		 * Per creare un vettore si usa questa sintatti : tipoVettore [] nomVettore = new tipoVettore [DIMENSIONE_VETTORE]
		 */

		int [] vettNumeri = new int [3];
		
		vettNumeri[0] = 10; // per riempire/usare un elemento del vettore 
		
		vettNumeri[2] = 60;
		
		System.out.println(vettNumeri[0]);
		System.out.println(vettNumeri[1]);
		System.out.println(vettNumeri[2]);
		
		System.out.println("-------------");
		
		int i = 0;
		
		while(i < vettNumeri.length) {
			
			System.out.println(vettNumeri[i] + " ");
			
			i++;
			
		}
		
		
	}

}
