package String;
//获取子字符串
public class Subs {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str = new String("we are students");
        String text = str.substring(1,9);
        System.out.println("截取后的字符串text：" + text);
    }
}