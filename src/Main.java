import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinnerConstructor dinnerConstructor = new DinnerConstructor();
        dinnerConstructor.addDish("Напиток","Яблочный сок"); dinnerConstructor.addDish("Напиток","Морс"); dinnerConstructor.addDish("Напиток", "RedBull");
        dinnerConstructor.addDish("Гарнир","Рис"); dinnerConstructor.addDish("Гарнир","Гречка"); dinnerConstructor.addDish("Гарнир","Перловка");
        dinnerConstructor.addDish("Мясо","Поджарка из свинины"); dinnerConstructor.addDish("Мясо","Печень"); dinnerConstructor.addDish("Мясо","Свиная шея");
        dinnerConstructor.addDish("Первое","Борщ"); dinnerConstructor.addDish("Первое","Окрошка на кефире"); dinnerConstructor.addDish("Первое","Рассольник");
        dinnerConstructor.addDish("Второе","Тайский рис с курицей"); dinnerConstructor.addDish("Второе","Запеканка мясная"); dinnerConstructor.addDish("Второе","Карбонара");

        System.out.println(dinnerConstructor.storingDishData);
        ArrayList<String> listTest = new ArrayList<>();
        listTest.add("лык"); listTest.add("жмых"); listTest.add("ку");
        dinnerConstructor.genComboDish(3, listTest);
        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите тип блюда:");
                String typeOfDishes = scanner.next();
                if (dinnerConstructor.checkType(typeOfDishes)) {
                    System.out.println("Введите тип блюда:");
                    String nameDish = scanner.next();
                    System.out.println("Новое блюдо добавлено.");
                } else {
                    System.out.println("Введите первое блюдо для нового типа блюд:");
                    String nameDish = scanner.next();
                    System.out.println("Новый тип блюд: [" + typeOfDishes + "] создан. В него добавлено первое блюдо.");
                }
            } else if (command == 2) {
                System.out.println("Введите необходимое количество комб-ланчей:");
                int numbersCombination = scanner.nextInt();
                System.out.println("Вводите типы блюд, разделяя символом переноса строки (enter)."
                        + " Для завершения ввода введите пустую строку.");
            } else if (command == 3) {
                System.out.println("Выход из программы.");
            } else {
                System.out.println("Извините, такой команды нет.");
            }

        }
    }

    public static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }
}


