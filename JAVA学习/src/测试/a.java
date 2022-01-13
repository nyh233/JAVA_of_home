package 测试;

public class a {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        int c = a + b;
        System.out.println(c);
        System.out.println("---------------------------------------------------");

        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);
        int cc = aa + bb;
        System.out.println(cc);
        System.out.println("---------------------------------------------------");

        byte dd = (byte) (aa + bb);
        System.out.println(dd);
        System.out.println("---------------------------------------------------");

        double aaa = 10.24;
        int bbb = (int) (aaa);  //会损失精度
        System.out.println(bbb);



    }
}
