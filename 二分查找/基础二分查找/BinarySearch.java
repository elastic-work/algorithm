package com.example.demo;

import java.util.Arrays;

/**
 * @author jie
 * @version 1.0
 * @date 2020/7/27 0:53
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        int index = search(4,arr);
        System.out.print(index);
    }


    /**
     * 二分查找,查询出数组中哪个下标元素为输入的key值，若key值不存在则返回-1
     * @param key 输入的需要查询的值
     * @param arr 输入的查询数组
     * @return
     */
    public static int search(int key, int[] arr){
        if(arr == null){
            return  -1;
        }

        //传进来的数组必须是有序的，这里排序算法就不去展示，而是引用java的公共实现方法
        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = arr.length-1;

        //被查找的键要么不存在，要么存在于arr数组之中
        while(startIndex <= endIndex){
            //向下取整不排除偶数情况
            int midIndex = (int) (startIndex + Math.floor((endIndex - startIndex)/2));
            if(key < arr[midIndex]){
                endIndex = midIndex - 1;
            }else if(key > arr[midIndex]){
                startIndex = midIndex + 1;
            }else{
                return midIndex;
            }
        }
        return -1;
    }

}
