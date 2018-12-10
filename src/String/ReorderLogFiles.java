package String;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: Dxh
 * @Date: 2018/12/10 20:26
 * @Description: 937. 重新排列日志文件
 *
 * 你有一个日志数组 logs。每条日志都是以空格分隔的字串。
 *
 * 对于每条日志，其第一个字为字母数字标识符。然后，要么：
 *
 * 标识符后面的每个字将仅由小写字母组成，或；
 * 标识符后面的每个字将仅由数字组成。
 * 我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。
 *
 * 将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按字母顺序排序，忽略标识符，标识符仅用于表示关系。数字日志应该按原来的顺序排列。
 *
 * 返回日志的最终顺序。
 *
 *
 * 示例 ：
 *
 * 输入：["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * 输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *
 * 提示：
 *
 *  0 <= logs.length <= 100
 *  3 <= logs[i].length <= 100
 *  logs[i] 保证有一个标识符，并且标识符后面有一个字。
 */
public class ReorderLogFiles {
    public static void main(String[] args) {
        String[] a ={"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] b = reorderLogFiles(a);
        for (String str:b){
            System.out.println(str);
        }

    }

    public static  String[] reorderLogFiles(String[] logs) {
        LinkedList<String> list1 = new LinkedList();
        List<String> list2 = new ArrayList();

        for(int i=0 ;i<logs.length;i++){
            String str = logs[i];
            String[] strArray = str.split(" ");
            Pattern pattern = Pattern.compile("[0-9]{1}");
            Matcher matcher = pattern.matcher((CharSequence) strArray[1]);
            if (matcher.matches()){ //是数字
                list2.add(str);
                continue;
            }else{
                if (i==0){
                  list1.add(str);
                  continue;
                }else{
                    String[] temp = logs[i].split(" ");



                }
            }
        }







        return null;
    }
}
