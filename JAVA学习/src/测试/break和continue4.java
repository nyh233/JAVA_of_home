package 测试;

public class break和continue4 {
    public static void main(String[] args) {
        a: for (int a = 1; a <= 3; a++) {
            System.out.println("正在查找第"+ a +"个班级的学生");
            for (int b = 1; b <= 10; b++) {
                System.out.println("正在查找第"+ b +"个学生");
                if (a == 2 && b == 5) {
                    System.out.println("哈哈,找到了");
                    break a;
                }
            }
            System.out.println();
        }
    }
}
