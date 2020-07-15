public class Main {

    public static void main(String[] args) {

        MaxConsecutiveOnes challenge1 = new MaxConsecutiveOnes();
        EvenNumDigits challenge2 = new EvenNumDigits();
        SortedSquaresArray challenge3 = new SortedSquaresArray();
        DuplicateZeros challenge4 = new DuplicateZeros();
        MergeSortedArrays challenge5 = new MergeSortedArrays();
        RemoveElement challenge6 = new RemoveElement();

        int[] numArr1 = { 1, 2, 3, 0, 0, 0 };
        int[] numArr2 = { 2, 5, 6 };

        // int max = challenge1.countOnes(intArr);

        // int count = challenge2.countNumEvenDigitInts(intArr);

        // challenge3.sortSquares(intArr);

        // challenge4.duplicateZerosInArr(intArr);

        // challenge5.mergeArrays(numArr1, numArr1.length - numArr2.length, numArr2,
        // numArr2.length);

        int[] intArr = { 1, 0, 2, 0, 3, 0 };
        int[] intArr2 = { 5, 3, 3, 4, 6, 0 };
        int[] intArr3 = { 5, 2, 5 };
        int length = challenge6.removeGivenElement(3, intArr3);
        System.out.println(length);
    }
}