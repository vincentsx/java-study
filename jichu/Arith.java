package jichu;
 //创建类
public class Arith {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static final void main(String[] args) throws Exception {
        float number_1 = 45.56f;      //定义float型局部变量并赋值
        int number_2 = 152;          //定义int型局部变量并赋值
        System.out.println("和为：" + (number_1 + number_2));
        System.out.println("差为：" + (number_2 - number_1));
        System.out.println("积为：" + (number_1 * number_2));
        System.out.println("商为：" + (number_1 / number_2));
    }
}
/**
 * 自增自减运算符
 * ++a 表示在使用变量a之前，先使a的值加1
 * a++ 表示在使用变量a之后，使a的值加1
 * 若a = 4
 * b = ++a 先将a的值加1，然后赋值给b，此时a的值为5，b的值为5
 * b = a++ 先将a的值赋值给b，再将a的值加1，此时a的值为5，b的值为4
 */