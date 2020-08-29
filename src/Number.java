    //创建类
public class Number {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        byte mybyte = 124;                                  //声明byte型变量并赋值  8位 -128~127
        short myshort =32564;                               //声明short型变量并赋值 16位-32768~32767
        int myint = 45784612;                               //声明int型变量并赋值   32位-2147483648~2147483647
        long mylong = 46789451;                             //声明long型变量并赋值  64位 8位=1个字节
        long result = mybyte + myshort + myint + mylong;    //获得各数相加的结果
        System.out.println("结果为：" + result);             //将以上变量相加的结果输出
    }
}
