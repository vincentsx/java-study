package String;
//时间格式化
//导入类
import java.util.Date;

//创建类
public class GetDate {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        String hour = String.format("%tH", date);
        String minute = String.format("%tM", date);
        String second = String.format("%tS", date);
        System.out.println("现在是" + hour + "时" + minute + "分" + second + "秒");
    }
}