public class Main {

    public static void main(String[] args) {

        MaxConsecutiveOnes challenge1 = new MaxConsecutiveOnes();
        EvenNumDigits challenge2 = new EvenNumDigits();
        SortedSquaresArray challenge3 = new SortedSquaresArray();
        DuplicateZeros challenge4 = new DuplicateZeros();
        MergeSortedArrays challenge5 = new MergeSortedArrays();
        RemoveElement challenge6 = new RemoveElement();
        RemoveDuplicates challenge7 = new RemoveDuplicates();

        int[] numArr1 = { 1, 2, 3, 0, 0, 0 };
        int[] numArr2 = { 2, 5, 6 };
        int[] intArr = { 1, 0, 2, 0, 3, 0 };
        int[] intArray = { 0, 1, 1, 2, 2, 3, 3 };

        // int max = challenge1.countOnes(intArr);

        // int count = challenge2.countNumEvenDigitInts(intArr);

        // challenge3.sortSquares(intArr);

        // challenge4.duplicateZerosInArr(intArr);

        // challenge5.mergeArrays(numArr1, numArr1.length - numArr2.length, numArr2,
        // numArr2.length);

        // int length = challenge6.removeGivenElement(3, intArr);

        int len = challenge7.removeDuplicates(intArray);
        System.out.println(len);

        for (int i = 0; i < len; i++) {
            System.out.println(intArray[i]);
        }
    }
}