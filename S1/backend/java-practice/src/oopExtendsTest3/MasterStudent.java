package oopExtendsTest3;

public class MasterStudent extends Student{
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    //重写学习方法


    @Override
    public void study() {
        System.out.println("研究生同学正在攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println("研究生同学到了豪华公寓");
    }
}
