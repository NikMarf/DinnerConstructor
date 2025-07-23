import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> storingDishData;

    DinnerConstructor() {
        storingDishData = new HashMap<>();
    }

    boolean checkType(String typeOfDishes) {
        boolean isTypeExists = false;
        if (storingDishData.containsKey(typeOfDishes)) {
            isTypeExists = true;
        }
        return isTypeExists;
    }

    void addDish(String typeOfDishes, String nameDish) {
        if (storingDishData.containsKey(typeOfDishes)) {
            ArrayList<String> namesDishesInType = storingDishData.get(typeOfDishes);
            namesDishesInType.add(nameDish);
        } else {
            ArrayList<String> namesDishesInType = new ArrayList<>();
            namesDishesInType.add(nameDish);
            storingDishData.put(typeOfDishes, namesDishesInType);
        }
    }

    void genComboDish(int numbersCombination, ArrayList<String>listTypeDish) {
        ArrayList<String> listDishInCombo = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < numbersCombination; i++) {
            System.out.println("Комбо " + (i+1));
            ArrayList<String> dishes = new ArrayList<>();
            for (String types : listTypeDish) {
                if (storingDishData.containsKey(types)) {
                    dishes = storingDishData.get(types);
                    listDishInCombo.add(dishes.get(rnd.nextInt(dishes.size())));
                }
            }
            System.out.println(listDishInCombo);
            if (listDishInCombo.size() != listTypeDish.size()) {
                System.out.println("Комбо неполное. Убедитесь что правильно ввели все типы блюд.");
            }
            listDishInCombo.clear();
        }
    }
}
