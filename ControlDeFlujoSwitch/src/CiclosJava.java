import java.util.Scanner;


public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ciclo For
		 * for(int i = init; condición; incremente){
		 * 	codigo
		 * }
		 */
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1);
		}
		//tablaXN();
		ejercicio();

	}
	
	public static void tablaXN() {
		Scanner n = new Scanner(System.in);
		System.out.println("Ingresa un numero:");
		int N = n.nextInt();
		System.out.println("La tabla del " + N + ": " );
		for(int i = 1; i < 11; i++) {
			System.out.println(N + " x " + i + " = " + i*N);
		}
	}
	
	public static void ejercicio() {
		Scanner n = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		
		int N = n.nextInt();
		
		int sumPar = 0;
		int sumImpar = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i%2 == 0) {
				sumPar += i;
			}
			else {
				sumImpar += i;
			}
		}
		System.out.println("Suma Numeros Par: " + sumPar  
				+ "\nSuma Numero Impar: "+ sumImpar);
	}

}
