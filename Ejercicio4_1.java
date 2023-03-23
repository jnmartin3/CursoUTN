package cursoUTN;

import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {
	
		int a = 610;
		int b = 700;
		int c = 55000;
		
		System.out.println("###  MENU  ###");
		System.out.println();
		System.out.println("Coloque M para ingreso manual de 3 numeros, o ingrese A para carga automatica: ");
		Scanner escaner = new Scanner(System.in);
		String entrada = escaner.nextLine();
		
		if(entrada.equalsIgnoreCase("A")) cargaAutomatica(a, b, c);
		if(entrada.equalsIgnoreCase("M")) cargaManual();
		
		
		}
		
		
		
	private static void cargaManual() {
		// TODO Auto-generated method stub
		System.out.println("Metodo en desarrollo :(");
	}


	private static void cargaAutomatica(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese D para orden descendente y A para orden ascendente: ");
		
		Scanner escaner = new Scanner(System.in);
		String entrada = escaner.nextLine();
		
		if(entrada.equalsIgnoreCase("d")) {
			
			if(a>b) {
				if(b>c) 		System.out.println(a+", "+b+", "+c);
				if(c>b && a>c)	System.out.println(a+", "+c+", "+b);
				if(c>b && c>a)	System.out.println(c+", "+a+", "+b);

			}
			if(b>a) {
				if(c>b) 		System.out.println(c+", "+b+", "+a);
				if(a>c && b>c) 	System.out.println(b+", "+a+", "+c);
				if(c>a && b>c) 	System.out.println(b+", "+c+", "+a);
			}
		}
		
		
		if(entrada.equalsIgnoreCase("a")) {
			if(a<b) {
				if(b<c) 		System.out.println(a+", "+b+", "+c);
				if(c<b && a<c)	System.out.println(a+", "+c+", "+b);
				if(c<b && c<a)	System.out.println(c+", "+a+", "+b);

			}
			if(b<a) {
				if(c<b) 		System.out.println(c+", "+b+", "+a);
				if(a<c && b<c) 	System.out.println(b+", "+a+", "+c);
				if(c<a && b<c) 	System.out.println(b+", "+c+", "+a);
			}
		
		}
		
	}
	
}
	
