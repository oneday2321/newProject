package com.test3;

import java.util.Scanner;

public class SprintDome4_pro {
    public static void main(String[] args) {
        //金额数值转换。
        Scanner sc = new Scanner(System.in);
        int nums;
        String str = "";
        //键盘录入
        while (true) {
            System.out.print("请输入数字：");
            nums = sc.nextInt();
            if(nums >= 0 && nums <= 9999999){
                break;
            }else {
                System.out.println("金额输入无效");
            }
        }
        //取余取模
        do {
            int ge = nums % 10;
            str = chine(ge) + str;
            nums = nums / 10;
        } while (nums != 0);
        //位数补零
        int ling = 7 - str.length();
        if(ling != 0){
            for (int i = 0; i < ling; i++) {
                str = "零" + str;
            }
        }
        //单位插入
        String newStr = "";
        String[] chines = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < str.length(); i++) {
            newStr = newStr + str.charAt(i) + chines[i];
        }
        System.out.println(newStr);

    }

    //数值转换
    public static String chine(int num){
        String[] chine = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return chine[num];
    }
}
