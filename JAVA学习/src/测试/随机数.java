package 测试;

import java.util.Random;

public class 随机数 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            int a = r.nextInt(10);
            System.out.println(a);
        }
    }
}
