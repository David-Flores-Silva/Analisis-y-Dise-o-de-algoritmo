//#https://cses.fi/problemset/task/1671
//#title

public class Ejerci2 {
	public static void main(String [] args) {
		//entradas		
		int ciu = 3;
		int cam = 4;
		int [][] pesos = {{1,2,6}, {1,3,4}, {3,2,3}, {1,3,2}};
		
		entradas(ciu, cam, pesos);
	}
	
	public static void entradas(int ciu, int cam, int arr[][]) {

		int ciudades = ciu;
		int caminos = cam;
		int [][] pesos = arr;
		int minimo = 0;
		
		for(int i=0; i<cam; i++) {
			for(int j=0; j<cam; j++) {
				if(pesos[i][0] == pesos[j][0] && pesos[i][1] == pesos[j][1]) {
					if(pesos[i][2]>=pesos[j][2]) {
						minimo = pesos[j][2];
					}else {
						minimo = pesos[i][2];
					}
				}
				else {
					minimo = pesos[i][2];
				}				
			}
			System.out.println(minimo);
		}
	}
}
/*
''' Input:
3 4
1 2 6
1 3 2
3 2 3
1 3 4

Output:
0 5 2 '''

#-----------------------

#Hay n ciudades y m conexiones aéreas entre ellas. Su tarea es determinar 
# la longitud de la ruta más corta desde Syrjälä a cada ciudad.*/
