package 选择排序;

/**
 * @author：dxh
 * @Description：
 * @Date：16:46-2018/12/19
 */
public class SelectionSort {


    //找出某数组的最小值
    public int findSmallest(int[] arr){
        int smallest = arr[0];      //存储最小值
        int smallestIndex = 0;      //存储最小值的索引
        for (int i=1 ;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest=arr[i];
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }


    //排序
    public void selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){   //外层循环控制索引  从0开始

            for (int j=i+1;j<arr.length;j++){

            }

        }
    }

}
