class Matriz_2d{
    public static void main(String [] args){    
        int [][] m = new int[3][3];
        int a=1;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                m[i][j] = a;
                a +=2;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(busqueda(m, 7));
        System.out.println(busqueda(m, 12));
    }


    public static boolean busqueda(int [][] matriz, int buscar){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(matriz[i][j] == buscar){
                    return true;
                }
            }
        }  
        return false;
    }
}