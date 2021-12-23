//#https://cses.fi/problemset/task/1732
//#title

import java.util.*;
public class Ejercicio4 {
	public static void main(String [] args) {
		Scanner tecla = new Scanner(System.in);
		//String cadena = "abcababcab";
		String cadena = tecla.next();
		System.out.println(solucion(cadena));
	}
	
	public static String solucion(String cad) {
		String salida = "";
		
		if(cad.length() >= 1000000) {
			return "(empty)";
		}
		
		for(int i=0; i<cad.length()-1; i++) {
			String a = cad.substring(0, i+1);
			String b = cad.substring(cad.length()-(i+1), cad.length());
			
			if(a.equals(b)) {
				salida += a.length() + " "; 
			}
		}

		return salida;
	}
}

/*
#---------------------------------

Un borde de una cadena es un prefijo que también es un sufijo de la cadena, 
pero no la cadena completa. Por ejemplo, los bordes de abcababcab son ab y abcab.
Su tarea es encontrar todas las longitudes de los bordes de una cadena determinada.

Input:
abcababcab

Output:
2 5

#-----------------------
*/