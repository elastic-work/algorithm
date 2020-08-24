package sort;

public class Shell {
    /*
       对数组a中的元素进行排序
    */
    public static void sort(Comparable[] a){
        //1.根据数组a的长度，确定增长量h的初始值；
        int h = 1;
        while(h<a.length/2){
            h=2*h+1;
        }
        //2.希尔排序
        while(h>=1){
            //排序
            //2.1.找到待插入的元素
            for (int i=h;i<a.length;i++){
                //2.2把待插入的元素插入到有序数列中
                for (int j=i;j>=h;j-=h){

                    //待插入的元素是a[j],比较a[j]和a[j-h]
                    if (greater(a[j-h],a[j])){
                        //交换元素
                        exch(a,j-h,j);
                    }else{
                        //待插入元素已经找到了合适的位置，结束循环；
                        break;
                    }
                }

            }
            //减小h的值
            h= h/2;
        }

    }

    /*
        比较v元素是否大于w元素
     */
    private static  boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    /*
    数组元素i和j交换位置
     */
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
