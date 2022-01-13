package 测试;

public class 运算符3 {
    public static void main(String[] args) {
        int a = 5;

       /* //a++;
        ++a;
        System.out.println("a:" + a);*/

       /* int b = a++;  //后自增
        System.out.println("a:" + a);       //6
        System.out.println("a:" + b);       //5   */

        int b = ++a;     //先自增
        System.out.println("a:" + a);       //6
        System.out.println("a:" + b);       //6
    }
}
