public class RemoveElement {

    public int removeGivenElement(int val, int[] intArr) {

        if (intArr.length == 0) {
            return 0;
        }

        int start = 0;
        int end = intArr.length - 1;
        int length = 0;

        while (start < end) {

            if (intArr[start] == val) {

                while (intArr[end] == val && end > start) {
                    end--;
                }

                if (end < start) {
                    break;
                }

                else {
                    int temp = intArr[end];
                    intArr[end] = intArr[start];
                    intArr[start] = temp;
                }

                start++;
                end--;
            }

            else {
                start++;
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == val) {
                break;
            }
            System.out.println(intArr[i]);
        }
        return length;
    }
}