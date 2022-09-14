package com.test6;

import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isGo:while (true) {
            System.out.print("请输入账户：");
            String username = sc.next();
            //判断长度
            if(username.length() >=3 && username.length() <= 15){
                int isys = 0;
                //判断是否字母和数字
                for (int i = 0; i < username.length(); i++) {
                    char c = username.charAt(i);
                    if((c <= '9' && c >= '0') || (c <= 'z' && c >= 'a') || (c >= 'A' && c <= 'Z')){
                        continue;
                    }else {
                        isys = 1;
                    }
                }
                if(isys == 0){
                    System.out.println(username);
                }else {
                    System.out.println("输入错误！");
                }
            }
        }
    }
}
