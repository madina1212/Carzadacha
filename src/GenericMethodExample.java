import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {
    public static <T> void printArrayWithFirstAndLast(T[] array) {
        if (array.length == 0) {
            return;
        }
        System.out.println("биринчи элемент: " + array[0]);
        System.out.println("акыркы элемент: " + array[array.length - 1]);
        System.out.println("бардык элементтер:");
        for (T element : array) {
            System.out.println(element);
        }
    }
}
