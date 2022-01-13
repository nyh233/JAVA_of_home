package 测试;

public class 运算符2 {
    public static void main(String[] args) {
        int a = 10;
        char b = 'a';       //'a'=97
        System.out.println(a+b);

        System.out.println("Holle" + "World");      //"holleWorld"
        System.out.println("Holle" + 10);       //Holle10
        System.out.println("Holle" + 10 + 20);      //Holle1020
        System.out.println(10 + 20 + "Holle");      //30Holle
    }
}
