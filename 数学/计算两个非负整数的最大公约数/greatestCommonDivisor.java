package com.example.demo;

/**
 * @author jie.liu
 * @version 1.0
 * @date 2020/8/2 20:57
 */
public class greatestCommonDivisor{

    public static void main(String[] args) {


    }

    /**
     * 计算两个非负整数p和q的最大公约数：若q=0，则最大公约数为p。
     * 欧几里得碾转相除
     * @return
     */
    public static int greatestCommonDivisor1(int p, int q){
        if(q == 0){
            return p;
        }
        int r = p % q;
        return greatestCommonDivisor1(q, r);
    }

    /**
     * 计算两个非负整数p和q的最大公约数：若q=0，则最大公约数为p。
     * 遍历方法
     * @return
     */
    public static int greatestCommonDivisor2(int p, int q){
        int maxNum = 0;

        if(p == 0){
            return q;
        }

        if(q == 0){
            return p;
        }

        if(p > q){
            for (int i = q; i>=1; i--) {
                //判断一个数同时满足被p,q整除
                if (q%i==0 && p%i==0) {
                    maxNum=i;
                    break;
                }
            }
            return maxNum;
        }else{
            for (int i = p; i>=1; i--) {
                //判断一个数同时满足被p,q整除
                if (q%i==0 && p%i==0) {
                    maxNum=i;
                    break;
                }
            }
            return maxNum;
        }
    }

}
