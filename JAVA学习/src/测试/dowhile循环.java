package 测试;

public class dowhile循环 {
    public static void main(String[] args) {
        int count = 1;
        boolean isOK = false;
        do {
            System.out.println("已练习" + count + "次");
            if (count >= 3) {
                isOK = true;
            }else {
                count++;
            }
        } while (!isOK);
        System.out.println("已学会");
    }
}
