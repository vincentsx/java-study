package String;
/**
 * 字符串的分割
 * str.split(String Sign);   分割全部字符串
 * str.split(String Sign, int limit);   分割指定字符串
 */
//创建类
public class Division {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        String str = new String("192.163.8.999");
        int limit = 2;      //分割次数
        String[] text_1 = str.split("\\.");     //按照"."进行全部分割，使用转义字符"\\"
        String[] text_2 = str.split("\\.", limit);  //按照"."进行分割，分割limit次，使用转义字符"\\"
        //输出原子符
        System.out.println("str原值为: [" + str + "]");
        //输出全部分割的结果
        System.out.print("str全部分割的结果为:");
        for (String a : text_1) {
            System.out.print("[" + a +"]");
        }
        System.out.print("\n");     //换行
        //输出部分分割的结果
        System.out.print("str分割" + limit +"次的结果为:");
        for (String a : text_2) {
            System.out.print("[" + a + "]");
        }
        System.out.print("\n");     //换行
    }
}