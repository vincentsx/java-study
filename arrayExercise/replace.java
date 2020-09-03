/**
 * 将数组arr中索引位置是2的元素替换为"bb"，并将替换前数组中的元素和替换后数组中的元素全部输出
 */
package arrayExercise;
//导入类
import java.util.Scanner;
import java.util.Arrays;
//创建类
public class replace {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        //输入数组
        System.out.print("请输入一个人字符串数组(数组元素用空格间隔):");
        Scanner str = new Scanner(System.in);
        String[] arr = null;
        arr = str.nextLine().split(" ");        //吸取字符，以回车键结束，以空格分割字符并存入数组
        //输出原数组
        System.out.print("原数组为:");
        showArray(arr);
    }

    /**
     * 输出数组元素
     * @param arr
     * 要显示的数组
     */
    private static void showArray(String[] arr) {
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}