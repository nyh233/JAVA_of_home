package 测试;

import java.util.Scanner;

public class if语句3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();

        int max;

        if(a >= b) {
            //说明a大
            max = a;
        }else {
            //说明b大
            max = b;
        }
        System.out.println("最大值是:" + max);
    }
}
