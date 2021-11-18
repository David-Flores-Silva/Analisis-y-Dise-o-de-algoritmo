# Ejercicio3 - Pide hallar la complejidad del codigo

def twoSum(array):
    # El algoritmo recorre y siesq encuentra en el array
    # dos numeros que sumados den 10 retorna True caso contrario retorna False
    
    for i in range(len(array)):                         # O(n)
        for j in range(len(array)):                     # O(n)
            if i != j and array[i] + array[j] == 10:
                return True
    return False

# RESPUESTA - COMPLEJIDAD
# O(n^2)

# Caso de prueba
# array = [5, 6, 1, 7 , 2, 7] # False
array = [5, 6, 1, 7 , 2, 4]  # True
print(twoSum(array))
