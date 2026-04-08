package ArrayListTest;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        studentManger sm=new studentManger();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入功能：1.添加学生 2.删除学生 3.查找学生 4.打印列表 5.退出");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("请输入学生姓名，年龄和学号");
                    String name=sc.next();
                    int age=sc.nextInt();
                    String id=sc.next();
                    sm.addStudent(name,id,age);
                    break;
                case 2:
                    System.out.println("请输入要删除的学生学号");
                    String deleteId=sc.next();
                    sm.deleteStudent(deleteId);
                    break;
                case 3:
                    System.out.println("请输入要查找的学生的id");
                    String findId=sc.next();
                    sm.findStudent(findId);
                    break;
                case 4:
                    System.out.println("学生列表如下：");
                    sm.printStudent();
                    break;
                    case 5:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误！请重新输入");
                    break;
            }
        }
    }
}
