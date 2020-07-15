public class EvenNumDigits {

    public int countNumEvenDigitInts(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int numDigits = getNumDigits(nums[i]);

            if (numDigits % 2 == 0) {
                count += 1;
            }
        }

        return count;
    }

    public int getNumDigits(int num) {
        int numDigits = 0;

        if (num == 0) {
            numDigits = 1;
        }

        while (num > 0) {
            numDigits += 1;
            num = num / 10;
        }

        return numDigits;
    }
}