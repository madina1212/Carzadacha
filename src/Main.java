import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {4, 2, 3, 4, 2};
        GenericMethodExample.printArrayWithFirstAndLast(intArray);

        String[] strArray = {"Madina", "Kanykei", "Datka"};
        GenericMethodExample.printArrayWithFirstAndLast(strArray);
    }

}