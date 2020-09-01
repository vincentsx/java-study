package array;
//填充索引指定数组元素
//导入类
import java.util.Arrays;
//创建类
public class Displace {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //输出原数组
        System.out.println("原数组：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        Arrays.fill(arr, 1, 3, 66);
        //输出索引填充后的数组
        System.out.println("索引填充后的数组：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}