package oopPolymorphic;

public class Vehicle {
    //属性：品牌，行驶速度
    //行为：移动，响铃
    private String brand;
    private double speed;

    public Vehicle() {
    }

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //行为：移动，响铃
    public void move(){
        System.out.println(brand+"的交通工具"+"正在以"+speed+"的速度移动");
    }
}
