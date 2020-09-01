package StringExercise;
//字符串大小写转换
import java.util.Scanner;
//创建类
public class transform {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str_1 = new String("");
        System.out.print("请输入一段字符串:");
        Scanner input = new Scanner(System.in);
        str_1 = input.next();
        System.out.println("原字符串为:" + str_1);
        String str_2 = str_1.toUpperCase();     //转换为大写
        System.out.println("转换为大写后为:" + str_2);
        String str_3 = str_1.toLowerCase();     //转换为小写
        System.out.println("转换为小写后为:" + str_3);
    }
}