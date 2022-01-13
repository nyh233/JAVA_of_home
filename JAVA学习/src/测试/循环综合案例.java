package 测试;

public class 循环综合案例 {
    public static void main(String[] args) {
        int a1 = 0;
        a: for (int a = 1; a <= 3; a++) {
            for (int b = 1; b < 35; b++) {
                if(b % 5 == 0) {
                    continue;
                }
                System.out.println("正在发橘子给" + a + "班级的" + b + "号同学");
                a1++;
                if(a1 >= 100) {
                    System.out.println("橙子发完了");
                    break a;
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("总共发了"+ a1 +"个橘子");
    }
}
