//#https://cses.fi/problemset/task/1675
//# Reparacion de caminos

import java.util.*;

public class Ejerci1 {
    class Node{
        //clase node con el objetivo que se cree un nodo con su nombre su destino y su costo
		int init;
		int lleg;
		int cost;
		
		public Node(int init, int lleg, int cost) {
			this.init = init;
			this.lleg = lleg;
			this.cost = cost;
		}
	}

	public static void main(String [] args) {
		//entradas
		Scanner tecla=new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de ciudades");
		//int ciudades = tecla.nextInt();
        int ciudades = 5;

		System.out.println("ingrese la cantidad de caminos");
		//int caminos = tecla.nextInt();
        int caminos = tecla.nextInt();

		//int [][] pesos = new int [caminos][3];
		int [][] pesos = {{1,2,3}, {2,3,5}, {2,4,2}, {3,4,8}, {5,1,7}, {5,4,4}};

        //este codigo en caso de q se realice entradas por teclado
		/*System.out.println("ingrese las ciudades a conectar y sus pesos, (a, b, peso)");
		for(int i=0; i<caminos; i++) {
			for(int j=0; j<3; j++) {
				pesos[i][j] = tecla.nextInt();
			}
		}*/
		
		minimo(caminos, pesos);
	}
	
	//recorrido minimo
	public static void minimo(int caminos, int pesos[][]) {
		int minimo = 0;
		int inic=0, fin=0;
		
		for(int i=0; i<caminos; i++) {
				pesos[i][0] = inic;
				pesos[i][1] = fin;
				
				if(pesos[i][2] <= 5) {
					minimo += pesos[i][2];
				}
		}
		
		System.out.println(minimo);
	}
}

/*
#Input:
#5 6
#1 2 3
#2 3 5
#2 4 2
#3 4 8
#5 1 7
#5 4 4

#Output:
#14

#-----------------------

#Hay n ciudades y m carreteras entre ellas. Desafortunadamente, el estado de las 
# carreteras es tan malo que no se pueden utilizar. Su tarea es reparar algunas 
# de las carreteras para que haya una ruta decente entre dos ciudades.
# Para cada camino, usted conoce su costo de reparación y debe encontrar una 
# solución donde el costo total sea lo más pequeño posible.
*/