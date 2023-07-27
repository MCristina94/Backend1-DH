public class ServicioDescarga implements IServicioDescarga{

    @Override
    public String descargar(Usuario usuario) {

        System.out.println("Descargando canción para el usuario "+ usuario.getIdentificador() +" de tipo " + TipoUsuarioEnum.PREMIUM);
        return "CANCION DESCARGADA";
    }
}
