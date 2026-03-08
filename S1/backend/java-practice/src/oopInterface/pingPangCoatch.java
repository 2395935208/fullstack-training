package oopInterface;

public class pingPangCoatch extends Coatch implements speakEnglish{

    public pingPangCoatch() {
    }

    public pingPangCoatch(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
