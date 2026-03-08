package oopExtendsTest2;

public class Test {
    public static void main(String[] args) {
      Phone p=new Phone();
      p.setName("苹果");
      p.setPrice(1000);
      System.out.println(p.getName()+"价格是"+p.sumPrice());
      Pad p2=new Pad();
      p2.setName("华为");
      p2.setPrice(1000);
      System.out.println(p2.getName()+"价格是"+p2.sumPrice());
    }
}
