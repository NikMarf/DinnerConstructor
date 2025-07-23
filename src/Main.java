import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinnerConstructor dinnerConstructor = new DinnerConstructor();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            scanner.nextLine();
            if (command == 1) {
                //Обработка вводных значений перед добавлением в таблицу
                System.out.println("Введите тип блюда:");
                String typeOfDishes = scanner.nextLine();
                if (dinnerConstructor.checkType(typeOfDishes)) {
                    System.out.println("Введите название блюда:");
                    String nameDish = scanner.nextLine();
                    dinnerConstructor.addDish(typeOfDishes, nameDish);
                    System.out.println("Новое блюдо добавлено.");
                } else {
                    System.out.println("Введите первое блюдо для нового типа:");
                    String nameDish = scanner.nextLine();
                    dinnerConstructor.addDish(typeOfDishes, nameDish);
                    System.out.println("Новый тип блюд: [" + typeOfDishes + "] создан. В него добавлено первое блюдо.");
                }
            } else if (command == 2) {
                //Создание вводных аргументов генерации ланч-комб
                System.out.println("Введите необходимое количество комб-ланчей:");
                int numbersCombination = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Вводите типы блюд, разделяя символом переноса строки (enter)."
                        + " Для завершения ввода введите пустую строку.");
                ArrayList<String> typesOfDishes = new ArrayList<>();
                while (true) {
                    String enterTypesOfDishes = scanner.nextLine();
                    if (enterTypesOfDishes.isEmpty()) {
                        break;
                    }
                    typesOfDishes.add(enterTypesOfDishes);
                }
                dinnerConstructor.genComboDish(numbersCombination, typesOfDishes);

            } else if (command == 3) {
                System.out.println("Выход из программы.");
                break;
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


