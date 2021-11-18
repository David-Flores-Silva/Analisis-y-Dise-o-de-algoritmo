#Ejercicio 1 - laboratorio 4
def greatestNumber(array):
    #convertir el codigo de complejida O(n^2) a O(n)
    """for i in array:
        isIValTheGreatest = True
        for e in array:
            if e > i:
                isIValTheGreatest = False
        if isIValTheGreatest:
            return i"""
    #Lo que nosotros buscamos es obtener el numero mat¿yor del arreglo
    
    m = 0
    for i in range(len(array)):
        if array[i] > m:
            m = array[i]           
    return m

# Caso de prueba
array = [0, 1, 2, 3, 4]
print("Mayor: ", greatestNumber(array))
            