package 测试;

import java.util.Scanner;

public class 方法2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个整数");
        int num2 = sc.nextInt();
        boolean is = compare(num1,num2);
        System.out.println(is);

    }

    public static boolean compare(int a,int b) {
        /**
         *  boolean c = (a == b);
         *         return c;
         */
        return a == b;
    }
}
