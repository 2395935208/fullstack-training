package oopExtendsTest3;

public class BachelorStudent extends Student{
    //构造方法

    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    //重写学习方法

    @Override
    public void study() {
        System.out.println("本科生同学正在攻读学士学位");
    }
}
