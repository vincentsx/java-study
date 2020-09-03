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
        Scanner str = new Scanner(System.in);
        String[] arrs = null;
        arrs = str.nextLine().split(" ");
        int arr[] = new int[arrs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(arrs[i]);
        }
        //显示原数组
    }
    /**
     * 显示数组中的元素
     * @param arr
     * 要显示的数组
     */
    public static void showArray(String arr) {
        //
    }
}