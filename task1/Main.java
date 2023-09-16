package task1;
/**
 * Мы объявляем обобщенный метод printElement, который принимает один параметр типа T.
 * 
 * @param Element принимаемый параметр типа Т
 * 
 * 
 * Single responsibility principle - Принцип единственной ответственности. Потому что в одном классе используется только один метод.
 * Open-closed principle - Принцип открытости/закрытости. Потому что для изменения типа принимаемых параметров нам не нужно изменять метод.
 * Liskov substitution principle - Принцип подстановки Лисков. Объекты этой прогрмаммы могут быть заменены без изменения корректности этой программы
 * 
 */
public class Main {
    public static void main(String[] args) {
        PrintElement Element = new PrintElement();

        Element.printElement(1);
        Element.printElement("Привет, мир");
        Element.printElement(1.1);
    }
}