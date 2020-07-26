
import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 7, 4, 6, 2};
        int target = 11;
        int[] result = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int otherNum = target - numbers[i];
            if (map.containsKey(otherNum) && map.get(otherNum) != i) {
                result = new int[]{numbers[i], numbers[map.get(otherNum)]};
                break;
            }
        }
        for (int temp : result) {
            System.out.println(temp);
        }
    }
}
