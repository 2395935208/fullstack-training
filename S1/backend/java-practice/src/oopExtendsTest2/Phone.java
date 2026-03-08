package oopExtendsTest2;

public class Phone extends SmartDevice {
    @Override
    public double sumPrice() {
        //原基础上再打九折
        return super.sumPrice()*0.9;
    }
}
