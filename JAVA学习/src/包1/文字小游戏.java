package 包1;

import java.util.Scanner;

public class 文字小游戏 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        //火柴人回家
        System.out.println("你是一个火柴人，你要回家");
        System.out.println("你要走第一条路还是第二条路");
        System.out.println("输入1或2");
        int a = cs.nextInt();
        if(a != 1){
            System.out.println("你成功回到了家");
        }else {
            System.out.println("你来到了学校");
            System.out.println("有一条很臭的路和一条很长的路，不知道会遇到什么人");
            System.out.println("输入1或2");
            int b = cs.nextInt();
            if (b != 1){
                System.out.println("你走在路上,你突然被人捂住口鼻，杀害了(火柴人有口鼻吗???ヽ(≧Д≦)ノ)");
            }else {
                System.out.println("你几乎要被臭晕了,但你还是有惊无险的回到了家");
            }
        }
    }
}
