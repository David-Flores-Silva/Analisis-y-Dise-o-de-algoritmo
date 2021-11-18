#ejercicio6 - complejidad O(n^½)

def complejidad_6(n):
    #en este ejercicio vemos q la complejidad del codigo es n^½
    #el valor de p aumenta con el valor de i 
    # EL EJERCICIO MUESTRA LOS NUMEROS TRIANGULARES O
    # LA SUMA DE LOS PRIMERSO NUMEROS EN CADA ITERACION
    # 1, 1+2, 1+2+3, 1+2+3+4, ...
    
    p = 0
    i = 1
    while p < n:        #p(p+1)/2
        p += i           # P^2 = n 
        i += 1           # P = n^½
        print(p)

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_6(n)

