package com.test3;

public class SprintDome1 {
    public static void main(String[] args) {
        //创建字符串的多种方式
        String s1 = "abcd";
        //基本不适用
        String s2 = new String("abcd");

        //应用场景：字符串不可被改变，则可以将字符串改为数组，然后修改数组中的数据，之后可以使用这种方式在重新变为字符串
        char[] chr = {'a','b','c','d'};
        String s3 = new String(chr);

        //应用场景：网路传输中都是字节信息，这种方式可以将字节信息转化为字符串易读
        byte[] bytes = {97,98,99,100};
        String s4 = new String(bytes);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
