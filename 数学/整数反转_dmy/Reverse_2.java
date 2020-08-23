public class Reverse_2{

    public static void main(String[] args) {
        int res = reverse(9010900);
        System.out.println(res);
    }
    public static int reverse(int i){
        //返回结果初始值
        int res = 0;
        //过滤掉最后一位数为0或者当前数为0
        while (i != 0) {
            // i%10 = i的个位数
            int pop = i % 10;
            //结果大于 int类型最大值/10 或者 （结果等于int类型最大值/10 并且 i的个位数 大于7 判断是否超出int的最大值
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            //结果小于 int类型最小值/10 或者 （结果等于int类型最小值/10 并且 i的个位数 小于-8 判断是否超出int的最小值
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            //每次将结果乘以10再加i的个位数
            res = res * 10 + pop;
            //每次去除个位数
            i /= 10;
        }
        return res;
    }
}