#Unique_Path_II.py

def rutas(arreglo):
    #decripcion
    robot = "ROBOT"
    arreglo[0][0] = robot
    caminos = 0
    i, j = 0, 0
    
    
    if int(arreglo[i][j+1]) == 1:
        if int(arreglo[i+1][j]) == 1:
            return 0
    
    while j<2 and i<2:#arreglo[len(arreglo)-1][len(arreglo[0])-1] != robot:
        if int(arreglo[i][j+1]) == 1:
            if int(arreglo[i+1][j]) == 0:
                arreglo[i][j] = 1#----
                #if i < len(arreglo)-2:
                i += 1
                arreglo[i][j] = robot
                if arreglo[len(arreglo)-1][len(arreglo[0])-1] == robot:
                    caminos += 1
                print(i, j)
                
            else:
                arreglo[i][j] = 1#------
                i, j = 0, 0
                arreglo[i][j] = robot
                if arreglo[len(arreglo)-1][len(arreglo[0])-1] == robot:
                    caminos += 1
                print(i, j)
                
        elif int(arreglo[i][j+1]) == 0:
            arreglo[i][j] = 1#---------
            #if j < len(arreglo[0])-2:
            j += 1
            arreglo[i][j] = robot
            if arreglo[len(arreglo)-1][len(arreglo[0])-1] == robot:
                caminos += 1
            print(i, j)
            
    return caminos      
        
arre = [[0,0,0],[0,1,0],[0,0,0]]
camins = rutas(arre)
print(camins, "\n")
print(arre)

#Pruebas-LeetCode
#https://leetcode.com/problems/unique-paths-ii/








#Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
#Output: 2

#Un robot está ubicado en la esquina superior izquierda de una cuadrícula de m x n.
#El robot solo puede moverse hacia abajo o hacia la derecha en cualquier momento.
#El robot está tratando de llegar a la esquina inferior derecha de la cuadrícula.




#196 6.6 