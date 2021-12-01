#Book_Shop.py

def book(n, x, pre, pag):
    #decripcion
    ekis = []
    valorx = 0
    paginas = []
    valorp = 0
    z = 0
    
    while z <= len(pre)-1:
        i = 1
        while i <= len(pre):
            j = len(pre)-i
            while j >= 0:
                valorx += pre[j]
                valorp += pag[j]
                j -= 1
            ekis.append(valorx)
            paginas.append(valorp)
            i += 1 
            valorx = 0
            valorp = 0 

        i=2
        valorx = pre[0]
        valorp = pag[0]
        while i < len(pre):
            valorx += pre[i]
            valorp += pag[i]
            ekis.append(valorx)
            paginas.append(valorp)
            valorx = pre[0]
            valorp = pag[0]
            i+=1
    
        #cambiar el primer valor con el evaluado
        k = pre[0]
        pre[0] = pre[z]
        pre[z] = k
        
        k = pag[0]
        pag[0] = pag[z]
        pag[z] = k
    
        z += 1
        
    print(ekis)
    print(paginas)
    
    #tocaria seleccionar al mayor

#pruebas-cses.fi
n = 4
x = 10
pre = [4, 8, 5, 3]
pag = [5, 12, 8, 1]

book(n, x, pre, pag)







#Input:
#4 10
#4 8 5 3
#5 12 8 1

#Output:
#13

#---------------------------

#n:numero de libros & x:precio maximo
#precio de cada libro: h1, h2, ..., hn
#numero de paginas de cd libro s1, s2, ..., sn

#-----------------------

#Estás en una librería que vende n libros diferentes. Sabes el precio y el número de páginas de
#cada libro.
#Ha decidido que el precio total de sus compras será como máximo x. Cual es el maximo
#número de páginas que puedes comprar? Puedes comprar cada libro como máximo una vez.