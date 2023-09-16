package task2;
/**
 * Мы объявляем обобщенный метод printArray, который принимает массив любого типа. 
 * 
 * @param printArr наименование массива 
 * @param arrString строчные элементы массива
 * @param arrInt числовые элементы массива
 * 
 * Single responsibility principle - Принцип единственной ответственности. Потому что в одном классе используется только один метод.
 * Open-closed principle - Принцип открытости/закрытости. Потому что для изменения типа принимаемых элементов нам не нужно изменять метод.
 * Liskov substitution principle - Принцип подстановки Лисков. Объекты этой прогрмаммы могут быть заменены без изменения корректности этой программы
 */
public class Main {
    public static void main(String[] args) {
        PrintArray printArr = new PrintArray();

        String[] arrString = {"Привет", "мир"};
        Integer[] arrInt = {1, 2, 3, 4, 5};

        printArr.printArray(arrString);
        printArr.printArray(arrInt);
    }
}