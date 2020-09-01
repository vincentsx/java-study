package String;
//创建类
//字符串的大小写转换
public class UpAndLower {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str = new String("we are students");
        String text_1 = str.toLowerCase();      //转换为小写
        String text_2 = str.toUpperCase();      //转换为大写
        System.out.println("str转换为小写后为：" + text_1);
        System.out.println("str转换为大写后为：" + text_2);
    }
}