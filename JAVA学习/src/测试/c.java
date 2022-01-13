package 测试;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个1~7的整数");

        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("今天是星期一");
        } else if (a == 2) {
            System.out.println("今天是星期二");
        } else if (a == 3) {
            System.out.println("今天是星期三");
        } else if (a == 4) {
            System.out.println("今天是星期四");
        } else if (a == 5) {
            System.out.println("今天是星期五");
        } else if (a == 6) {
            System.out.println("今天是星期六");
        } else if (a == 7) {
            System.out.println("今天是星期日");
        } else if (a != 7) {
            System.out.println("你怕是一个连小学都没有上过的hmp喔");
        }
    }
}