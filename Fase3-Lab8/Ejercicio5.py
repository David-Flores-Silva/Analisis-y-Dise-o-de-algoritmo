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

def book(n, x, pre, pag):
    #decripcion
    ekis = []
    valorx = 0
    paginas = []
    valorp = 0
    z = 0
    
    while z <= len(pre)-1:
        i = 1
        while i <= len(pre):
            j = len(pre)-i
            while j >= 0:
                valorx += pre[j]
                valorp += pag[j]
                j -= 1
            ekis.append(valorx)
            paginas.append(valorp)
            i += 1 
            valorx = 0
            valorp = 0 

        i=2
        valorx = pre[0]
        valorp = pag[0]
        while i < len(pre):
            valorx += pre[i]
            valorp += pag[i]
            ekis.append(valorx)
            paginas.append(valorp)
            valorx = pre[0]
            valorp = pag[0]
            i+=1
    
        #cambiar el primer valor con el evaluado
        k = pre[0]
        pre[0] = pre[z]
        pre[z] = k
        
        k = pag[0]
        pag[0] = pag[z]
        pag[z] = k
    
        z += 1
        
    print(ekis)
    print(paginas)
    
    #tocaria seleccionar al mayor

#pruebas-cses.fi
n = 4
x = 10
pre = [4, 8, 5, 3]
pag = [5, 12, 8, 1]

book(n, x, pre, pag)






#Dada una matriz binaria m x n llena de ceros y unos,
#encuentre el cuadrado más grande que contenga solo unos y devuelva
#su área.
