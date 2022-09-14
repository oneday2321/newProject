package com.test6;

import java.util.ArrayList;
import java.util.Scanner;

public class functionTest1 {
    public static void main(String[] args) {
        language();
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrList = new ArrayList<>();
        boolean isGoOn = true;
        while (true) {
            System.out.print("请输入您的选择：");
            String next = sc.next();
            switch (next){
                case "1":
                    String luru = luRu(arrList);
                    if(luru.equals("0")){
                        System.out.println("继续录入");
                        String s = luRu(arrList);
                    }else if(luru.equals("1")){
                        System.out.println("返回菜单");
                        language();
                        continue;
                    }else if(luru.equals("2")){
                        System.out.println("退出系统");
                    }

                case "2":
                    System.out.println("删除");
                    break;
                case "3":
                    System.out.println("修改");
                    break;
                case "4":
                    System.out.println("查询");
                    break;
                case "5":
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("无效");
                    break;
            }
        }
    }
    public static String insertStudent(ArrayList<Student> arrList,String id, String name, int age, String address){
        String isGoon;
        Scanner sc = new Scanner(System.in);
        if(arrList.size() == 0){
            Student student = new Student(id, name, age, address);
            arrList.add(student);
            System.out.println("学生添加成功，是否继续？ 0：继续录入 1：返回菜单 2：退出系统");
            isGoon = sc.next();
            return isGoon;
        }else {
            for (int i = 0; i < arrList.size(); i++) {
                Student student = arrList.get(i);
                if(id.equals(student.getId())){
                    System.out.println("输入的学生id已存在，是否继续录入？ 0：继续录入 1：返回菜单 2：退出系统 ");
                    isGoon = sc.next();
                    return isGoon;
                }
            }
            Student student1 = new Student(id, name, age, address);
            arrList.add(student1);
            System.out.println("学生添加成功，是否继续？ 0：继续录入 1：返回菜单 2：退出系统");
            isGoon = sc.next();
            return isGoon;
        }
    }

    public static void deleteStudent(){}

    public static void updateStudent(){}

    public static void selectStudent(){}

    public static void language(){
        System.out.println("----------欢迎使用学生系统！---------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出系统");
    }

    public static String luRu(ArrayList<Student> arrList){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生id：");
        String id = sc.next();
        System.out.print("请输入学生姓名：");
        String username = sc.next();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.print("请输入学生家庭住址：");
        String address = sc.next();
        return insertStudent(arrList, id, username, age, address);
    }




    public static Student luRU1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生id：");
        String id = sc.next();
        System.out.print("请输入学生姓名：");
        String username = sc.next();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.print("请输入学生家庭住址：");
        String address = sc.next();
        return  new Student(id, username, age, address);
    }
















}
