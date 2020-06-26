public class Main {
    public static void main(String[] args) {
        ContainsDuplicate challange1 = new ContainsDuplicate();
        SingleNumber challange2= new SingleNumber();
        ArrayIntersection challange3 = new ArrayIntersection();

        int[] num1 = {1, 2, 2, 3};
        int[] num2 = {2, 2};

        //boolean isDuplicate = challange1.containsDuplicate(nums);
        //System.out.println(isDuplicate);

        //int singleNumber = challange2.findSingleNumber(nums);
        //System.out.println(singleNumber);

        int[] intersectionArr = challange3.findArrayIntersection(num1, num2);
        for (int i = 0;i < intersectionArr.length;i++) {
            System.out.println(intersectionArr[i]);
        }
    }
}