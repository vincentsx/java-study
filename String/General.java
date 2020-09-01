package String;
//常规类型格式化
//创建类
public class General {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        String str_1 = String.format("%d", 400 / 2);
        String str_2 = String.format("%b", 3 > 5);
        String str_3 = String.format("%x", 200);
        System.out.println(str_1);
        System.out.println(str_2);
        System.out.println(str_3);
    }
}