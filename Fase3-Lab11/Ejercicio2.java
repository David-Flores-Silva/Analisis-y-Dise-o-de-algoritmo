//#https://open.kattis.com/problems/dyslectionary
//#title

public class Ejercicio2 {
	public static void main(String [] args) {
		//En nuestro metodo main vamos a crear un arreglo de las palabras q vamos
        //a ordenar y llamanos al metodo solucion enviando nuestro arreglo

		//String [] A = {"apple", "banana", "grape", "kiwi", "pear", "zzz"};
		//String [] A = {"airplane", "bicycle", "boat", "car", "zzz"};
		String [] A = {"vaca", "gata", "perro", "leon", "oso", "potro", "zzz"};
		solucion(A);
		
		//System.out.println(A[0].charAt(A[0].length()-1));
	}
	
	
	public static void solucion(String [] A) {
		//creamos variables q necesitaremos
        // disleccioanrio es para guardar el nuevo diccionario
        // ab y ac es para guardar una letra en caracter de manera que podamos
        // comparar que palabra es manor o menor (segun el codigo ascii).

		
		String [] disleccionario = new String [A.length];
		char ab = 32;
		char ac = 32;
		int z = 0;
		
		for(int i=0; i<A.length-1; i++) {
			int a = 1;
			int b = 0;
			int asterisco = 99;
			int j = i+1;
			
            //es este bucle vamos a irt ordenando las palabras 
			while(asterisco != 100) {
				ab = A[i].charAt(A[i].length()-a);
				ac = A[j].charAt(A[j].length()-a);
				
				if(ab == ac) {
					a++;
					j--;
				}else if(ab < ac) {
					disleccionario[z] = A[i]; 
					asterisco++;
				}else if(ab > ac){
					disleccionario[z] = A[j];
					A[j] = A[i];
					asterisco++;
				}else {
					disleccionario[z] = A[i]; 
					asterisco++;
				}
				
				j++;
			}
			z++;
		}		
		
        //este for se encarga de mostrarnos los resultados por consola
		for(int i=0; i<A.length-1; i++) {
			System.out.println(disleccionario[i]);
		}
	}
}

/*
#---------------------------------
¿Alguna vez ha tenido dudas sobre cómo deletrear una palabra? 
Si le preguntas a alguien, a veces te dirá que lo busques, y 
está bien si sabes cómo comienza la palabra. Sin embargo ...

Sample Input 1	
apple
banana
grape
kiwi
pear

airplane
bicycle
boat
car

Sample Output 1
banana
 apple
 grape
  kiwi
  pear

 bicycle
airplane
     car
    boat
#-----------------------
*/