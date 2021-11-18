#ejercicio9 - complejidad O(n^½)

def complejidad_9(n):
    #en este ejercicio vemos q la complejidad del codigo es O(n^½)
    #este ejercicio muestra que una complejidad efectiva y rapida
    
    # EL EJERCICIO muestra las posibles divisiones sucesivas de 2 
    # hasta q sea menor q 1
    
    p=0
    i = 1
    while p < n:         # out: 0, 1, 4, 9, 16, ...
        print(p)         # 0^2, 1^2, 2^2, 3^2, 4^2, ... n^2
        p = i * i
        i += 1           # k^2 = n    k = n^½
                         # O(n^½)
        

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_9(n)

