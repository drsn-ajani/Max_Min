public class Max_Min {

    public static<T extends Comparable<T>> T findMax(T a, T b, T c) {
        T maxi = a;
        if (b.compareTo(maxi) > 0) {
            maxi = b;
        }
        if (c.compareTo(maxi) > 0) {
            maxi = c;
        }
        return maxi;
    }

    public static void main(String[] args) {
        System.out.println(findMax(2.0, 3.0, 4.0));
        System.out.println(findMax(6.0, 13.0, 8.0));
        System.out.println(findMax(22.0, 1.0, 2.0));
    }
}
