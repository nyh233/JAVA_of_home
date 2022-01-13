package 测试;

public class 运算符 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2 + 1;

        System.out.println(a + b);      //8
        System.out.println(a - b);      //2
        System.out.println(a / b);      //1(int没有小数点)
        System.out.println(a % b);      //2
        System.out.println(a * b);      //15
        System.out.println("--------------------------华丽的分割线--------------------------");

        System.out.println(5/4);        //1
        System.out.println(5.0/4);      //1.25
        System.out.println(5/4.0);      //1.25
    }
}
