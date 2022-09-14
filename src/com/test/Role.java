package com.test;

import java.util.Random;

public class Role {
    private String name;
    private int xue;

    public Role(String name, int xue) {
        this.name = name;
        this.xue = xue;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXue() {
        return xue;
    }

    public void setXue(int xue) {
        this.xue = xue;
    }
    //定义操作
    public void gongji(Role le){  //  ????
        //定义一个随机数,20以内
        Random random = new Random();
        int shengyu = random.nextInt(20) + 1;   // 括号内是截至范围 0到20 小于20
        //然后对象1 攻击 对象2，对象2 掉血
        int shengyuxue = le.getXue() - shengyu;
        //判断最后血量是否小于o
        if(shengyuxue <= 0){
            shengyuxue = 0;
        }
        le.setXue(shengyuxue);

        System.out.println( this.getName() +"打了"+ le.getName() +"一拳，带走了"+ shengyu + "点血，"+le.getName()+"还剩余"+shengyuxue+"点血");


    }
}
