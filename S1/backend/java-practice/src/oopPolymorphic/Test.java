package oopPolymorphic;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("张三",20,"男");
        System.out.println(p.getName()+" "+p.getAge()+" "+p.getSex());
        Vehicle v=new Car("宝马",200);
        p.driver(v);
    }
}
