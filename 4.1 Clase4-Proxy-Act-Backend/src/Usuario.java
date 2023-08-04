public class Usuario {
    private final TipoUsuarioEnum tipousuario;
    private String identificador;

    public Usuario(TipoUsuarioEnum tipousuario, String identificador) {
        this.tipousuario = tipousuario;
        this.identificador = identificador;
    }

    public TipoUsuarioEnum getTipousuario() {
        return tipousuario;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
