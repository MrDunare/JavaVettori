
public class EsVettori5 {

	public static void main(String[] args) {
		
		//Somma del vettore 
		//gia inizializzato 10 -40-60-100
		
		int somma = 0;
		int i = 0;
		//vettore inizializzato
		int [] vett = {10,40,60,100};
		
		//ciclo while da i a lunghezza vettore
		while(i<vett.length) {
			
			//somma += indice in prima posizione e ripete il ciclo ;
			somma += vett[i];
			
			//aumento la i
			i++;	
			
			
			
		}
		System.out.println("----------------");
		
		//stampo la somma degli elementi del vettore
		System.out.println("La somma vale " + somma);

	}

}
