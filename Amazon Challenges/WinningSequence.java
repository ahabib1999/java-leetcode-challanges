public class WinningSequence {
    // 20 21 22 21 20
    // 20 21 22 21 20
    // num = 5, lowerEnd = 20, upperEnd = 22
    public int[] winningSequence(int num, int lowerEnd, int upperEnd) {
        int[] sequence = new int[num];
        // sequence = [21]
        if (upperEnd - 1 < lowerEnd || (upperEnd - 1 <= lowerEnd && num > 3)) {
            return null;
        }

        sequence[0] = upperEnd - 1;

        for (int i = 1; i < num; i++) {
            sequence[i] = upperEnd;
            upperEnd = upperEnd - 1;
        }
        return sequence;
    }
}