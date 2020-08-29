import java.util.Objects;

/**
 * @Author: LvDaMing
 * @Date: 2020-08-29
 * @Description: 机器人能否返回原点
 */
public class Robot {
    public static void main(String[] args) {
        System.out.println(judgeCircle("RRLLUUDD"));
    }

    /**
     * 在二维平面上,有一个机器人从原点(0,0)开始.给出它的移动顺序,判断这个机器人在完成
     * 移动后是否在(0,0)处结束.
     *
     * 移动顺序由字符串表示.字符move[i]表示第i次移动.机器人的有效动作有R(右),L(左),
     * U(上)和D(下).如果机器人在完成所有动作后返回原点,则返回true.否则,返回false.
     *
     * 注意:机器人"面朝"的方向无关紧要."R"将始终使机器人向右移动一次,"L"将始终向左移动等.
     * 此外,假设每次移动机器人的移动幅度相同.
     *
     *
     */

    /**
     *
     * 1.先将字符串转换为字符数组
     * 2.根据数组下标找到对应的移动操作进行移动
     * 3.x和y为0,则移动回原点
     * @param moves
     * @return
     */
    public static boolean judgeCircle(String moves) {
        if (Objects.isNull(moves) || moves.trim().length()<=0){
            return false;
        }
        char [] chars = moves.toCharArray();
        int x=0;
        int y=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]!='R' && chars[i]!='L' && chars[i]!='U' && chars[i]!='D'){
                return false;
            }else if (chars[i] == 'R'){
                x++;
            }else if (chars[i] == 'L'){
                x--;
            }else if (chars[i] == 'U'){
                y++;
            }else if (chars[i] == 'D'){
                y--;
            }
        }
        return x==0&&y==0;
    }


    /**
     * 1.获取字符串的长度
     * 2.通过String的charAt(int x),循环每个字符进行比较,操作机器人移动
     * 3.x和y为0,则移动回原点
     * @param moves
     * @return
     */
    public static boolean judgeCircle_1(String moves) {
        if (Objects.isNull(moves) || moves.trim().length()<=0){
            return false;
        }
        int x=0;
        int y=0;
        int length = moves.length();
        for (int i=0;i<length;i++){
           switch (moves.charAt(i)){
               case 'R':
                   x++;
                   break;
               case 'L':
                   x--;
                   break;
               case 'U':
                   y++;
                   break;
               case 'D':
                   y--;
                   break;
               default:
                   return false;
           }
        }
        return x==0&&y==0;
    }






}
