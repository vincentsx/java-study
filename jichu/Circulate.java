package jichu;
  //创建类 for循环语句
public class Circulate {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2){
            sum = sum + i;
        }
        System.out.println("2到100之间所有偶数之和为：" + sum);
    }
}
/**
 * 在编程时，有时会使用for循环的特殊语法格式来实现无限循环。
 * for(;;)
 * {
 * ...
 * }
 * 对于这种循环，可以通过break语句跳出循环。
 */