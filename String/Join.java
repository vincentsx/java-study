package String;
/**
 * String(char a[])
 * 用一个字符数组创建String对象，示例代码如下
 * char a[] = {'g','0','o','d'};
 * String s = new String(a);        它们等价于 String s = new String("good");
 */

/**
 * String(chara[],int offset,int length)
 * 提取字符数组a中的一部分创建一个字符串对象。参数offset表示开始截取字符串的位置，length表示截取字符串的长度
 * char a[] = {'s','t','u','d','e','n','t'};
 * String s = new String(a,2,4);    它们等价于 String s = new String("uden");
 */

 //连接多个字符串
 public class Join{
     public static void main(String[] args) {
         String s1 = new String("hello");
         String s2 = new String("world");
         String s = s1 + " " + s2;
         System.out.println(s);
     }
 }