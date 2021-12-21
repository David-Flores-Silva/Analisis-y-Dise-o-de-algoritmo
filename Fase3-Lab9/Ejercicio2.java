//#https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
//#title

public class Solution {
	
	public int solution(int k, int [] a) {
		int curren = 0;
		int ropes = 0;
		
		for(int i=0; i<a.length; i++) {
			curren += a[i];
			if(curren >= k) {
				ropes++;
				curren = 0;
			}
		}
				
		return ropes;
	}
	
	public static void main(String [] args) {
		//entradas		
		
		int k=4;
		int [] a = {1, 2, 3, 4, 1, 1, 3};
		System.out.println(new Solution().solution(k, a));
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
