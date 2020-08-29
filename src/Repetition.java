    //创建类 foreach语句
public class Repetition {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int arr[] = {1, 2, 3, 4};
        System.out.println("数组arr[]中的元素分别为");
        for(int x : arr) {
            //foreach语句，int x引用的变量，arr指定要循环遍历的数组，最后将x输出
            System.out.println(x);
        }
    }
}