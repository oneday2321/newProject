package com.test4;

import java.util.Scanner;

public class testTitle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个字符串：");
        String str1 = sc.next();
        System.out.print("请输入第二个字符串：");
        String str2= sc.next();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        if(str1.length() == str2.length()){
            Boolean eq1 = eq(sb1, sb2);
            if (eq1){
                System.out.println("输入的字符串str1和str2匹配");
            }else {
                System.out.println("输入的字符串str1和str2不匹配");
            }
        }else {
            System.out.println("输入的字符串str1和str2不匹配");
        }
    }
    public static Boolean eq(StringBuilder sb1,StringBuilder sb2){
        String s2 = sb2.toString();
        for (int i = 0; i < sb1.length()-1; i++) {
            String s1 = sb1.toString();
            if(s1.equals(s2)){
                return true;
            }
            sb1.append(sb1.charAt(0));
            sb1.deleteCharAt(0);
        }
        return false;
    }
}
