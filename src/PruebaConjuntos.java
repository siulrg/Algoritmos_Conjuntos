/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
import java.util.*;

public class PruebaConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet hashSet1, hashSet2;
      
        ///CREAMOS EL UN CONJUNTO
        hashSet1 = new HashSet();
        hashSet1.add("Sol");
        hashSet1.add("luna");
        hashSet1.add("saturno");
        hashSet1.add("casa");
        System.out.println("Conjunto UNO: " + hashSet1);

        hashSet2 = new HashSet();
        hashSet2.add("Sol");
        hashSet2.add("Venus");
        hashSet2.add("saturno");
        hashSet2.add("jupiter");
        System.out.println("Conjunto DOS: " + hashSet2);
        System.out.println();

        // union de conjuntos
        HashSet union;
        union = (HashSet) hashSet1.clone();
        union.addAll(hashSet2);
        System.out.println("union hashSet1 conjuntos: " + union);
        System.out.println();
//        
        //  diferencia de conjuntos 
        //En teoría de conjuntos, la diferencia entre dos conjuntos es una operación que resulta en otro conjunto, 
        //cuyos elementos son todos aquellos en el primero de los conjuntos iniciales que no estén en el segundo. 
        HashSet dif;
        dif = (HashSet) hashSet2.clone();
        dif.removeAll(hashSet1);
        System.out.println("diferencia hashSet1 - hashSet2: " + dif);
        System.out.println();
        
/// intersección de conjuntos 
        HashSet inter;
        inter = (HashSet) hashSet1.clone();
        inter.retainAll(hashSet2);
        System.out.println("intersección hashSet1 * hashSet2: " + inter);
        System.out.println();
        
//        
        PruebaConjuntos a;
        a = new PruebaConjuntos();
        
//        
       System.out.print("Iterar sobre union -> ");
        a.iteraConj(union);
//        System.out.print("Iterar sobre Diff -> ");
//        a.iteraConj(dif);
//       System.out.print("Iterar sobre Inter-> ");
//        a.iteraConj(inter);
            
//
//        }

    }

    public void iteraConj(Set cnj) {
        Iterator ic;
        String q;
        ic = cnj.iterator();
        while (ic.hasNext()) {
          q = (String) ic.next();
           System.out.print(q + " ");

        }

        System.out.println();
    }

}
