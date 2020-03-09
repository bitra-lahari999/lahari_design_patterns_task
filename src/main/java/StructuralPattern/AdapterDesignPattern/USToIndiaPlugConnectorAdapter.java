package StructuralPattern.AdapterDesignPattern;

public class USToIndiaPlugConnectorAdapter implments IndiaPlugConnector{
   private USPlugConnector plug;

    public USToIndiaPlugConnectorAdapter(USPlugConnector plug) {
        this.plug = plug;
    }


    void giveElectricity() {
        plug.giveElectricity();
    }
}
