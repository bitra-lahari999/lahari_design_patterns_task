package StructuralPattern.BridgeDesignPattern;

public class TV {
    Remote remote;
    Tv(Remote r)
    {
        this.remote=r;
    }
   public abstract void on();
   public abstract void off();

}
