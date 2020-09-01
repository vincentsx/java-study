package String;
//格式化常见的日期时间组合
//导入类
import java.util.Date;
//创建类
public class DateAndTime {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        String time = String.format("%tc", date);
        String from = String.format("%tF", date);
        System.out.println("全部的时间信息是：" + time);
        System.out.println("年-月-日格式：" + from);
    }
}