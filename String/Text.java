package String;
//字符串查找
public class Text {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        String str = new String("we are students");
        //将空字符串在str中的索引位置赋值给变量size
        int size = str.lastIndexOf("");
        //索引字符a
        int temp = str.indexOf("a");
        //索引字符串tu
        int text = str.lastIndexOf("tu");
        //将变量size输出
        System.out.println("空字符串在字符串str中的索引位置是：" + size);
        //将字符串str的长度输出
        System.out.println("字符串str的长度是：" + str.length());
        //输出字符a首次出现的位置
        System.out.println("字符a在字符串str中首次出现的索引位置是：" + temp);
        //输出字符串tu最后一次出现的位置
        System.out.println("字符串tu在字符串str中最后一次出现的索引位置是：" + text);
    }
}

/**
 * 关于字符串查找
 * 
 * indexOf(String s)
 * 该方法用于返回参数字符串s在指定字符串中首次出现的索引位置，从左到右，如果没有检测到，返回值为-1
 * str.indexOf(substr)
 * str:任意字符串对象
 * substr:要搜索的字符串
 * 
 * lastIndexOf(String str)
 * 该方法用于返回指定字符串最后一次出现的索引位置，从右到左，如果没有检测到，返回值为-1
 * 如果lastIndexOf()方法中的参数是空字符串"""(注意没有空格)，则返回结果与调用length()相同
 */