package String;
//字符串替换
public class NewStr {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str = new String("we are students");
        String newstr = str.replace("s","A");
        System.out.println(newstr);
    }
}