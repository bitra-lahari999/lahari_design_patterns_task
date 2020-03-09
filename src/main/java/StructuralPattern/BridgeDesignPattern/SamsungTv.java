package StructuralPattern.BridgeDesignPattern;


public class SamsungTv extends TV {

    SamsungTv(Remote r)
    {
        super(r);
    }
    public void on(){
        System.out.println("Samsung TV is on :");
        remote.on();
    }
    public  void off(){
        System.out.println("Samsung TV is off :");
        remote.off();
    }

}
