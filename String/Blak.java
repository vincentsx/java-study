package String;
//去除前后空格
public class Blak {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str = new String("    we are students ");
        String text = str.trim();
        System.out.println("字符串原来的长度：" + str.length());
        System.out.println("去除空格后的字符串" + text);
        System.out.println("去除空格后字符串的长度：" + str.trim().length());
    }
}