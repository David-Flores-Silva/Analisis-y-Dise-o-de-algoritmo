#Ejercicio1 - Lab6 - Binary search

def Binary_Search(binary, search):
    L = 0
    R = len(binary) - 1
    
    while L <= R:
        bin = int(L + (R-L)/2)
        
        if binary[bin] == search:
            return True
        if binary[bin] < search:
            L = bin + 1
        else:
            R = bin - 1
            
    return False

# Caso de prueba
binario = [1, 2, 3, 4, 5, 6 , 7, 8]
#print(Binary_Search(binario, 9)) #False
print(Binary_Search(binario, 9)) #True
            
        
    