package StructuralPattern.AdapterDesignPattern;

public class USElecticalSocket {
    public void plugIn(USPlugConnector plug) {
        plug.giveElectricity();
    }
}
