package StructuralPattern.BridgeDesignPattern;

public class OnidaTV extends TV {
    OnidaTV(Remote r){
        super(r);
    }
    public void on(){
        System.out.println("Onida TV is on :");
        remote.on();
    }
    public  void off(){
        System.out.println("Onida TV is off :");
        remote.off();
    }

}
