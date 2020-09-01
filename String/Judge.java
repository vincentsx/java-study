package String;
//使用正则表达式
//创建类
public class Judge {
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        //定义要匹配E-mall地址的正则表达式
        String regex = new String("\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}");
        String e_mall_1 = new String("we.students");
        String e_mall_2 = new String("fgasjhfgh@");
        String e_mall_3 = new String("wangjinwangji@outlook.com");
        if(e_mall_1.matches(regex)){
            System.out.println(e_mall_1 + "是一个合法的e-mall地址格式");
        }
        if(!e_mall_1.matches(regex)){
            System.out.println(e_mall_1 + "是一个非法的e-mall地址格式");
        }
        if(e_mall_2.matches(regex)){
            System.out.println(e_mall_2 + "是一个合法的e-mall地址格式");
        }
        if(!e_mall_2.matches(regex)){
            System.out.println(e_mall_2 + "是一个非法的e-mall地址格式");
        }
        if(e_mall_3.matches(regex)){
            System.out.println(e_mall_3 + "是一个合法的e-mall地址格式");
        }
        if(!e_mall_3.matches(regex)){
            System.out.println(e_mall_3 + "是一个非法的e-mall地址格式");
        }
    }
}