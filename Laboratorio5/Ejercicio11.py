#ejercicio11 - complejidad O(log2 n * O(n))

def complejidad_11(n):
    #en este ejercicio vemos q la complejidad del codigo es O(log2 n * O(n))
    
    i = 1
    p = 0
    while i < n:                # out: 1, 2, 4, 8, 16, ...
        i *= 2                  # 2^0, 2^1, 2^2, 2^3, 2^4, ... , 2^k  
        p += 1                  # 2^k = n
        print(p)                # k = log2 n    --->    O(log2 n)

    print()
    
    for j in range(n):          # O(n)
        print(j)

    # Complejidad  O(log2 n * O(n))
    
#Caso de prueba
n = int(input("ingrese valor de n: "))
complejidad_11(n)

