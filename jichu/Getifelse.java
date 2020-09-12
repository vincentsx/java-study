package jichu;
 //创建类 if...else if多分支语句
public class Getifelse {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int x = 20;
        if(x > 30){
            System.out.println("x的值大于30");
        }else if(x > 10){
            System.out.println("x的值大于10，但小于30");
        }else if(x > 0){
            System.out.println("x的值大于0，但小于10");
        }else{
            System.out.println("x的值小于0");
        }
    }
}
