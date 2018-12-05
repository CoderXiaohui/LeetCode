package String;

/**
 * @Auther: Dxh
 * @Date: 2018/12/5 20:52
 * @Description:    344. 反转字符串
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("u evol I"));
    }


    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ca = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(ca[i]);
        }
        return  sb.toString();
    }
}
