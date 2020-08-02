public class hasPath {

    /*  剑指offer--矩阵中的路径
    *   Q: 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
    *       每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
    *       例如   a b c e   矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
    *             s f c f
    *             a d e e
    *       因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
    *   A: 使用回溯算法
    *       1、根据给定的数组，初始化一个标志位数组，默认false，代表未经过，经过则为true
    *       2、遍历数组，找到与给定字符串的第一个字符相匹配的元素，开始回溯
    *       3、根据行列位置确定元素所在位置
    *       4、终止本次回溯的条件：数组越界、数组中无与下一个字符相匹配的元素、经过该元素
    *       5、回溯结束条件：回溯字符为字符串中最后一个字符
    *       6、递归寻找周围四个位置是否符合条件，只要有一个位置符合，就可继续递归下去，寻找这个位置的周围位置符合条件，
    *          直到最后一个字符递归终止或条件不满足而终止。
    *       7、条件不满足，本次路径失败，还原标志位
    * */

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i<rows;i++){
            for (int j = 0; j < cols; j++){
                if (judge(matrix,i,j,rows,cols,flag,str,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str, int k) {
        int index = i*cols+j;
        if (i<0 || j<0 || i>=rows || j>= cols || matrix[index] != str[k] || flag[index] == true){
            return false;
        }
        if (k == str.length-1){
            return true;
        }
        flag[index]=true;
        if (judge(matrix,i-1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i+1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j-1,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j+1,rows,cols,flag,str,k+1)){
            return true;
        }
        flag[index]=false;
        return false;
    }
}
