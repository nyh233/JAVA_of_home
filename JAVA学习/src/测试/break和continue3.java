package 测试;

public class break和continue3 {
    public static void main(String[] args) {
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <=5;) {
                System.out.println("正在获取第" + a + "个班级的第" + b + "个学生");
                if(b == 5) {
                    System.out.println();
                }
                b++;
            }
        }
    }
}
