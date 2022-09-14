package com.test5;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        System.out.println(name);
        //添加
        name.add("aa");
        name.add("bb");
        name.add("cc");
        name.add("dd");
        System.out.println(name);

        //获取指定内容
        String s = name.get(2);
        System.out.println(s);

        //替换
        name.set(1,"pp");
        System.out.println(name);

        //获取大小
        int size = name.size();
        System.out.println(size);

        //删除指定内容
        name.remove(0);
        System.out.println(name);

        //获取大小
        int size1 = name.size();
        System.out.println(size1);

        //清空数据
        name.clear();
        System.out.println(name);

    }
}
