public class Max_String {

    public static<T extends Comparable<T>> T max_string(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0)   max = b;
        if (c.compareTo(max) > 0)   max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max_string("Apple", "Banana", "Peach"));
        System.out.println(max_string("App", "anan", "Peak"));
        System.out.println(max_string("pie", "nana", "Pour"));
    }
}

