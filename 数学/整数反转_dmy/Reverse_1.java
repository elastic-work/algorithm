public class Reverse_1{

    public static void main(String[] args) {
        int res = reverse(9010900);
        System.out.println(res);
    }
    public static int reverse(int i){
        int res = i;
        if (i<0){
            res=0-i;
        }
        String str = Integer.toString(res);
        char []cs = str.toCharArray();
        char []cs2 = new char[cs.length];
        for (int j=0;j<cs.length;j++){
            cs2[j]=cs[cs.length-1-j];
            if (j == cs.length-1 && j==0 && cs2[j]=='0'){
                cs2[j]=' ';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j=0;j<cs2.length;j++){
            sb.append(cs2[j]);
        }
        try{
            res=Integer.parseInt(sb.toString().trim());
        }catch (NumberFormatException e){
            return 0;
        }
        if (i<0){
            return -res;
        }
        return res;
    }
}