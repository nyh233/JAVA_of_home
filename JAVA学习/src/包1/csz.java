package 包1;

import java.util.Random;
import java.util.Scanner;

public class csz {
    public static void main(String[] args) {
        System.out.println("猜数字");
        System.out.println("输入一个0 ~ 10的数");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(11);
        for (int i = 1; i <= 3; i++) {
            int b = sc.nextInt();
            if (b == a) {
                System.out.println("哇,你居然猜对了");
                break;
            }else if (b > a) {
                System.out.println("你猜大了");
            }else if (b < a) {
                System.out.println("你猜小了");
            }
        }
    }
}
