
import java.util.Comparator;

  public class Compara implements Comparator {

    public int compare(Object x1, Object x2) {
            String c1 = (String) x1;
            String c2 = (String) x2;
            c1 = c1.toUpperCase();
            c2 = c2.toUpperCase();
            //1 representa que c1 es mayo que el argumento que paso, 0 representa equals y -1 el c1 es menor que el argument
            return c1.compareTo(c2);
        }
       
    }
