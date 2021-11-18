#ejercicio7 - complejidad O(log2 n)

def complejidad_7(n):
    #en este ejercicio vemos q la complejidad del codigo es O(log2 n)
    #en este ejercicio el valor del iterador ira aumentando en potencias de dos
    #por lo tanto tenemos 2 elevado a la k y solo despejariamos
    
    # EL EJERCICIO MUESTRA LAS POTENCIAS DE 2    
    
    i = 1
    while i < n:         # out: 1, 2, 4, 8, 16, ...
        print(i)         # 2^0, 2^1, 2^2, 2^3, 2^4, ... 2^n
        i *= 2           # 2^k = n    k = log2 n
                         # O(log2 n)
        

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_7(n)

