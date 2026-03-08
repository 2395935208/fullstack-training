package oopInterface;

public class basketballPlayer extends Player{

    public basketballPlayer() {
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学习篮球");
    }
}
