package StringExercise;
//截取字符串并比较
//导入类
import java.util.Scanner;
//创建类
public class Interception{
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        //创建两个空字符串
        String str_1 = new String("");
        String str_2 = new String("");
        //输入字符串1
        System.out.print("请输入字符串1:");
        Scanner input_str_1 = new Scanner(System.in);
        str_1 = input_str_1.next();
        //输入字符串2
        System.out.print("请输入字符串2:");
        Scanner input_str_2 = new Scanner(System.in);
        str_2 = input_str_2.next();
        //截取字符串1
        String BrokenStr_1 = str_1.substring(1,3);
        //截取字符串2
        String BrokenStr_2 = str_2.substring(1,3);
        //比较字符串
        boolean results = BrokenStr_1.equals(BrokenStr_2);
        //输出比较结果
        System.out.println(BrokenStr_1 + "与" + BrokenStr_2 + "是否相等？(区分大小写)  " + results);
    }
}