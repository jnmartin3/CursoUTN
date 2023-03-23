package cursoUTN;

import java.util.Scanner;

public class ejemplo1 {
	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		int contador = numeroInicio;
		
		//Lugar para insertar la consulta al usuario de los numeros de inicio y fin
				
		while(contador <= numeroFin) {
			System.out.print(contador);
			
			if(contador < numeroFin) {
				System.out.print(", ");
			}
			
			contador += 1;
		}
		
		//Codigo para elegir y mostrar solo pares o impares
		
		System.out.println();
		
		String decide="";
		
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Ingrese 'par' para ver los numeros pares o 'impar' para ver los numeros impares");
		
		decide = lectura.next();
		
		//Numeros Pares
		if(decide.equals("par")) {
			contador = numeroInicio;
			System.out.println();
			System.out.println("Numeros pares en orden ascendente");
			
			//pares en orden ascendente
			while(contador <= numeroFin) {
				if(contador%2 <= 0) {
					System.out.print(contador  + ", ");
				}
							
				contador += 1;
			}
			
			//pares en orden descendente
			System.out.println();
			System.out.println("Numeros pares en orden descendente");
			for(int i=numeroFin; i>=numeroInicio; i--) {
				if(i%2 <= 0) {
					System.out.print(i + ", ");
				}
			}
		}
		
		//Numeros impares
		if(decide.equals("impar")) {
			contador = numeroInicio;
			System.out.println();
			System.out.println("Numeros impares en orden ascendente");
			
			while(contador <= numeroFin) {
				if(contador%2 > 0) {
					System.out.print(contador);
					if(contador < numeroFin) {
						System.out.print(", ");
					}
				}
				contador += 1;
			}
			
			//impares en orden descendente
			System.out.println();
			System.out.println("Numeros impares en orden descendente");
			for(int i=numeroFin; i>=numeroInicio; i--) {
				if(i%2 > 0) {
					System.out.print(i + ", ");
				}
			}
		}
		
}
}
