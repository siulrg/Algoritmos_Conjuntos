
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class PruebaEstudianteTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
             
        TreeSet treeSet1, treeSet2;
        treeSet1 = new TreeSet();
        treeSet2 = new TreeSet(new CompararNombre());
        
        Estudiantes student1 = new Estudiantes();
        student1.Cedula = "11111111";
        student1.Nombre = "Juan Carlos";
        treeSet2.add(student1);
    
         
        Estudiantes student2 = new Estudiantes();
        student2.Cedula = "2111";
        student2.Nombre = "Lanfor ";
        treeSet2.add(student2);
        
        Estudiantes student3 = new Estudiantes();
       
        student3.Cedula = "3111";
        student3.Nombre = "ana ";
        treeSet2.add(student3);
        
        
        System.out.println(treeSet2);
        
      PruebaEstudianteTreeSet t = new PruebaEstudianteTreeSet();  
        t.iteraConj(treeSet2);
                 
    }
    
    public void iteraConj(Set cnj) {
        Iterator ic;
        Estudiantes q;
        ic = cnj.iterator();
        while (ic.hasNext()) {
          q =(Estudiantes) ic.next();
           System.out.print(q.Nombre+ " ");

        }

        System.out.println();
    }
    
    
}
