
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class TwoSumMapFind {

    public static void main(String[] args) {
        long startTime =System.currentTimeMillis();
        int[] numbers = new int[]{1, 3, 7, 4, 6, 2};
        int target = 11;
        int[] result = null;
        Map<Integer, Integer> map = new HashMap<>();
        //先遍历numbers数组方法哦map集合中
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int otherNum = target - numbers[i];
            /**
             * 当other的值和map集合中某个元素的值相等时，并且不等于i,则满足条件
             */
            if (map.containsKey(otherNum) && map.get(otherNum) != i) {
                result = new int[]{numbers[i], numbers[map.get(otherNum)]};
                break;
            }
        }
        for (int temp : result) {
            System.out.println(temp);
        }


        System.out.println(startTime);
        System.out.println(startTime);


    }


}
