public class ToLowerCase {
    public static void main(String[] args) {

        String str = toLowerCase("Hello");
        System.out.println(str);
    }

    private static String toLowerCase(String str) {
        if (str.trim().length()<=0){
            return null;
        }
        char[] chars = str.toCharArray();
        for (int i = 0;i < chars.length;i++){
            if (chars[i]>=65 && chars[i]<=90){
                chars[i]=(char)(chars[i]+32);
            }
        }
        return String.valueOf(chars);
    }
}
