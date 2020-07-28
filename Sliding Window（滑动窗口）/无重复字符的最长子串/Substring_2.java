class Substring_1{
    /**
     * 无重复字符的最长子串
     * 题目描述：给定一个字符串，请你找出其中不含有重复字符的“最长子串”的长度。
     * 示例1：
     *      输入：“abcabcbb”
     *      输出：3
     *      解释：因为无重复字符的最长子串是“abc”，所以其长度为 3.
     *  示例2：
     *      输入：“bbbbb”
     *      输出：1
     *      解释：因为无重复字符的最长子串是“b”,所以其长度为1.
     *   示例3：
     *      输入：“pwwkew”
     *      输出:3
     *      解释：因为无重复字符的最长子串是“wke”，所以其长度为3.
     */

    public static void main(String[] args) {
        int res = getSubstring("pwwkew");
        System.out.println(res);
    }

    /**
     * 获取最长子串
     * @param str
     * @return
     */
    public static int getSubstring(String str){
        if (s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }


}