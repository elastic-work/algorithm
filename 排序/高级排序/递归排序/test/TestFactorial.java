package test;

public class TestFactorial {

    public static void main(String[] args) {
        //求N的阶乘,层级不能太深，否则内存会溢出
        long result = factorial(10);
        System.out.println(result);
    }


    //求n的阶乘
    public static long factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
