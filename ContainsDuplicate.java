import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> hashset = new HashSet<>();
        
        for (int i = 0;i < nums.length;i++) {
            if (hashset.contains(nums[i])) {
                return true;
            }

            hashset.add(nums[i]);
        }
        return false;
    }
}