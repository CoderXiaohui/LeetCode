package String;

/**
 * @Auther: Dxh
 * @Date: 2018/12/8 18:33
 * @Description:
 */
public class RotatedDigits {


    //   2  5  6  9            4     4
    //  12 15 16 19            4     8
    //  20 21 22 25 26 28 29   7     15
    //                               15
    //                               15
    //  50 51 52 55 56 58 59   7     22
    //  60 61 62 65 66 68 69   7     29
    //                               29
    //  82 85 86 89            4     33
    //  90 91 92 95 96 98 99   7     40
    //  102  105 106 109
    //  112  115  116  119
    //  120  121  122

    //   2   5   6   9                              4
    //  12  15  16  19  20                          9
    //  21  22  25  26  28  29                     15
    //                                             15
    //                          50
    //    51  52  55  56  58  59  60
    //  61  62  65  66  68  69
    //  82  85  86  89  90
    //  91  92  95  96  98  99  100

    public  int rotatedDigits(int N) {
        int[] a = new int[]{4,8,15,15,15,22,29,29,33,40};
        int[] b = new int[]{0,  1,  8};
        int[] c = new int[]{2,  5,  6,  9};
        int gw = N%10;
        int sw = N/10%10;
        int baiw = N/100%10;
        int qianw = N/1000%10;
        int[] d = {gw,sw,baiw,qianw};
        for(int i=3;i>=0;i--){

        }










//        Math.pow(m,n);
        return 0;


    }

    public static void main(String[] args) {
        int temp = 16;
        int gw = temp%10;
        int sw = temp/10%10;
        int baiw = temp/100%10;
        int qianw = temp/1000%10;
        System.out.println(gw);
        System.out.println(sw);
        System.out.println(baiw);
        System.out.println(qianw);

    }
}
