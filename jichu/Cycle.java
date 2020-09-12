package jichu;
  //创建类 do...while循环语句
public class Cycle {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int a = 100;            //定义int型局部变量
        //while语句循环体
        while(a == 60){
            System.out.println("ok1");
            a--;
        }
        int b = 100;
        //do...while语句循环体
        do{
            System.out.println("ok2");
            //b--;
        }while(b == 60);        //如果条件为真，则继续循环
    }
}