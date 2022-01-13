package 测试;

public class for循环2 {
    public static void main(String[] args) {
        int max = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + 1);
            max = max + i;
        }
        System.out.println("-------------------------------");

        System.out.println(max);

    }

}
