#ejercicio5 - complejidad O(n(n+1)/2)

def complejidad_3(n):
    #en este ejercicio vemos q la complejidad del codigo es n(n+1)/2
    #es un caso especial ya que la segunda iteracion sera realizada
    #respecto del valor de i (primera iteracion) que ira aumentando
    #cada vez que este en el primer iterador
    
    for i in range(n):          #------     1       2        3      ...      n
        for j in range(i):      #------     (1) + (1+2) + (1+2+3) + ... + n(n+1)/2
            print(j+1,"  |")          
        print("-----\n")       
    

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_3(n)


