    //创建类 带有标签的break
public class LabelBreak {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        Loop:for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if(j == 4)
                    break Loop;
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}