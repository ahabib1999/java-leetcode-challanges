import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    
    public int findSingleNumber(int[] nums) {
        
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int currentElement = 0;

        for (int i = 0;i < nums.length;i++) {

            currentElement = nums[i];

            if (hashmap.containsKey(currentElement)) {
                int numOccurances = hashmap.get(currentElement);
                numOccurances += 1;
                hashmap.put(currentElement, numOccurances);
            }

            else {
                hashmap.put(currentElement, 1);
            }
        }

        for (Map.Entry<Integer, Integer> mapEntry : hashmap.entrySet()) {
            if(mapEntry.getValue() == 1) {
                return mapEntry.getKey();
            }
        }
        return 0;

    }
}