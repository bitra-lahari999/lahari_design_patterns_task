package BehavioralPattern.TemplateDesignPattern;

public abstract class HouseBuilding {
    final public void buildHouse{
        buildFoundation();
        buildPillars();
        buildWalls();
        attachWindows();
    }
    public void attachWindows()
    {
        System.out.println("attach windows to the house");
    }
    public abstract void buildFoundation();
    public abstract void buildPillars();
    public abstract void buildWalls();
}
