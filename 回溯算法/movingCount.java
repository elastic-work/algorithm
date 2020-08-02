public class movingCount {
    /*  剑指offer--机器人的运动范围
    *   Q: 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
    *   但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
    *   但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
    *   A: 回溯法
    *       1、根据指定方格初始化一个标志位数组，默认false，走过即为true
    *       2、开始回溯
    *       3、根据行列数计算位置
    *       4、回溯终止条件：数组越界、标志位为true、不符合行列坐标数位之和的条件（抽出一个判断方法）。返回0
    *       5、标志位改变
    *       6、递归寻找四个方向的格子，并加1，作为返回值
    * */

    public int movingCount(int threshold, int rows, int cols){
        boolean[] flag = new boolean[rows*cols];
        return movingCountCore(threshold,rows,cols,0,0,flag);
    }

    private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] flag) {
        int index = row*cols+col;
        if (row<0 || col<0 || row>=rows || col>=cols || flag[index] == true || !checkSum(threshold,row,col)){
            return 0;
        }
        flag[index] = true;
        return 1+movingCountCore(threshold,rows,cols,row+1,col,flag)
                +movingCountCore(threshold,rows,cols,row-1,col,flag)
                +movingCountCore(threshold,rows,cols,row,col-1,flag)
                +movingCountCore(threshold,rows,cols,row,col+1,flag);
    }

    private boolean checkSum(int threshold, int row, int col) {
        int sum = 0;
        while (row != 0){
            sum += row%10;
            row = row/10;
        }
        while (col != 0){
            sum += col%10;
            col = col/10;
        }
        if (sum>threshold)return false;
        return true;
    }

}
