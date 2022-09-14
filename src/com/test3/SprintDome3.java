package com.test3;

import java.util.Arrays;
import java.util.Scanner;

public class SprintDome3 {
    public static void main(String[] args) {
        /*
        遍历、统计、拼接、反转
        一：控制台输入字符串，并遍历打印所有
        二：控制台输入字符串，统计英文大小写、数字得出现次数
        三：定义一个数组，定义一个方法进行将数组拼接成字符串
        四：定义一个方法，控制台输入字符串，调用方法进行数据反转
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("************** 一 ****************");
        System.out.println("请输入一个字符串：进行遍历输出");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }

        System.out.println("************** 二 ****************");
        System.out.println("请输入一个字符串：进行统计个数");
        String str1 = sc.next();
        int big = 0,min = 0,num=0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) >= 'A' && str1.charAt(i)<= 'Z'){
                big++;
            }
            if(str1.charAt(i) >= 'a' && str1.charAt(i)<= 'z'){
                min++;
            }
            if(str1.charAt(i) >= '0' && str1.charAt(i)<= '9'){
                num++;
            }
        }
        System.out.println("大写："+big+",小写："+min+",数值："+num);

        System.out.println("************** 三 ****************");
        int[] arr = {1, 2, 3, 4, 5};
        String str2 = pinArr(arr);
        System.out.println(str2);

        System.out.println("************** 四 ****************");
        System.out.println("请输入一个字符串：进行反转输出");
        String str4 = sc.next();
        String s = fanStr(str4);
        System.out.println(s);

    }

    public static String pinArr(int[] arr) {
        StringBuilder rest = new StringBuilder("[");
        for (int j : arr) {
            if (j == arr.length) {
                rest.append(j);
            } else {
                rest.append(j).append(", ");
            }
        }
        rest.append("]");
        return rest.toString();
    }

    public static String fanStr(String arr){
        StringBuilder rest = new StringBuilder();
        for (int i = arr.length() -1; i >= 0; i--) {
            rest.append(arr.charAt(i));
        }
        return rest.toString();
    }
}
