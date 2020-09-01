package String;
/**
 * 格式化字符串
 * String类的静态format()方法用于创建格式化的字符串，format()有两种重载形式。
 * （1）
 * format(String format, Object... args)
 * 该方法使用指定的格式字符串，返回一个格式化字符串，格式化的新字符串使用本地默认的语言环境。语法如下：
 * format(String format, Object... args);
 * format:格式字符串
 * args:格式字符串中由格式说明符引用的参数，如果还有格式说明符以外的参数，则忽略这些额外的参数，
 * 此参数的数目是可变的，可以为0
 * （2）
 * format(Local 1, String format, Object... args);
 * 1:格式化过程中要应用的语言环境，如果1为null，则不进行本地化。
 * format:格式字符串
 * args:格式字符串中由格式说明符引用的参数，如果还有格式说明符以外的参数，则忽略这些额外的参数，
 * 此参数的数目是可变的，可以为0
 * 
 * 日期格式化
 * Date date = new Date();      //创建Date对象date
 * String s = String.format("%te", date); //通过format()方法对date进行格式化
 * %te 一月中的某一天
 * %tY 4位年份
 * %tm 月份
 */

 //导入java.util.Date类
import java.util.Date;
//创建类
public class Eval {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        Date date = new Date();                     //创建Date对象date
        String year = String.format("%tY", date);   //4位年份
        String month = String.format("%tB", date);  //月份
        String day = String.format("%te", date);    //当前月份的天数
        System.out.println("今年是：" + year + "年");
        System.out.println("现在是：" + month);
        System.out.println("今天是：" + day + "号");
    }
}