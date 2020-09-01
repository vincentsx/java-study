package array;
//填充替换数组元素
//导入类
import java.util.Arrays;
//创建类
public class Swap {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Arrays.fill(arr, 8);
        for (int i : arr) {
                System.out.print(i + " ");
        }
        // for(int i = 0; i < 5; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}