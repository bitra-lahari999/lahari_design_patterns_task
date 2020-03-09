package StructuralPattern.AdapterDesignPattern;

public class IndiaToUSPlugConnectorAdapter implements USPlugConnector {
    private IndiaPlugConnector plug;

    public IndiaToUSPlugConnectorAdapter(IndiaPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    void giveElectricity() {
        plug.giveElectricity();
    }

}
