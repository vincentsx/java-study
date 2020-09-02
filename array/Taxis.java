package array;
//对数组进行排序 Arrays.sort()
//导入类
import java.util.Arrays;
//创建类
public class Taxis {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}