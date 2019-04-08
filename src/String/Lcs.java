package String;

/**
 * @Auther: Dxh
 *  给两个字符串，求两个字符串的最长子串（例如：“abc”“xyz”的最长子串为空字符串，“abcde”和“bcde”的最长子串为“bcde”）
 */
public class Lcs {

    public static String lCs(String a,String b){
        int[][] arr = new int [a.length()][b.length()];
        int leng = 0;
        int index = 0;

        for (int i=0;i<a.length();i++){
            for (int j=0;j<b.length();j++){
                if (a.substring(i,i+1).equals(b.substring(j,j+1))){
                    if (i>0 && j>0){
                        arr[i][j] = 1+ arr[i-1][j-1] ;
                    }else{
                        arr[i][j] = 1;
                    }
                }else {
                    arr[i][j] = 0;
                }
                if (arr[i][j]>leng){

                    leng=arr[i][j];
                    index = i ;
                }
            }
        }
        return a.substring(index-leng+1,index+1);
    }


    public static void main(String[] args) {
        System.out.println(Lcs.lCs("abcdefghij","asdabchij"));
    }
}
