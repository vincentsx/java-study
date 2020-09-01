/**
 * 利用for循环打印菱形
 */
package ProcessControl;
import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) throws Exception {
        int num;
        System.out.println("请输入一个大于1的奇数");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i = 1; i <= (num+1)/2; i++) {
            for (int j = 1; j <= (num+1)/2-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= (num-1)/2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = num-2; k >= 2*i-1; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        input.close();
    }
}