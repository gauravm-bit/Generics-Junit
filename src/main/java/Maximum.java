import java.util.Arrays;
import java.util.Collections;

public class Maximum<E extends Comparable<E>> {
   E[] arrayElements;


    public Maximum(E[] arrayElements) {
        this.arrayElements = arrayElements;
    }

    public static <E extends Comparable> E getMaximum(E... arrayElements) {
        Arrays.sort(arrayElements, Collections.reverseOrder());
        E result = arrayElements[0];
        printMax(result);
        return result;
    }

    private static <E> void printMax(E result) {
        System.out.println(result);
    }

}


