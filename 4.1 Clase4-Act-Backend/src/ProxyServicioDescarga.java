public class ProxyServicioDescarga implements IServicioDescarga{

    private ServicioDescarga servicioDescarga;

    public ProxyServicioDescarga(ServicioDescarga servicioDescarga) {
        this.servicioDescarga = servicioDescarga;
    }

    public ServicioDescarga getServicioDescarga() {
        return servicioDescarga;
    }

    public void setServicioDescarga(ServicioDescarga servicioDescarga) {
        this.servicioDescarga = servicioDescarga;
    }

    @Override
    public String descargar(Usuario usuario) {

        if(usuario.getTipousuario() == TipoUsuarioEnum.PREMIUM){

            return servicioDescarga.descargar(usuario);
        }
        System.out.println("No se puede descargar la canción, " +usuario.getIdentificador()+" usted tiene servicio FREE");
        return "CANCION NO DESCARGADA";
    }
}
