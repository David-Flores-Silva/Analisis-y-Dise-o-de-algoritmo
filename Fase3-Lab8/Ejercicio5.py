#Maximal_Square.py

def number(ar):
    #decripcion
    for i in range(len(ar)):
        for j in range(len(ar[i])):
            if(ar[i][j] == 1):
                i += 1
                
    return i        
    
    


#Pruebas-LeetCode
#Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
#Output: 4










#Dada una matriz binaria m x n llena de ceros y unos,
#encuentre el cuadrado más grande que contenga solo unos y devuelva
#su área.
