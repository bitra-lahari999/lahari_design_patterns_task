package BehavioralPattern.TemplateDesignPattern;

public class BuildWoodenHouse extends HouseBuilding {
    @Override
    public void buildFoundation() {
        System.out.println("Bulding Wooden Foundation to the house");
    }

    @Override
    public void buildPillars() {
    System.out.println("Building Wooden pillars to the house");
    }
    @Override
    public void buildWalls() {
        System.out.println("Building Wooden walls to the house");
    }


}
