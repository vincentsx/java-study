    //创建类 逻辑运算符
public class Calculation {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        int number_1 = 3, number_2 = 4;
        boolean result_1 = ((number_1 > number_2) && (number_1 != number_2));
        boolean result_2 = ((number_2 > number_1) || (number_2 != number_1));
        System.out.println(result_1);
        System.out.println(result_2);
    }
}