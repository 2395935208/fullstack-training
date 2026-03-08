package oopInterface;

public class baskteBallCoatch extends Coatch{
    public baskteBallCoatch() {
    }

    public baskteBallCoatch(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}
