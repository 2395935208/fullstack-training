package oopExtendsTest1;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="张三";
        s.age=18;
        s.school="清华大学";
        System.out.println("姓名："+s.name+"  年龄："+s.age+"  学校："+s.school);
        s.study();
        Teacher t=new Teacher();
        t.name="李四";
        t.age=20;
        t.subject="语文";
        System.out.println("姓名："+t.name+"  年龄："+t.age+"  科目："+t.subject);
        t.teach();
    }
}
