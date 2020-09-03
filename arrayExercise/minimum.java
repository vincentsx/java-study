/**
 * 将数组中最小的数输出
 */

package arrayExercise;
//导入类
import java.util.Arrays;
import java.util.Scanner;
//创建类
public class minimum {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        //输入数组
        System.out.print("请输入一个数组(数组元素以空格间隔):");
        Scanner str = new Scanner(System.in);
        String[] arrs = null;
        arrs = str.nextLine().split(" ");
        int arr[] = new int[arrs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(arrs[i]);
        }
        //输出原数组
        System.out.print("原数组是:");
        showArray(arr);
        //按从小到大排序
        Arrays.sort(arr);
        //输出最小的元素
        System.out.println("数组arr中最小的元素是:" + arr[0]);
    }
    
    /**
     * 显示数组中的元素
     * 
     * @param arrs 要显示的数组
     */
    public static void showArray(int[] arrs) {
        for (int i : arrs) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}