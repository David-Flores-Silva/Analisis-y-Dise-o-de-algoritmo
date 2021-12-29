//#https://open.kattis.com/problems/spellingbee
//#title

/*
#-----------

The New York Times publica un acertijo diario llamado "Spelling Bee". En este 
rompecabezas, se muestran 7 letras en una disposición hexagonal de 6 letras 
alrededor de una letra central. La tarea es encontrar tantas palabras como 
sea posible que

contienen solo letras que se muestran en el hexágono,
tienen al menos una longitud de 4, y
contienen la letra central.
Una letra puede usarse más de una vez y no es necesario usar todas las letras.

Después de jugar un rato, te quedas atascado, pero luego te recuerdas que la 
distribución de Linux en tu computadora viene con un archivo legible por máquina
de 102305 palabras del diccionario en / usr / share / dict / words.

Decide que incluso si no puede sobresalir en el concurso de ortografía, puede
sobresalir en programación, por lo que decide escribir un programa que encuentre
todas las soluciones a un acertijo del concurso de ortografía en su diccionario.

Sample Input 1	
drulyag
27
-dryad
-duly
spelling
multiplexed
janna
-lard
-dryly
the
instances
-gradual
-gradually
-dual
inimically
off
-dullard
-grad
equipage
-gladly
mauritania
-drug
a
-drag
pickering
-yard
-daddy
on
lallygag


Sample Output 1
dryad
duly
lard
dryly
gradual
gradually
dual
dullard
grad
gladly
drug
drag
yard
daddy
#-----------
*/