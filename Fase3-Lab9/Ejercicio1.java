/*#https://app.codility.com/programmers/lessons/16-greedy_algorithms/tie_ropes/
#title

def funcionde():
    #decripcion
    pass
*/

class Solution {
    public static void main(String [] args) {
		//cantidad de cuerdas N
		int N=5;
		int [] A = {1, 3, 7, 9, 9};
		int [] B = {5, 6, 8, 9, 10};
		System.out.println(new Solution().solution(A, B));
	}
	
	
	public int solution(int [] A, int [] B) {
		int curren = -1;
		int count = 0;
		
		for(int i=0; i<A.length; i++) {
			if(A[i] > curren) {
					curren = B[i];
					count++;
			}
		}		
		return count;
	}
}

/*
#-----------------------

#Ubicados en una línea hay N segmentos, numerados de 0 a N - 1, cuyas posiciones 
# se dan en las matrices A y B. Para cada I (0 ≤ I <N) la posición del segmento 
# I es de A [I] a B [I] (inclusive). Los segmentos están ordenados por sus extremos, 
# lo que significa que B [K] ≤ B [K + 1] para K tal que 0 ≤ K <N - 1.
# 
# Dos segmentos I y J, tales que I ≠ J, se superponen si comparten al menos un punto
# común. En otras palabras, A [I] ≤ A [J] ≤ B [I] o A [J] ≤ A [I] ≤ B [J].
# 
# Decimos que el conjunto de segmentos no se superpone si no contiene dos segmentos
# superpuestos. El objetivo es encontrar el tamaño de un conjunto no superpuesto que
# contenga el número máximo de segmentos.
*/