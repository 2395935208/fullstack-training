package oopInnterClass;

public class test {
    public static void main(String[] args) {
/*
用匿名内部类来调用Swim
 */

        Swim s=new Swim(){
            @Override
            public void swim() {
                System.out.println("我正在游泳");
            }
        };

        goSwimming(s);
    }
    public static void goSwimming(Swim s){
        s.swim();
    }
}
