package 测试;

public class while循环2 {
    public static void main(String[] args) {
        int max = 0;
        int i = 1;
        while (i <= 100) {
            max += i;
            i++;
        }
        System.out.println("max =" + max);
    }
}
