package String;
//获取指定索引位置的字符
/**
 * str.charAt(int index)
 * str:任意字符串
 * index:整型值，用于要返回字符的下标
 */
public class Ref {
    public static void main(String[] args) {
        String str = new String("we are students");
        char mychar = str.charAt(5);
        System.out.println("字符串str索引位置是5的字符为：" + mychar);
    }
}