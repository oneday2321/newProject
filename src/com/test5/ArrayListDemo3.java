package com.test5;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student student1 = new Student("001","zhangsan","123456");
        Student student2 = new Student("002","lisi","123456");
        Student student3 = new Student("003","wangwu","123456");
        arr.add(student1);
        arr.add(student2);
        arr.add(student3);
        boolean cun = cun(arr, "002");
        if(cun){
            System.out.println("存在");
        }else {
            System.out.println("-1");
        }
    }
    public static boolean cun(ArrayList<Student> arr,String id){
        for (Student student : arr) {
            String id1 = student.getId();
            if (id1.equals(id)) {
                return true;
            }
        }
        return false;
    }


}
