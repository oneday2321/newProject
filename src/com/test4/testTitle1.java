package com.test4;

import java.util.Scanner;
import java.util.StringJoiner;

public class testTitle1 {
    public static void main(String[] args) {
        //键盘录入====字符串
        Scanner sc = new Scanner(System.in);
        double i;
        int a;
        //录入的数据格式判断 1、长度小于等于9；2、格式为数字
        while (true) {
            System.out.println("请输入一个数字：");
            i = sc.nextDouble();
            if( i >= 0 && i <= 999999999 ){
                break;
            }else {
                System.out.println("输入数值不合法");
            }
        }
        //数值取余取整
        StringBuilder sb = new StringBuilder();
//        StringJoiner sj = new StringJoiner();
        while (true) {
            a = (int)i % 10;
            sb.append(huan(a));
            int i1 = (int) i / 10;
            i = i1;
            if(i1 == 0){
                break;
            }
        }
        sb.reverse();
        System.out.println(sb);
    }

    public static String huan(int a){
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ",};
        return arr[a];
    }
}
