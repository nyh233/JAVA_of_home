package 测试;

public class dowhile循环2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("---------------");
        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++;
        }
        System.out.println("---------------");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        }while (b <= 5);
    }
}
