package BehavioralPattern.TemplateDesignPattern;

public class BuildConcreteHouse extends HouseBuilding {
    @Override
    public void buildFoundation() {
        System.out.println("Bulding Concrete Foundation to the house");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Concrete pillars to the house");
    }
    @Override
    public void buildWalls() {
        System.out.println("Building Concrete walls to the house");
    }

}
