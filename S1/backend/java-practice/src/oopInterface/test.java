package oopInterface;

public class test {
    public static void main(String[] args){
        pingPangPlayer pp=new pingPangPlayer("马龙",20);
        System.out.println(pp.getName()+pp.getAge());
        pp.learn();
        pp.speak();

    }
}
