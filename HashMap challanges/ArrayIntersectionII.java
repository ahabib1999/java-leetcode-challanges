import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersectionII {

    public int[] findIntersction(int[] intArr1, int[] intArr2) {

        HashMap<Integer, Integer> intMap = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        int[] longerArr;
        int[] shorterArr;

        if (intArr1.length > intArr2.length || intArr1.length == intArr2.length) {
            longerArr = intArr1;
            shorterArr = intArr2;
        }

        else {
            longerArr = intArr2;
            shorterArr = intArr1;
        }

        for (int i = 0; i < longerArr.length; i++) {
            int currentInt = longerArr[i];

            if (intMap.containsKey(currentInt)) {
                int numInstances = intMap.get(currentInt);
                numInstances++;
                intMap.put(currentInt, numInstances);
            }

            else {
                intMap.put(currentInt, 1);
            }
        }

        for (int j = 0; j < shorterArr.length; j++) {
            int currentElem = shorterArr[j];

            if (intMap.containsKey(currentElem)) {
                int numInstances = intMap.get(currentElem);

                if (numInstances > 0) {
                    resultList.add(currentElem);
                    numInstances--;
                    intMap.put(currentElem, numInstances);
                }
            }
        }

        int[] resultArr = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }

        return resultArr;
    }
}