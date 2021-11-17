#ejercicio6 - complejidad O(n(n+1)/2)

def complejidad_6(n):
    #en este ejercicio vemos q la complejidad del codigo es n(n+1)/2
    #es un caso especial ya que la segunda iteracion sera realizada
    #respecto del valor de i (primera iteracion) que ira aumentando
    #cada vez que este en el primer iterador
    
    i=1
    for p in range(n+1):
        print("-----\n")       
    

#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_6(n)


