package com.test3;

import java.util.Locale;
import java.util.Scanner;

public class SprintDome4 {
    public static void main(String[] args) {
        //金额数值转换。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入具体得金额：");
        String price = sc.next();
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        //定义一个中文数字数组
        String[] chine = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        for (int i = 0; i < price.length(); i++) {
            char str1 = price.charAt(i);
            str.append(chine[str1 - 48]);
        }
        System.out.println(str.toString());
        if (str.length() < 7) {
            int num = 7 - str.length();
            for (int i = 0; i < num; i++) {
                str2.append("零");
            }
            str2.append(str);
        }
        System.out.println(str2);
        //未知问题
//        char[] arr = {' ','佰',' ','拾',' ','万',' ','仟',' ','佰',' ','拾',' ','元'};
//        for (int i = 0; i < str2.length(); i++) {
//            arr[i * 2] = str2.charAt(i);
//        }
//        System.out.println(arr);
    }
}
