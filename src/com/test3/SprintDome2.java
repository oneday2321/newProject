package com.test3;

public class SprintDome2 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = new String("abcd");

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        String s3 = new String("Abcd");

        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s3));

//        == 仅用户基本数据类型的数据对比，其余的进行对比的话，是无法得到true的执行结果的，涉及到了堆内存和栈内存的数据存放
//        常用数据对比的有两种  equals() 和 equalsIgnoreCase() 两种
//        其中equals() 和 equalsIgnoreCase() 的区别就是  equalsIgnoreCase() 忽略大小写

    }
}
