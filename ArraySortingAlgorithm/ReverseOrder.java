/**
 * 反转排序
 * @author  Vincents
 * @url     https://vincents.top
 * @time    2020/09/03
 */

package ArraySortingAlgorithm;
//导入类
import java.util.Scanner;
//创建类
public class ReverseOrder {
    private static ReverseOrder sorter;

    // 主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        //输入数组
        System.out.print("请输入一个数组(数组元素以空格隔开):");
        Scanner str = new Scanner(System.in);
        String[] arrs = null;
        arrs = str.nextLine().split(" ");   //吸取字符，以回车键结束，并按空格分割存入aars[];
        str.close();                        //释放内存
        //赋值并输出原数组
        System.out.print("原数组为:");
        int arr[] = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            arr[i] = Integer.valueOf(arrs[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");             //换行
        //创建反转排序类的对象
        ReverseOrder.sorter = new ReverseOrder();
        //调用排序对象的方法
        sorter.sort(arr);
        //输出排序后的数组
        System.out.print("排序后的数组为:");
        showArray(arr);
    }

    /**
     * 反转排序
     * 
     * @param arr 要排序的数组
     */
    private void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    /**
     * 显示数组中所有元素
     * 
     * @param array 要显示的数组
     */
    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\n");                 //换行
    }
}