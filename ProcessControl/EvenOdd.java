/**
 * 判断奇偶数
 */
package ProcessControl;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("请输入一个整数");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if((num & 1) != 1){     //偶数与1位与运算，结果不为1
            System.out.println(+ num + "是偶数");
        }else{
            System.out.println(+ num + "是奇数");
        }
    }
}