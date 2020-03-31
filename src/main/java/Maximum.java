public class Maximum {
    public static void main(String[] args){
        System.out.println("Welcome");
    }

    public static Integer getMaximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer maximum = number1;

        if (number2.compareTo(maximum)>0)
            maximum = number2;
        if (number3.compareTo(maximum)>0)
            maximum = number3;
        return maximum;
    }

    public static Float getMaximumFloat(Float number1, Float number2, Float number3) {
        Float maximum = number1;

        if (number2.compareTo(maximum)>0)
            maximum = number2;
        if (number3.compareTo(maximum)>0)
            maximum = number3;
        return maximum;
    }

    public static String getMaximumString(String first, String second, String third) {
        String maximum = first;

        if (second.compareTo(maximum)>0)
            maximum = second;
        if (third.compareTo(maximum)>0)
            maximum = third;
        return maximum;
    }
}


