import java.util.Arrays;
import java.util.Optional;

public class testMaximum<T extends Comparable<T>> {
    T[] array;

    public testMaximum(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};

        new testMaximum<Integer>(a).findMax();
    }

    private void findMax() {
        findMax(array).ifPresentOrElse(
                max -> System.out.println("Maximum Number: " + max),
                () -> System.out.println("Array is Empty or NULL")
        );;
    }

    private static<T extends Comparable<T>> Optional<T> findMax(T[] array) {
        if (array == null || array.length == 0) {
            return Optional.empty();
        }
        return Arrays.stream(array)
                .filter(value -> value != null)
                .max(Comparable::compareTo);
    }
}
