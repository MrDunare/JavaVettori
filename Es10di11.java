
public class Es10di11 {

	public static void main(String[] args) {
		
		int[] vett = {3,6,2,12,8-18};
		int min = vett[0];
		int indiceMinimo = 0;
		
		
		for (int i = 0; i < vett.length; i++) {
			if(vett[i] < min) {
				min = vett[i];
				indiceMinimo=i;
			}			
			
		}
		
		System.out.println(min);
		System.out.println(indiceMinimo);
		

	}

}
