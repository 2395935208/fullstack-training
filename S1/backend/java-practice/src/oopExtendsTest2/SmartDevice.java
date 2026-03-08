package oopExtendsTest2;

public class SmartDevice {
    //属性
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("价格不能为负数");
            return;
        }else{
            this.price = price;
        }
    }

    public SmartDevice() {
    }

    public SmartDevice(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //行为:打折
    public double sumPrice(){
        //0-1000不打折
        if(price>=0&&price<1000){
            return price;
        }else if(price>=1000&&price<5000){
            return price*0.9;
        }else if(price>=5000&&price<10000){
            return price*0.8;
        }else{
            return price*0.7;
        }
    }
}
