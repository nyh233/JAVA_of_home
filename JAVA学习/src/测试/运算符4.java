package 测试;

public class 运算符4 {
    public static void main(String[] args) {
        //基本的附值运算符
        int a =10;      //把10附值给变量a
        System.out.println("a: " + a);
        System.out.println("——————————————————————————————————————————————————————————————————————————————");

        //扩展的
        a += 20;    //把左右两边的数据相加，再附值给左边
        System.out.println("a: " + a);
        System.out.println("——————————————————————————————————————————————————————————————————————————————");

        //扩展的好处
        short s = 2;
        //s = s + 1;    //报错    "s = s + 1" = "s += 1"
        s += 1;
        System.out.println("s:" + s);
    }
}
