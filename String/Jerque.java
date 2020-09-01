package String;
//字符串生成器
//创建类
public class Jerque {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        String str_1 = new String("");
        //定义字符串操作起始时间
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str_1 += i;
        }
        //定义字符串操作结束时间
        long endtime = System.currentTimeMillis();
        System.out.println("String消耗时间：" + (endtime - starttime));
        StringBuilder str_2 = new StringBuilder("");
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str_2.append(i);
        }
        endtime = System.currentTimeMillis();
        System.out.println("StringBuilder消耗的时间：" + (endtime - starttime));
    }
}