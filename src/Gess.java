    //创建类
public class Gess {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args){
        char word_1 = 'd', word_2 = '@';         //定义char型变量
        int p_1 = 23045, p_2 = 45213;           //定义int型变量
        System.out.println("d在unicode表中的顺序位置是：" + (int)word_1);
        System.out.println("@在unicode表中的顺序位置是：" + (int)word_2);
        System.out.println("unicode表中的第23045位是：" + (char)p_1);
        System.out.println("unicode表中的第45213位是：" + (char)p_2);
    }
}
/*
 * 字符类型（char）用于储存单个字符，占用16位（两个字节）的内存空间。在定义字符型变量时，要以单引号表示，
 * 如's'表示一个字符，而"s"则表示一个字符串。
 */