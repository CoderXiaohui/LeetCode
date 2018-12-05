package String;

/**
 * @Auther: Dxh
 * @Date: 2018/12/5 21:06
 * @Description:    557. 反转字符串中的单词 III
 *
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] sArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : sArray){
            char[] array = str.toCharArray();
            for (int i=str.length()-1;i>=0;i--){
                sb.append(array[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
