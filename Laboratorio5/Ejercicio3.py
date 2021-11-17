#ejercicio3 - complejidad n/2

def complejidad_3(n):
    #en este ejercicio vemos q la complejidad del codigo es n/2
    #vemos que el valor del iterador ira aumentando de 2 en 2 esto hace que el
    #algoritmo sera mas rapido y uno complejidad mas simple
    
    for i in range(0, n, 2):
        print(i)
    

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_3(n)

#O(n/2)
#seria una complejidad de n/2

