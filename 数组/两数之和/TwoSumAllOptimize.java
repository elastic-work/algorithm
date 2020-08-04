public class TwoSumAllOptimize {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 7, 4, 6, 2};
        int target = 11;
        int[] result = null;
        for (int i = 0; i < numbers.length; i++) {
            /**
             * 每当运行到numbers数组中元素的值时，都会跟之前的元素再次比较，前一个元素已经比较过了，这就是重复操作了
             * 比如：当 i 是 1  时后跟后面的元素依次比较，是否有满足条件的元素
             *      当 i 是3   时 还会跟之前的元素 1 再次比较，当i是1是已经操作过了。
             *      所有要去掉重复的操作，提升便代码运行的效率
             */
            for (int j =i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result = new int[]{numbers[i], numbers[j]};
                    break;
                }
            }
        }
        for (int temp : result) {
            System.out.println(temp);
        }
    }
}
