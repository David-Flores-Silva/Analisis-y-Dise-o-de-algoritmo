# Enunciado: Pide hallar la complejidad del codigo
import random


def every_other(array):
    # El algoritmo se hace que cuando el index es igual al numero 
    # se debe de agregar un nuevo numero    
    
    for i in range(len(array)):
        if i == array[i]:
            array.append(random.randrange(0, 5))
    
    return array
    
    #Complejidad O(n)
    
    """array.each_with_index do |number, index|
        if index.even?
            array.each do |other_number|
                puts number + other_number"""
                
array = every_other([0, 5, 6, 7, 2, 0, 4])
print(array)
          

                