package String;
//比较两个字符串
public class Opinion {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str_1 = new String("ABC");
        String str_2 = new String("abc");
        String str_3 = new String("ABC");
        //区分大小写比较
        boolean b_1 = str_1.equals(str_2);
        //不区分大小写比较
        boolean b_2 = str_2.equalsIgnoreCase(str_3);
        //输出比较结果
        System.out.println("str_1与str_2是否相等（区分大小写）？：" + b_1);
        System.out.println("str_2与str_3是否相等（不区分大小写）？：" + b_2);
    }
}