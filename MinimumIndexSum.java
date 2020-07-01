import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumIndexSum {

    private class Restaurant {
        String name;
        int index;
        int sum;

        public Restaurant(String name, int index, int sum) {
            this.name = name;
            this.index = index;
            this.sum = sum;
        }
    }

    public String[] findRestaurant(String[] restaurantArr1, String[] restaurantArr2) {
        HashMap<String, Integer> restaurantsMap = new HashMap<>();
        ArrayList<Restaurant> restArrList = new ArrayList<>();
        String[] shorterArr;
        String[] longerArr;

        if (restaurantArr1.length < restaurantArr2.length) {
            shorterArr = restaurantArr1;
            longerArr = restaurantArr2;
        } else {
            shorterArr = restaurantArr2;
            longerArr = restaurantArr1;
        }

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < longerArr.length; i++) {
            String currentRestaurant = longerArr[i];
            restaurantsMap.put(currentRestaurant, i);
        }

        for (int i = 0; i < shorterArr.length; i++) {
            String selectedRestaurant = shorterArr[i];

            if (restaurantsMap.containsKey(selectedRestaurant)) {
                int selectedMapIdx = restaurantsMap.get(selectedRestaurant);
                int selectedArrIdx = i;
                int idxSum = selectedArrIdx + selectedMapIdx;
                Restaurant res = new Restaurant(selectedRestaurant, selectedMapIdx, idxSum);
                restArrList.add(res);
            }
        }

        for (int i = 0; i < restArrList.size(); i++) {
            int currentSum = restArrList.get(i).sum;
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < restArrList.size(); i++) {
            Restaurant currentRestaurant = restArrList.get(i);
            int currentSum = currentRestaurant.sum;
            if (currentSum == minSum) {
                resultList.add(currentRestaurant.name);
            }
        }

        String[] resultArr = new String[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }

        return resultArr;
    }
}

// cat, sum = 1, idx = 1
// bat, sum = 3, idx = 3
// mat, sum = 1, idx= 0
// minSum = 1

// {"cat", }