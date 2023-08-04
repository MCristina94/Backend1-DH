package imple1;

public enum TipoComputadoraEnum {
    MAC(16, 500), WINDOWS(2,128);

    private int ramPorDefecto;
    private int discoDuroDefecto;

    TipoComputadoraEnum(int ramPorDefecto, int discoDuroDefecto){
        this.discoDuroDefecto = discoDuroDefecto;
        this.ramPorDefecto = ramPorDefecto;
    }

    public int getRamPorDefecto() {
        return ramPorDefecto;
    }

    public void setRamPorDefecto(int ramPorDefecto) {
        this.ramPorDefecto = ramPorDefecto;
    }

    public int getDiscoDuroDefecto() {
        return discoDuroDefecto;
    }

    public void setDiscoDuroDefecto(int discoDuroDefecto) {
        this.discoDuroDefecto = discoDuroDefecto;
    }
}
