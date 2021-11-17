#ejercicio2 - complejidad lineal

def complejidad_2(n):
    #en este ejercicio vemos q la complejidad del codigo es lineal en n 
    #en este caso recorremos desde n hasta 0. Manteniendo el O(n)
    i=n
    while i>0:
        print(i)
        i -= 1
    

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_2(n)

#O(n)
#seria una complejidad lineal de n, en este caso de 5

