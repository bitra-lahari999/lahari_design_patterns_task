package BehavioralPattern.ObserverDesignPattern;

public class Manager implements Observer{

    public Manager(Developer developer) {
        this.developer = developer;
        this.developer.attach(this);
    }

    @Override
    public void update() {
        if(this.developer.getState().equalsIgnoreCase("Successful")) {
            System.out.println("Manager is satisfied with developer.");
        } else {
            System.out.println("Manager is no satisfied with Developer.");
        }
    }
}