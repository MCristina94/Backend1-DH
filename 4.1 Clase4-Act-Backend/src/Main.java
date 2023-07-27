public class Main {
    public static void main(String[] args) {

        IServicioDescarga servicioDescarga = new ProxyServicioDescarga(new ServicioDescarga());

        Usuario usuario = new Usuario(TipoUsuarioEnum.FREE, "Manuela1952");
        System.out.println(servicioDescarga.descargar(usuario));



        Usuario usuario2 = new Usuario(TipoUsuarioEnum.PREMIUM, "Lulu2525");

        System.out.println(servicioDescarga.descargar(usuario2));

    }
}