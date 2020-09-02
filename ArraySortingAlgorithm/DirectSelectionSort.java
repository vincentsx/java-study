/**
 * 直接选择排序算法
 * @author  Vincents
 * @url     https://vincents.top
 * @time    2020/09/02
 */
package ArraySortingAlgorithm;
//导入类
import java.util.Scanner;
//创建类
public class DirectSelectionSort {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        //输入数组
        System.out.print("请输入一个数组(数组元素以空格隔开):");
        Scanner str = new Scanner(System.in);
        String[] arrs = null;
        arrs = str.nextLine().split(" ");   //吸取字符，以回车键结束，并将字符按空格分割存入数组
        str.close();    //释放内存
        int arr[] = new int[arrs.length];   //新建整型变量数组，数组长度为arr.length
        //将输入的值赋值给arr[]并输出
        System.out.print("原数组为:");
        for (int i = 0; i < arrs.length; i++) {
            arr[i] = Integer.valueOf(arrs[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");     //换行
        //创建直接排序类的对象
        DirectSelectionSort sorter = new DirectSelectionSort();
        //调用排序对象的方法将数组排序
        sorter.directly(arr);
    }
    /**
     * 直接选择排序
     * @param arr
     * 要排序的数组
     */
    private void directly(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            index = 0;
            for (int j = 0; j <= arr.length-i; j++) {
                //假设arr[index]最小
                if(arr[index] < arr[j] ) {
                    index = j;
                }
            }
            //元素交换
            int temp = arr[arr.length-i];       //依次把末尾元素保存到临时变量值
            arr[arr.length-i] = arr[index];     //依次将最大的元素保存到末尾元素
            arr[index] = temp;                  //依次将末尾元素保存到最大的元素位置
        }
        showArray(arr);                         //输出排序后的数组元素
    }
    /**
     * 显示数组中的所有元素
     * @param arr
     * 要显示的元素
     */
    private void showArray(int[] arr) {
        System.out.print("排序后的数组:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");                 //换行
    }
}