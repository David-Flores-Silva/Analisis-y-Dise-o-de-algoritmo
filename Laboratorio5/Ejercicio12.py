#ejercicio12 - complejidad O(n*log2 n)

def complejidad_12(n):
    #en este ejercicio vemos q la complejidad del codigo es O(n*log2 n)
    
    j=1
    for i in range(n):          # O(n)
        while j < n:                # 1, 2, 4, 8, ... 
            print(j)                # 2^0, 2^1, 2^2, 2^3, ... , 2^k
            j *= 2                  # O(log2 n)
        print("------")         #------
        j = 1                   #O(n*log2 n)
            
    # Complejidad  O(n*log2 n)
    
#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_12(n)

