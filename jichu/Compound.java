package jichu;
//创建类 复合语句
public class Compound {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        {
            int y = 40;
            System.out.println("y的值：" + y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println("b的值：" + b);
            }
        }
        String word = "hello";
        System.out.println(word);
    }
}
/**
 * 在使用复合语句时要注意，复合语句为局部变量创建了一个作用域，该作用域为程序的一部分，在该作用域中
 * 某个变量被创建并能够被使用。如果在某个变量的作用域外使用该变量，则会发生错误，例如：在本示例中，
 * 如果在复合语句外使用变量y、b、z将会出现错误，而变量x可在整个方法体中使用。
 */