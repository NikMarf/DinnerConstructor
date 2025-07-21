import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> storingDishData;

    DinnerConstructor() {
        storingDishData = new HashMap<>();
    }

    void addDish(String typeDish, String nameDish) {
        if (storingDishData.containsKey(typeDish)) {
            ArrayList<String> namesDishesInType = storingDishData.get(typeDish);
            namesDishesInType.add(nameDish);
        } else {
            ArrayList<String> namesDishesInType = new ArrayList<>();
            namesDishesInType.add(nameDish);
            storingDishData.put(typeDish, namesDishesInType);
        }
    }

    void genComboDish(int numbersCombination, ArrayList<String>listTypeDish) {
        ArrayList<String> listDishInCombo = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < numbersCombination; i++) {
            System.out.println("Комбо " + i);
            ArrayList<String> dishes = new ArrayList<>();
            for (String types : listTypeDish) {
                if (storingDishData.containsKey(types)) {
                    dishes = storingDishData.get(types);
                    listDishInCombo.add(dishes.get(rnd.nextInt(dishes.size()-1)));
                }
            }
            if (listDishInCombo.size() != listTypeDish.size()) {
                System.out.println("Комбо неполное. Убедитесь что правильно ввели типы блюд.");
            }
            System.out.println(listDishInCombo);
        }
    }
}
