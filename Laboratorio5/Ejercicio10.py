#ejercicio10 - complejidad O(O(n))

def complejidad_10(n):
    #en este ejercicio vemos q la complejidad del codigo es O(O(n))
    #El ejercicio consta de dos for y cada uno tiene una complejidad de O(n)
    #Entonces la complejidad seria la inclucion de cada uno
    
    #El codigo imprime los numeros de 0 hasta n-1. Dos veces

    for i in range(n):       # Este es O(n)
        print(i)
   
    print("")
   
    for j in range(n):       # Este es O(n)
        print(j)

    #Complejidad O(O(n))

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_10(n)

