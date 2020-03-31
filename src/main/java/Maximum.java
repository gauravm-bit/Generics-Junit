public class Maximum<E extends Comparable<E>> {
    E element1;
    E element2;
    E element3;


    public Maximum(E element1, E element2, E element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public  E getMaximum(){

        E maximum = element1;
        if (element2.compareTo(maximum)>0)
            maximum = element2;
        if (element3.compareTo(maximum)>0)
            maximum = element3;
        return maximum;
    }

}


