//#https://leetcode.com/problems/group-anagrams/
//#title


import java.util.*;
public class Ejercicio1 {
	public static void main(String [] args) {
		Scanner tecla = new Scanner(System.in);
		String cadena [] = {"eat","tea","tan","ate","nat","bat"};
		
		/*
		int n = tecla.nextInt();
		String cadena [] = new String[n];
		for(int i=0; i<n; i++) {
			cadena[i] = tecla.next();
		}*/
		

		solucion(cadena);
	}
	
	public static void solucion(String cad []) {
		String salida [] = new String [cad.length];
		int suma [] = new int [cad.length];
		String acumulador = "";
		
		if(cad.length >= 1000000) {
			System.out.println("(empty)");
		}
		
		int a=0, b;
		for(int i=0; i<cad.length; i++) {
			for(int j=0; j<cad[i].length(); j++) {
				a += cad[i].charAt(j);
			}
			suma[i] = a;
			a = 0;
		}
		
		int z = 0;
		for(int i=0; i<suma.length; i++) {
			for(int j=i+1; j<suma.length; j++) {
				if(suma[i] == suma[j]) {
					salida[z] = cad[j];
					z++;
				}
			}
		}
		
		for(int j=0; j<salida.length; j++) {
			System.out.println(salida[j]);
		}
	}
}


/*
#---------------------------------

Dada una matriz de cadenas de cadenas, agrupe los anagramas. Puede 
devolver la respuesta en cualquier orden.

Un anagrama es una palabra o frase formada reordenando las letras 
de una palabra o frase diferente, normalmente usando todas las letras 
originales exactamente una vez.

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

#-----------------------
*/
