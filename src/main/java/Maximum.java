import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Maximum<E extends Comparable<E>> {
   E[] arrayElements;


    public Maximum(E[] arrayElements) {
        this.arrayElements = arrayElements;
    }

    public static <E extends Comparable> E getMaximum(E... arrayElements) {
        Arrays.sort(arrayElements);
        return arrayElements[arrayElements.length-1];
    }

}


