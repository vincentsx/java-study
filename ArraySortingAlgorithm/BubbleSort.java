/**
 * 冒泡排序
 * @author  Vincents
 * @url     https://vincents.top
 * @time    2020/09/02
 */
package ArraySortingAlgorithm;
//导入类
import java.util.Scanner;
//创建类
public class BubbleSort {
    public static void main(String[] args) {
        //输入数组
        System.out.print("请输入一串数组，数组元素以空格隔开:");
        Scanner str = new Scanner(System.in);
        String[] arrs = null;
        /**
         * nextLine()吸取字符前后的空格/Tab键，回车键截止。
         * next()不会吸取字符前/后的空格/Tab键，只吸取字符，
         * 开始吸取字符（字符前后不算）直到遇到空格/Tab键/回车截止吸取。
         * split() 方法用于把一个字符串分割成字符串数组。
         */
        arrs = str.nextLine().split(" ");
        str.close();
        //length属性主要是针对数组的，length()属性则是针对字符串String的
        int arr[] =new int[arrs.length];
        //输出原数组
        System.out.print("原数组为:");
        for (int i = 0; i < arrs.length; i++){
            //valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等
            arr[i] = Integer.valueOf(arrs[i]);
            System.out.print(arr[i] + " ");
        }
        //换行
        System.out.print("\n");
        //创建冒泡排序类的对象
        BubbleSort sorter = new BubbleSort();
        sorter.bibblings(arr);
        // //输出数组的长度
        // System.out.println(arr.length);
    }
    /**
     * 冒泡排序
     * @param array 
     * 需要排序的数组
     */
    public void bibblings(int[] array) {
        //外层应该遍历(arr.length-1)次，否则数组就会溢出！！！
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]){
                    //如果array[j+1] < array[j],则它们互换位置
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        //输出排序后的数组
        System.out.print("数组按从小到大排列后:");
        showArray(array);
    }
    /**
     * 显示数组中的所有元素
     * @param array
     * 要显示的数组
     */
    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}