#ejercicio4 - complejidad O(n^2)

def complejidad_3(n):
    #en este ejercicio vemos q la complejidad del codigo es n^2
    #vemos que se realizan dos iteraciones for y cada una con O(n)
    #O(n) * O(n) seria una complejidad de O(n^2)
    
    for i in range(n):          #------     #O(n)   #O(n)*O(n)      #O(n^2)
        for j in range(n):      #------     #O(n)
            print(j+1,"  |")          
        print("-----\n")       
    

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_3(n)


