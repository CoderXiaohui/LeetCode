package String;

/**
 * @author：dxh
 * @Description：请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Date：9:59-2018/12/24
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        String b= str.toString();
        String c= b.replace(" ","%20");
        return c;
    }


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello word");
        System.out.println(replaceSpace(sb));

    }
}
