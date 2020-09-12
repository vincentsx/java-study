package jichu;
   //创建类 switch多分支语句
public class GetSwitch {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String args[]) {
        int week = 2;       //定义int型局部变量
        switch(week){       //指定switch语句的表达式为变量week
            case 1:         //定义case语句中的常量为1
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            default:
            System.out.println("Sorry,I don't know.");
        }
    }
}