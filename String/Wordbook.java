package String;
//按字典顺序比较两个字符串
/**
 * compareTo()方法为按字典顺序比较两个字符串，如果按字典顺序此String对象位于参数字符串之前，
 * 则结果为一个负数，反之则为正数。如果这两个字符串相等（区分大小写），则结果为0
 * 语法：str.compareTo(String otherstr)
 */
public class Wordbook {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str_1 = "a";
        String str_2 = "c";
        String str_3 = "a";
        System.out.println(str_1 + "compareTo" + str_2 + ":" + str_1.compareTo(str_2));
        System.out.println(str_2 + "compareTo" + str_1 + ":" + str_2.compareTo(str_1));
        System.out.println(str_1 + "compareTo" + str_3 + ":" + str_1.compareTo(str_3));
    }
}