package 测试;

public class break和continue {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 15;i++) {
            System.out.println("已查到" + i + "号");
            if (i == 13) {
                System.out.println("已经找到了编号为"+ i + "的同学");
                break;
            }
        }

    }
}
