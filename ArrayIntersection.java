import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    
    public int[] findArrayIntersection(int[] num1, int[] num2) {

        Set<Integer> hashset = new HashSet<>();
        ArrayList<Integer> intersectionArrList = new ArrayList<Integer>();

        for (int i = 0;i < num1.length;i++) {

            hashset.add(num1[i]);
        }

        for (int j = 0;j < num2.length;j++) {
            if (hashset.contains(num2[j]) && !(intersectionArrList.contains(num2[j]))) {
                intersectionArrList.add(num2[j]);
            }
        }

        int[] result = new int[intersectionArrList.size()];
        for (int i = 0; i < result.length; i++) {

            result[i] = intersectionArrList.get(i);
        }

        return result;
        
    }
}