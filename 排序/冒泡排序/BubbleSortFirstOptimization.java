/**
 * 冒泡排序的第一次优化
 */
public class BubbleSortFirstOptimization {
    public static void main(String[] args) {
                 int[] list = {5,4,3,1,2};
                 int temp = 0; // 开辟一个临时空间, 存放交换的中间值
                 // 要遍历的次数
                 for (int i = 0; i < list.length-1; i++) {
                         int flag = 1; //设置一个标志位
                         //依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
                         for (int j = 0; j < list.length-1-i; j++) {
                                 // 比较相邻的元素，如果前面的数小于后面的数，交换
                                 if (list[j] < list[j+1]) {
                                         temp = list[j+1];
                                         list[j+1] = list[j];
                                         list[j] = temp;
                                         flag = 0;  //发生交换，标志位置0
                                     }
                             }
                         System.out.format("第 %d 遍最终结果：", i+1);
                         for(int count:list) {
                                 System.out.print(count);
                             }
                         System.out.println("");
                         if (flag == 1) {//如果没有交换过元素，则已经有序
                                 return;
                             }

                     }
             }
}
