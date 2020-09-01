package StringExercise;
//使用正则表达式判断手机号是否合法
//导入类
import java.util.Scanner;
//创建类
public class DeterminePhone {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        boolean result = false;
        do {
            //输入爪机号
            String PhoneNumber = new String("");
            System.out.print("请输入一个爪机号 :");
            Scanner PhoneNumberInput = new Scanner(System.in);
            PhoneNumber = PhoneNumberInput.next();
            //定义要匹配的爪机号的格式
            String regex = new String("(\\p{Digit}){11}");
            //判断爪机号是否合法
            if(PhoneNumber.matches(regex)) {
                //输出判断结果
                System.out.println("这是一个合法的爪机号！");
                result = true;
            }
            if(!PhoneNumber.matches(regex)) {
                //输出判断结果
                System.out.println("这是一个非法的手机号,请重新输入！");
                result = false;
            }
        }while(!result);
    }
}