#ejercicio6 - complejidad O(n^½)

def complejidad_6(n):
    #en este ejercicio vemos q la complejidad del codigo es n^½
    #es un caso especial ya que la segunda iteracion sera realizada
    #respecto del valor de i (primera iteracion) que ira aumentando
    #cada vez que este en el primer iterador
    
    p = 0
    i = 1
    while p < n:        #p(p+1)/2
        p += i           # P^2 = n 
        i += 1           # P = n^½
        print(p)

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_6(n)

