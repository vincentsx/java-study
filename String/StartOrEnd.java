package String;
//判断字符串的开始与结尾
public class StartOrEnd {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str_1 = "123456789735";
        String str_2 = "739572375682";
        boolean b_1 = str_1.startsWith("123");
        boolean b_2 = str_2.startsWith("739");
        boolean b_3 = str_1.endsWith("737");
        boolean b_4 = str_2.endsWith("682");
        System.out.println("字符串str_1是以123开始的吗？" + b_1);
        System.out.println("字符串str_2是以739开始的吗？" + b_2);
        System.out.println("字符串str_1是以735结尾的吗？" + b_3);
        System.out.println("字符串str_2是以682结尾的吗？" + b_4);
    }
}