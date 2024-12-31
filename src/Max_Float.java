public class Max_Float {

    public static<T extends Comparable<T>> T max_float(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0)   max = b;
        if (c.compareTo(max) > 0)   max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max_float(1.2, 5.6, 8.8));
        System.out.println(max_float(1.1, 9.2, 5.5));
        System.out.println(max_float(10.6, 6.2, 1.56));
    }
}
