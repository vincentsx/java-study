    //创建类 隐式类型转换
public class Conver {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        byte mybyte = 127;
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.45646;
        System.out.println("byte型与int型数据进行运算的结果：" + (mybyte + myint));
        System.out.println("byte型与float型数据进行运算的结果：" + (mybyte + myfloat));
        System.out.println("byte型与char型数据进行运算的结果：" + (mybyte + mychar));
        System.out.println("char型与double型数据进行运算的结果：" + (mychar + mydouble));
    }
}