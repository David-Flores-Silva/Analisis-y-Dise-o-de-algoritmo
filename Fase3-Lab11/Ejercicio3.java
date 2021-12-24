//#https://open.kattis.com/problems/stringmatching
//#title

import java.util.*;
public class Ejercicio3 {
	public static void main(String [] args) {
		Scanner tecla = new Scanner(System.in);
		//String patron = "peek a boo";
		//String texto = "you speek a bootiful language";
		String patron = tecla.nextLine();
		String texto = tecla.nextLine();
		solucion(patron, texto);
	}
	
	public static void solucion(String patron, String texto) {
		String salida = "";
		int a = texto.length() - patron.length();
		for(int i=0; i<=a; i++) {
			if(patron.equals(texto.substring(i, i+patron.length()))) {
				salida += i + " ";
			}
		}
		
		System.out.println(salida);
	}
}

/*
#---------------------------------
La entrada consta de varios casos de prueba. Cada caso de prueba
consta de dos líneas, primero un patrón no vacío y luego un texto
no vacío. La entrada finaliza al final del archivo. El archivo
de entrada no superará los 5 Mb.



Sample Input 1	
p
Popup

helo
Hello there!

peek a boo
you speek a bootiful language

anas
bananananaspaj



Sample Output 1
2 4

5
7
#-----------------------
*/