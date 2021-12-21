//#https://open.kattis.com/problems/pikemaneasy
//# #title

public class Ejercicio4 {
	public static void main(String [] args) {
		//cantidad de cuerdas N
		int [] A = {2, 10};
		int [] B = {2, 2, 2, 2};
		System.out.println(solucion(A, B));
	}
	
	
	public static String solucion(int [] A, int [] B) {
		//funcion que se encarga de hallar las penalizaciones
		
		int penalizacion = 0;
		int t = B[3];
		
		if(B[3] <= B[2]) {
			for(int i=0; i<A[0]-1; i++) {
				t += ((B[0]*t + B[1]) % B[2]) + 1;
			}
			return A[0] + " " + t;
		}
		
		return A[0] + " " + -1;
	}
}

/*
#-----------------------

#La programación es un arte antiguo. Los arqueólogos han hecho hallazgos que 
# indican que ya en la Edad Media, la infantería practicaba para concursos de 
# programación cuando no estaba en batalla. Aunque no se sabe cómo se llevaban
# a cabo los concursos de programación (no había computadoras), los arqueólogos
# han planteado una buena teoría (según ellos). Afirma que la infantería presentó
# un pseudocódigo tallado en piedra, y luego, al final del concurso, un sacerdote
# genio llamado Kátisse ejecutó todos los programas en su cabeza para corregirlos
# . ¿Cómo saben su nombre? No lo dirán.

#Una de las razones de esta teoría un tanto peculiar fue el hallazgo de una pica
# antigua, una lanza de combate. Los científicos han encontrado muchos de estos
# a lo largo de los años. Vienen con un símbolo especial tallado en ellos,
# generalmente el símbolo de la tribu. Éste no tenía un símbolo grabado, 
# tenía un pseudocódigo para árboles de Fenwick, así como un archivo de 
# configuración para algún tipo de editor. Los científicos no están seguros
# de qué editor pudo haber sido, pero creen que fue alguna versión de la beta
# cerrada de Emacs.

#En lugar de buscar más evidencia, los arqueólogos comenzaron a especular qué
# estrategia usaron los piqueros en estos concursos de programación. Deben haber
# estado bien preparados, ya que este tipo tenía algoritmos grabados en su lanza.
# Las reglas del concurso fueron probablemente las siguientes: Al presentar una
# solución al juez, el tiempo en minutos desde el inicio del concurso se agregó
# a un contador de penalizaciones. Por tanto, para planificar la resolución de
# problemas, un piquero debe haber sabido calcular la cantidad de minutos
# necesarios para resolver cada problema.

#Se le presentan una serie de problemas que fueron diseñados para un concurso en
# el que participó el piquero. Para cada problema, se le da el tiempo estimado en
# minutos para resolver el problema. Calcule el número máximo de problemas que un
# piquero puede resolver en el concurso y la penalización mínima que puede obtener,
# bajo el supuesto de que estas estimaciones son correctas. Puede suponer que los
# piqueros son muy eficientes: las presentaciones siempre son correctas y, después
# de enviar un problema, comienzan a resolver el siguiente problema de inmediato.
*/