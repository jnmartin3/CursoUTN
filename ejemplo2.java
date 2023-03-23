package cursoUTN;

import java.util.Scanner;

public class ejemplo2 {
	public static void main(String[] args) {
		
		double ingresosMensuales;
		int cantidadVehiculos;
		int inmuebles;
		boolean lujos;
		
		//Consultas al usuario
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresos mensuales en pesos: ");
		ingresosMensuales = entrada.nextDouble();
		
		System.out.println("Cantidad de vehiculos con antiguedad menor a 5 años: ");
		cantidadVehiculos = entrada.nextInt();
		
		System.out.println("Cantidad de inmuebles a su nombre: ");
		inmuebles = entrada.nextInt();
		
		System.out.println("Posee una embarcación, una aeronave de lujo o es titular de activos\r\n"
				+ "societarios que demuestren capacidad económica plena? (true / false)");
		lujos = entrada.nextBoolean();
		
		//Decision
		if(ingresosMensuales >= 489083 && cantidadVehiculos >=3 && inmuebles >=3 && lujos ) {
			System.out.println("Segmento de altos ingresos");
		}else {
			System.out.println("Alguno de los criterios estan por debajo de "
					+ "lo establecido para ser de altos ingresos");
		}
		
	}
}
