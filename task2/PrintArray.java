package task2;
/**
 * Выводит элементы массива на консоль с помощью метода System.out.println().
 */
public class PrintArray {
    public <T> void printArray(T[] list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}