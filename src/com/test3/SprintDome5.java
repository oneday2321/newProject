package com.test3;

public class SprintDome5 {
    public static void main(String[] args) {
        //字符截取
        String str = "18310992321";
        String str1 = str.substring(0, 3);
        String str2 = str.substring(7);
        System.out.println(str1+"****"+str2);


        String ren = "410823202001011213";
        String year = ren.substring(6, 10);
        String month = ren.substring(10, 12);
        String day = ren.substring(12, 14);
        System.out.println("个人信息：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        char six = ren.charAt(16);
        int sixs = six - 48;
        if(sixs % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }


    }
}
