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

    ArrayList<String> genComboDish(int numbersCombination) {
        ArrayList<String> listDishInCombo = new ArrayList<>();

        return listDishInCombo;
    }
}
