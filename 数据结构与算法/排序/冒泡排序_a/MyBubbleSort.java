package bubbole;

import java.util.Arrays;

public class MyBubbleSort {
	public static void main(String[] args) {
		int[] arr1 = new int[] {6,3,76,83,5}; // 初始化一个数组并赋值
		BubbleSort(arr1);	//数组作为参数写入排序方法中
		System.out.println(Arrays.toString(arr1));
	}
	//冒泡排序方法，主要是通过中间量值来交换比较后的大小两个数的位置
	//双层循环遍历，i,j=i+1，表示数组中相邻的两个数
	//temp为中间变量
	private static int [] BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;		//返回交换后的数组
	}
	
	
}
