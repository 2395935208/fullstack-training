package oopInterface;

public class pingPangPlayer extends Player implements speakEnglish{

    public pingPangPlayer() {
    }

    public pingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
