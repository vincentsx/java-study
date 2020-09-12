package jichu;
  //创建类
public class Part {
    //声明常量，此时若不对常量赋值，则会出现错误提示
    static final double PI = 3.1415;
    static int age = 22;
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args){
        final int NUMBER;       //声明int型常量
        NUMBER = 1245;          //常量赋值
        age = 23;               //再次对变量进行赋值
        //NUMBER = 1234         //错误的代码，因为NUMBER是常量，只能进行一次赋值
        System.out.println("常量PI的值：" + PI);
        System.out.println("赋值后NUMBER的值为：" + NUMBER);
        System.out.println("int型变量age的值为：" + age);
    }
    
}