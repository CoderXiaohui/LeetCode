package String;

/**
 * @Auther: Dxh
 * @Date: 2018/12/5 20:35
 * @Description:    709. 转换成小写字母
 *
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 */
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }



    public static String toLowerCase(String str) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        for(int i=0 ;i<str.length();i++){
            String  charstr = str.substring(i,i+1);
            int temp = upper.indexOf(charstr);
            if (temp>=0){
                String lowerChar =  lower.substring(temp,temp+1);
                res+=lowerChar;
            }else{
                res +=charstr;
            }
        }
        return res;
    }
}
