package com.test5;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Phono> name = new ArrayList<>();
        Phono ph1 = new Phono("小米",1000);
        Phono ph2 = new Phono("苹果",8000);
        Phono ph3 = new Phono("锤子",2999);
        name.add(ph1);
        name.add(ph2);
        name.add(ph3);
        ArrayList<Phono> phonoList = minPhono(name);
        for (int i = 0; i < phonoList.size(); i++) {
            Phono phono = phonoList.get(i);
            System.out.println(phono.getName()+", "+phono.getPrice());
        }
    }
    public static ArrayList<Phono> minPhono(ArrayList<Phono> name){
        ArrayList<Phono> name1 = new ArrayList<>();
        for (int i = 0; i < name.size(); i++) {
            Phono ph = name.get(i);
            if( ph.getPrice() < 3000){
                name1.add(ph);
            }
        }
        return name1;
    }
}
