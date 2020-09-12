    //创建类 continue
public class Continue {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
/**
 * 与break一样，continue也支持标签功能
 */