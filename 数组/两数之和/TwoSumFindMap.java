
import java.util.HashMap;
import java.util.Map;

public class TwoSumFindMap {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 7, 4, 6, 2};
        //定义两数之和是11
        int target = 11;
        int[] result = null;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            //局部变量otherNum用来接收targer-numbers数组中i的值
            int otherNum = target - numbers[i];
            /**
             * 此时遍历numbers数组中第一个元素的1，此时map集合是空的
             *otherNum 10  =  target 11  -numbers[i]  1
             * 判断map中是否有包含的值等于 otherNum 10
             * 但此时map是空的没有符合的条件,就走else代码块,把other当前的值放入map中
             */
            if (map.containsKey(otherNum)) {
                /**
                 * 只有当i走到4时，map中已经有7了，才执行此时的代码块(if里面的)
                 * 4,7符合条件，放入reslt数组中，然后运行下一个代码块
                 */
                result = new int[]{numbers[i], numbers[map.get(otherNum)]};
            } else {
                map.put(numbers[i], i);
            }
        }
        //遍历result数组,放入的顺序的4,7.遍历的结果也就是4,7
        for (int temp : result) {
            System.out.println(temp);
        }
    }
}
