package 测试;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import sun.font.TrueTypeFont;

public class 运算符6 {
    public static void main(String[] args) {
        //案例：韦小宝找媳妇

        //一开始眼光比较高，要求既要长得好看，还要身材好
        //前面的true是好看,false是长得不好看
        //后边的true是身材好,false是不好
        System.out.println(true && true);       //true
        System.out.println(true && false);      //false
        System.out.println(false && true);      //false
        System.out.println(false && false);     //false
        System.out.println("-----------------------------------");

        //不好找，只要1呀
        System.out.println(true || true);       //true
        System.out.println(true || false);      //true
        System.out.println(false || true);      //true
        System.out.println(false || false);     //false
        System.out.println("-----------------------------------");

        //true=女 false=男
        System.out.println(!true);       //false
        System.out.println(!false);      //true
        System.out.println("-----------------------------------");

        System.out.println(!!!!!!!true);        //false



    }
}
