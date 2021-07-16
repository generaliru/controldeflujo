import java.util.Scanner;


public class FlujoSwitch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * switch(condicion){
		 * 	case valor:
		 * 		codigo
		 *      codigo
		 *      codigo
		 *      codigo
		 *      break;
		 *  case valor1:
		 * 		codigo
		 *      codigo
		 *      codigo
		 *      codigo
		 *      break;
		 *  default:
		 *  codigo por defecto
		 *  }   
		 *  
		 */
		int dia = 7;
		String mensaje = "";
		
		switch (dia) {
			case 1:
				mensaje = "Lunes";
				break;
			case 2:
				mensaje = "Martes";
				break;
			case 3:
				mensaje = "Miercoles";
				break;
			case 4:
				mensaje = "Jueves";
				break;
			case 5:
				mensaje = "Viernes";
				break;
			case 6:
				mensaje = "Sabado";
				break;
			case 7:
				mensaje = "Domingo";
				break;
		}
		//System.out.println(mensaje);
		//System.out.println("Resultado: " + calculadora());
		int operacion = 0;
		Scanner op = new Scanner(System.in);
		do {	
			System.out.println("Ingresa numero a:");
			float a = op.nextFloat();
			System.out.println("Ingresa numero b:");
			float b = op.nextFloat();
			System.out.println("Ingresa la opetacion (+,1), (-,2), (x,3), (/,4) y (Exit,0):");
			operacion = op.nextInt();
			if(operacion >= 1 && operacion <= 4 ) {
				System.out.println("Resultado" + calculadora(operacion, a, b));
			}
		}while(operacion != 0);
	}
		
	
	public static float calculadora(int operacion, float a, float b) {
		float resultado = 0;
		switch(operacion) {
		case 1:
			resultado = a + b;
			break;
		case 2:
			resultado = a - b;
			break;
		case 3:
			resultado = a * b;
			break;
		case 4:
			if(b == 0) {
				resultado = 0;
			}
			else {
				resultado = a / b;
			}
			break;
		}
		
		return resultado;
	}
	
	public static String triangulo() {
		String msg = "No es un triangulo";
		Scanner t = new Scanner(System.in);
		System.out.println("Ingresa los angulos del triangulo: \nLado a:");
		float a = t.nextFloat();
		System.out.println("Ingresar angulos b:");
		float b = t.nextFloat();
		System.out.println("Ingresar angulos c");
		float c = t.nextFloat();
		if ((a + b + c) == 180) {
			msg = "Si es un triangulo";
		}
		return msg;
	}

}
