# Ejercicio5 - Hallar la seleccion del curriculum

def pick_resume(resumes):
    # El codigo debe de ir recortando el arreglo y al final le quedara 
    # un solocurriculum para seleccionar
    i=2
    eliminate = "top"
    while i > 0:
        if eliminate == "top":
            resumes.append("curriculum_1")
            eliminate == "bottom"
        
        elif eliminate == "bottom":
            resumes.append("curriculum_2")
            eliminate = "top"  
            
        i -= 1 
    print(resumes[len(resumes)-1])


resumes = [5, 2, 8, 9, 1, 7, 3, 4]
pick_resume(resumes)
