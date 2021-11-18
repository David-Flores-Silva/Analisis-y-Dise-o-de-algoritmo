#ejercicio8 - complejidad O(log2 n)

def complejidad_8(n):
    #en este ejercicio vemos q la complejidad del codigo es O(log2 n)
    #este ejercicio muestra que una complejidad efectiva y rapida
    
    # EL EJERCICIO muestra las posibles divisiones sucesivas de 2 
    # hasta q sea menor q 1
    
    i = n
    while i >= 1:         # out: 1, 2, 4, 8, 16, ...
        print(i)          # 2^0, 2^1, 2^2, 2^3, 2^4, ... 2^n
        i /= 2            # 2^k = n    k = log2 n
                         # O(log2 n)
        

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_8(n)

