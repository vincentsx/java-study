package array;
//遍历二维数组
//创建类
public class Tautog{
    public static void main(String[] args) throws Exception{
        //主方法 权限修饰符 静态修饰符 返回值修饰符
        int arr2[][] = {{4,3,9,44,3}, {7,1,21,87,6}, {1,45,76,22,7}};
        System.out.println("数组中的元素是：");
        int i = 0;
        //外层的循环变量为一维数组
        for (int x[] : arr2) {
            i++;        //外层计数器递增
            int j = 0;  //内层循环计数器
            //循环遍历每一个数组元素
            for (int e : x) {
                j++;    //内层计数器递增
                //判断变量是二维数组中的最后一个元素,arr2.length等于行数，x.length等于列数
                if (i == arr2.length && j == x.length) {
                    //输出二维数组中的最后一个元素
                    System.out.print(e);
                    //System.out.println(arr2.length);
                }else {
                    //如果不是二维数组中的最后一个元素
                    System.out.print(e + "、");     //输出信息
                }
            }
        }
    }
}