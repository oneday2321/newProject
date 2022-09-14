package com.test3;

public class SprintDome6 {
    public static void main(String[] args) {
        //参数替换
        String task = "你好胖，该减肥了，不能再吃了！";
        task = task.replace("胖", "瘦");
        System.out.println(task);

        //替换词库
        String[] str = {"A", "B", "C", "D", "E", "F"};
        String ab = "ABCDEFGHILK";
        for (String s : str) {
            ab = ab.replace(s, "*");
        }
        System.out.println(ab);
    }
}
