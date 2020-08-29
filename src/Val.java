    //创建类
public class Val {
    static int times = 3;       //定义成员变量times
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args){
        int times = 6;          //定义局部变量times
        System.out.println("times的值为：" + times);
    }
}
/***
 * 在类中所定义的变量被称为成员变量，成员变量在整个类中都有效，类的成员变量又称为静态变量和实例变量
 * class var{
 *  int x =45;
 *  static int y = 90;
 * }
 * 其中x为实例变量，y为静态变量（也称类变量）。静态变量的有效作用范围可以跨类，甚至可以达到整个应用程序之内。
 * 局部变量只在方法体中有效，成员变量在整个类体中都有效
 */