package oopPolymorphic;

public class Bicycle extends Vehicle{
    public Bicycle() {
        super();
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的自行车正在以"+getSpeed()+"的速度移动");
    }

    public void ringBell(){
        System.out.println("给自行车打个铃");
    }

}
