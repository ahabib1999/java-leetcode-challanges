public class Main {
    public static void main(String[] args) {
        ContainsDuplicate challange1 = new ContainsDuplicate();
        SingleNumber challange2 = new SingleNumber();
        ArrayIntersection challange3 = new ArrayIntersection();
        HappyNumber challange4 = new HappyNumber();
        TwoSum challange5 = new TwoSum();
        IsomorphicStrings challange6 = new IsomorphicStrings();
        MinimumIndexSum challange7 = new MinimumIndexSum();
        FirstUniqueCharacter challange8 = new FirstUniqueCharacter();
        ArrayIntersectionII challenge9 = new ArrayIntersectionII();
        GroupAnagrams challenge10 = new GroupAnagrams();

        // int[] num1 = {1, 2, 2, 3}; int[] num2 = {2, 2};

        // boolean isDuplicate = challange1.containsDuplicate(nums);
        // System.out.println(isDuplicate);

        // int singleNumber = challange2.findSingleNumber(nums);
        // System.out.println(singleNumber);

        /*
         * int[] intersectionArr = challange3.findArrayIntersection(num1, num2); for
         * (int i = 0;i < intersectionArr.length;i++) {
         * System.out.println(intersectionArr[i]); }
         */

        /*
         * int num = 79; boolean isHappy = challange4.isHappy(num);
         * System.out.println(isHappy); // true
         */

        /*
         * int[] numArr = {1, 5, 5, 3}; int target = 10;
         * 
         * int[] resultArr = challange5.getSum(numArr, target); for (int i = 0; i <
         * resultArr.length;i++) { System.out.println(resultArr[i]); }
         */

        /*
         * String s = "ab"; String t = "aa";
         * 
         * boolean isIsometric = challange6.isIsomorphic(s, t);
         * System.out.println(isIsometric);
         */

        /*
         * String[] restArr1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
         * String[] restArr2 = { "Piatti", "The Grill at Torrey Pines",
         * "Hungry Hunter Steakhouse", "Shogun" };
         * 
         * String[] resultArr = challange7.findRestaurant(restArr1, restArr2); for (int
         * i = 0; i < resultArr.length; i++) { System.out.println(resultArr[i]); }
         */

        /*
         * String givenString = "leetcode"; int uniqueCharIdx =
         * challange8.getUniqChar(givenString); System.out.println(uniqueCharIdx);
         */

        /*
         * int[] intArr1 = { 4, 2, 2, 2 }; int[] intArr2 = { 4, 4 };
         * 
         * int[] resultArr = challenge9.findIntersction(intArr1, intArr2);
         * 
         * for (int i = 0; i < resultArr.length; i++) {
         * System.out.println(resultArr[i]); }
         */

        String[] strArr = { "eat" };
        challenge10.groupAnagrams(strArr);
    }
}