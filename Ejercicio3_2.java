package cursoUTN;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desplazamiento = 2;
		
		String frase = "hola que tal";
		
		System.out.println("Frase original: " + frase);
		
		System.out.println("Frase codificada con desplazamiento " + desplazamiento + ":" + " " + codifica(frase,desplazamiento));
		
		System.out.println("Frase decodificada con desplazamiento " + desplazamiento + ":" + " " + decodifica(codifica(frase,desplazamiento),desplazamiento));
		
	}

	private static String decodifica(String fraseCodif, int desplazamiento) {
		// TODO Auto-generated method stub
		String abece = " abcdefghijklmnñopqrstuvw";
		char caracter;
		String fraseDecodificada = "";
		int indice;
		
		for(int i=0; i<fraseCodif.length(); i++) {
			
			caracter = fraseCodif.charAt(i);
			
			indice = abece.indexOf(caracter);
			
			if(indice == 0) {
				indice = 25;
			}
			
			caracter = abece.charAt(indice-desplazamiento);
			
			fraseDecodificada += caracter;
			
		}
		
		return fraseDecodificada;
	}

	private static String codifica(String frase, int desplazamiento) {
		// TODO Auto-generated method stub
		String abece = " abcdefghijklmnñopqrstuvw";
		char caracter;
		String fraseCodificada = "";
		int indice;
		
		for(int i=0; i<frase.length(); i++) {
			
			caracter = frase.charAt(i);
			
			indice = abece.indexOf(caracter);
			
			if(indice == 24) {
				indice = -1;
			}
			
			caracter = abece.charAt(indice+desplazamiento);
			
			fraseCodificada += caracter;
			
		}
		
		return fraseCodificada;
	}

}
