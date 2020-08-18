package sort;

public class Insertion {
    /*
    对数组a中的元素进行排序
     */
    public static void sort(Comparable[]a){
        for (int i=1;i<a.length;i++){

            for (int j=i;j>0;j--){
                //比较索引j处的值和索引j-1处的值，如果j-1处的值比索引j处的值，则交换数据，如果大，就找到核实的位置，退出循环即可；
                //当前元素为a[i],依次和i前面的元素比较，找到一个小于等于a[i]的元素
                if (greater(a[j-1],a[j])){
                    //交换元素
                    exch(a,j-1,j);
                }else {
                    //找到了该元素，结束
                    break;
                }
            }
        }

    }

    /**
     * 比较v元素是否大于w元素
     */
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }


    /**
     * 数组元i和j交换位置
     */
    public static  void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
