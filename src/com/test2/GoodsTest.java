package com.test2;

public class GoodsTest {
    public static void main(String[] args) {
        //创建对象数组
        Goods[] good = new Goods[3];
        //创建三个对象
        Goods g1 = new Goods("001","华为",5999.0,100);
        Goods g2 = new Goods("002","小米",3999.0,80);
        Goods g3 = new Goods("003","oppo",1999.0,10);
        //将对象存储至数组中
        good[0] = g1;
        good[1] = g2;
        good[2] = g3;

        for (int i = 0; i < good.length; i++) {
            Goods goods = good[i];
            System.out.println(goods.getId()+" "+goods.getName()+" "+goods.getPrice()+" "+goods.getCount());
        }


    }
}
