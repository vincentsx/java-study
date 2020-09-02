package array;
//复制数组
//导入类
import java.util.Arrays;
//创建类
public class Cope {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int newarr[] = Arrays.copyOf(arr, 11);
        for (int i : newarr) {
            System.out.print(i + " ");
        }
    }
}