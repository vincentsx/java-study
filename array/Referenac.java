package array;
/**
 * 数组查询
 * binarySearch()方法提供多种重载形式，有两种参数类型
 * （1）
 * binarySearch(Object[],Object key);其语法如下：
 * binarySearch(Object[] a, Object key);
 * a：要搜索的数组
 * key：要搜索的值
 * 如果key包含在a中，则返回搜索值的索引，否则返回-1或“-”（插入点），插入点是搜索键将要插入数组的那一点，
 * 即第一个大于此键的元素索引
 * 
 * （2）
 * binarySearch(Object[] a, int fromIndex, int toIndex, Object key);
 * a:要进行检索的数组
 * fromIndex:指定范围的开始处索引（包含）
 * toIndex:指定范围的结束处索引（不包含）
 * key:要搜索的元素
 */
//导入类
import java.util.Arrays;
//创建类
public class Referenac {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{9,8,7,6,5,5,5,4,};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,4);
        System.out.println("4的索引位置是：" + index);
    }
}