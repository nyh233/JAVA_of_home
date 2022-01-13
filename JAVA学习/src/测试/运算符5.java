package 测试;

public class 运算符5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        //等于 ==
        System.out.println(a == b);     //false
        System.out.println(a == c);     //true
        System.out.println("-----------------------------------------------------------");

        //不等于 !=
        System.out.println(a != b);     //true
        System.out.println(a != c);     //false
        System.out.println("-----------------------------------------------------------");

        //大于 >
        System.out.println(a > b);      //false
        System.out.println(a > c);      //false
        System.out.println("-----------------------------------------------------------");

        //大于等于 >=
        System.out.println(a >= b);     //false
        System.out.println(a >= c);     //true
        System.out.println("-----------------------------------------------------------");

        //小于 <
        System.out.println(a < b);      //true
        System.out.println(a < c);      //false
        System.out.println("-----------------------------------------------------------");

        //小于等于 <=
        System.out.println(a <= b);     //true
        System.out.println(a <= c);     //true
        System.out.println("-----------------------------------------------------------");

        //注意：==是判断是否相等 =是附值的意思
        System.out.println(a == b);     //false
        System.out.println(a = b);     //20
    }
}
