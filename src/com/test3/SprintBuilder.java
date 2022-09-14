package com.test3;

public class SprintBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        添加
        sb.append("0123456");
        sb.append("abc");
//        插入
        sb.insert(3,'a');
//        删除指定下标参数
        sb.deleteCharAt(3);
//        获取长度
        int length = sb.length();
        System.out.println(length);
//        删除下标区间
        sb.delete(7,length);
//        数据反转
        sb.reverse();
//        转化字符串
        String s = sb.toString();
        System.out.println(s);
    }
}
