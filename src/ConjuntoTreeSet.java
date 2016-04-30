
import java.util.Iterator;
import java.util.Set;
import java.util.*;
import java.util.TreeSet;


public class ConjuntoTreeSet {

    public static void main(String[] args) {
        
   

        String[] cad1 = {"Libro", "Mesa", "mesa", "Papel", "Papelera", "armario", "globo"};
        String[] cad2 = {"Libro", "Mesa", "mes", "Papel", "Papelera", "armario", "globo"};
              
        //String[] cad2 = {"lupi", "Maria", "angela", "Julian", "Esperanza", "Miguel", "maite", "marta"};

        TreeSet treeSet1, treeSet2;
        treeSet1 = new TreeSet();
        treeSet2 = new TreeSet(new Compara());

        for (int i = 0; i < cad1.length; i++) {
            treeSet1.add(cad1[i]);
        }
        
        for (int i = 0; i < cad2.length; i++) {
            treeSet2.add(cad2[i]);
        }

        System.out.println("Conjunto ordenado, sin comparador: "
                + treeSet1);
        System.out.println("Conjunto ordenado, con comparador: " + treeSet2);

        
        
        //Remover un object
       // treeSet2.remove("mes");
           
        System.out.println("Conjunto ordenado, con comparador: " + treeSet2);
//
//

        /**
          SortedSet subSet(Object desde, Object hasta) Devuelve el subconjunto
          formado por los elementos mayor o igual que, desde y menor que hasta.
         */
        Set set1 = treeSet1.subSet("Papelera",true, "mesa",true);
        System.out.println("Subset Resultado ->"+set1);
        
//        
        
        /* 
           SortedSet tailSet(Object desde)
           Devuelve el subconjunto formado por elementos mayores o igual que desde
         */
          Set set2 = treeSet2.tailSet("Mesa",false);
          System.out.println("tailSet Resultado ->"+set2);
//           /*
//           SortedSet headSet(Object hasta)
//            Devuelve el subconjunto formado por los elementos estrictamente menores que hasta.
//         */
          Set set3 = treeSet2.headSet("mes",true);
          System.out.println("headSet Resultado ->"+set3);
          
        ConjuntoTreeSet ite = new ConjuntoTreeSet();
        ite.iteraConj(set3);
//   

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
