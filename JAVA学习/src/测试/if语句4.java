package 测试;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

public class if语句4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int a = sc.nextInt();

        if (a >= 90 && a <= 100) {
            System.out.println("你的成绩是皇帝等级");
        } else if (a >= 80 && a < 90) {
            System.out.println("你的成绩是宰相等级");
        } else if (a >= 70 && a < 80) {
            System.out.println("你的成绩是大臣等级");
        } else if (a >= 60 && a < 70) {
            System.out.println("你的成绩是县官等级");
        } else if (a >= 0 && a < 60) {
            System.out.println("你的成绩是草民等级");
        }
    }
}