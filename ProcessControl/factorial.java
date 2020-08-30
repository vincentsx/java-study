// package ProcessControl;
// //导入包
// import java.util.Scanner;
// //创建类
// public class factorial {
//     //主方法 权限修饰符 静态修饰符 返回值修饰符
//     public static void main(String[] args) throws Exception {
//         int num;        //定义局部变量
//         System.out.println("请输入一个整数：");
//         Scanner input = new Scanner(System.in);
//         num = input.nextInt();
//         if((num&1) != 1){
//             System.out.println(+ num + "是偶数");
//         }else{
//             System.out.println(+ num + "是奇数");
//         }
//     }
// }


// package ProcessControl;
// //导入包
// import java.util.Scanner;
// //创建类
// public class factorial{
//     //主方法 权限修饰符 静态修饰符 返回值修饰符
//     public static void main(String[] args) throws Exception {
//         int num;        //定义局部变量
//         System.out.println("请输入一个大于1的奇数：");
//         Scanner input = new Scanner(System.in);
//         num = input.nextInt();
//         //绘制前 (num+1)/2 行
//         for (int i = 1; i <= (num+1)/2; i++){
//             //绘制空格
//             for (int j = 1; j <= (num+1)/2-i; j++){
//                 System.out.print(" ");
//             }
//             //绘制 *
//             for (int k = 1; k <= 2*i-1; k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");     //换行
//         }
//         //绘制后 (num-1)/2 行
//         for (int i = 1; i <= (num-1)/2; i++){
//             //绘制空格
//             for (int j = 1; j <= i; j++){
//                 System.out.print(" ");
//             }
//             //绘制 *
//             for (int k = num-2; k >= 2*i-1; k--){
//                 System.out.print("*");
//             }
//             System.out.print("\n");     //换行
//         }
//     }
// }


/**
 * 使用while循环语句计算1+1/2！+1/3！+1/4！+...+1/20！
 */
package ProcessControl;
//创建类
public class factorial{
    //主方法 权限修饰符 静态修饰符 返回值修饰符
    public static void main(String[] args) throws Exception {
        double sum = 1;
        int num = 2;
        while(num <= 20){
            int test = num;
            long temp = num;
            while(test > 1){
                test--;
                temp = temp*test;
            }
            sum += 1.0/temp;
            num++;
        }
        System.out.println("1 + 1/2! + 1/3! +...+ 1/20! = " + sum);
        //方法二
        // double sum = 0,a = 1;
        // int i = 1;
        // while(i <= 20){
        //     sum = sum+a;
        //     i = i+1;
        //     a = a*(1.0/i);
        // }
        // System.out.println(sum);
    }
}