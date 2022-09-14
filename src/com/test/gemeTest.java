package com.test;

public class gemeTest {
    public static void main(String[] args) {
        Role r1= new Role("乔峰",100);
        Role r2 = new Role("鸠摩智",100);
        while(true){ // 表示一直循环下去
            r1.gongji(r2);
            if(r2.getXue() == 0){
                System.out.println(r1.getName()+"K.O"+r2.getName());
                break;
            }

            r2.gongji(r1);
            if(r1.getXue() == 0){
                System.out.println(r2.getName()+"K.O"+r1.getName());
                break;
            }
        }
    }
}
