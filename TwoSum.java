import java.util.HashMap;

public class TwoSum {
    
    public int[] getSum (int[] numArr, int target) {

        HashMap <Integer, Integer> numHashMap = new HashMap<>();
        int[] resultArr = {0, 0};

        for (int i = 0; i < numArr.length;i++) {

            if (numHashMap.containsKey(target - numArr[i])) {
                resultArr[0] = i;
                resultArr[1] = numHashMap.get(target - numArr[i]);
            }

            else {
                numHashMap.put(numArr[i], i);
            }
        }
        return resultArr;
    }
}