//#https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
//#title

public class Solution {	
	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int curren = -1;
		int ropes = 0;
		
		for(int i=0; i<A.length; i++) {
			if(A[i] > curren) {
                curren = B[i];
				ropes++;
			}
		}
				
		return ropes;
    }
}

/*
# Hay N cuerdas numeradas de 0 a N - 1, cuyas longitudes se dan en una matriz A,
# colocadas en el suelo en una línea. Para cada I (0 ≤ I <N), la longitud de la 
# cuerda I en la línea es A [I].
# 
# Decimos que dos cuerdas I e I + 1 son adyacentes. Se pueden atar dos cuerdas
# adyacentes con un nudo, y la longitud de la cuerda atada es la suma de las
# longitudes de ambas cuerdas. La nueva cuerda resultante se puede volver a atar.
# 
# Para un entero K dado, el objetivo es atar las cuerdas de tal manera que el número
# de cuerdas cuya longitud sea mayor o igual que K sea máximo.
*/
