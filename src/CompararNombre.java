
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class CompararNombre  implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        
            Estudiantes c1 = (Estudiantes) o1;
            Estudiantes c2 = (Estudiantes) o2;
           return c1.Nombre.toUpperCase().compareTo(c2.Nombre.toUpperCase());
          
            //1 representa que c1 es mayo que el argumento que paso, 0 representa equals y -1 el c1 es menor que el argument
            
    }
    
}
