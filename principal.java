package cursoUTN;

public class principal {
	
	public static void main(String[] args) {
		
		String texto = "Hola desde clase principal";
		System.out.println(texto);
		
		imprimir("Hola desde metodo 'imprimir' de clase principal");
		
		imprimir imprimir = new imprimir();
		
		System.out.println(imprimir.contarChiste());
		imprimir.contarCuento();
		
		impresar imprimeFuera = new impresar();
		
		
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
}

class impresar {
	
	public impresar() {
		
		System.out.println("imprimiendo desde clase externa a principal pero en el mismo archivo");
		
	}
}



