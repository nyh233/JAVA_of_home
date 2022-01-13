//
package 测试;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");

        int i= sc.nextInt();
        System.out.println("请输入第二个整数");
        int o = sc.nextInt();

        System.out.println("和");
        System.out.println(i + o + ":i + o");
    }
}
