import java.util.HashSet;

public class HappyNumber {
    
    public boolean isHappy(int n) {

        HashSet<Integer> squaredSumSet = new HashSet<Integer>();
        int num = n;

        while (num != 1) {

            num = getSquaredSum(num);
            
            if (squaredSumSet.contains(num)) {
                return false;
            }

            else {
                squaredSumSet.add(num);
            }
        }

        return true;
    }

    public int getSquaredSum (int num) {
        int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum += (rem * rem);
                num = num / 10;
            }
        return sum;
    }
}