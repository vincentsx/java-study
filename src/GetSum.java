    //创建类 while循环
public class GetSum {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int x = 1;          //定义int型局部变量
        int sum = 0;
        while (x <= 10){
            sum = sum + x;
            x++;
        }
        System.out.println("sum = " + sum);
    }
}
/**
 * while循环语句也称条件判断语句
 * 当条件表达式的返回值为真时，则执行"{}"中的语句，当执行完"{}"中的语句后，重新判断条件表达式的返回值，
 * 直到表达式返回的结果为假时，退出循环。
 */