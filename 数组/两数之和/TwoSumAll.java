 
public class TwoSumAll {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 7, 4, 6, 2};
        int target = 11;
        int[] result = null;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
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
