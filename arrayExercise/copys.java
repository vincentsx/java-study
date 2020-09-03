/**
 * 创建数组arr1和arr2，将数组arr1中索引位置是0~3中的元素复制到数组arr2中
 * 最后将数组arr1和arr2中的元素输出
 */

package arrayExercise;
//导入类
import java.util.Arrays;
//创建类
public class copys {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2, 3, 4,5,6};
        int arr2[] = Arrays.copyOf(arr1, 3);
        System.out.print("数组arr1[] = ");
        showArray(arr1);
        System.out.print("数组arr2[] = ");
        showArray(arr2);
    }
    /**
     * 显示数组中的元素
     * @param arr
     * 要显示的数组
     */
    public static void showArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");     //换行
    }
}