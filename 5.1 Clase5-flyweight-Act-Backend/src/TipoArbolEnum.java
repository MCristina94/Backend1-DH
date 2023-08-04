public enum TipoArbolEnum {
    ORNAMENTALES(200,400, "verde"), FRUTALES(500, 300, "rojo"), FLORALES(100,200, "celeste");

    private int altoDefecto;
    private int anchoDefecto;
    private String colorDefecto;

    TipoArbolEnum(int altoDefecto, int anchoDefecto, String colorDefecto){
        this.altoDefecto = altoDefecto;
        this.anchoDefecto = anchoDefecto;
        this.colorDefecto = colorDefecto;

    }

    public int getAltoDefecto() {
        return altoDefecto;
    }

    public void setAltoDefecto(int altoDefecto) {
        this.altoDefecto = altoDefecto;
    }

    public int getAnchoDefecto() {
        return anchoDefecto;
    }

    public void setAnchoDefecto(int anchoDefecto) {
        this.anchoDefecto = anchoDefecto;
    }

    public String getColorDefecto() {
        return colorDefecto;
    }

    public void setColorDefecto(String colorDefecto) {
        this.colorDefecto = colorDefecto;
    }
}
