package 测试;

public class for循环3 {
    public static void main(String[] args) {
        int max = 0;

        for (int a = 1; a <= 100; a++){
            if (a % 2 == 0)  {
                max += a;
            }
        }
        System.out.println("max :" + max);
    }
}
