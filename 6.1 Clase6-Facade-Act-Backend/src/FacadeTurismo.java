public class FacadeTurismo implements IFacadeTurismo{
    private ServicioVuelo servicioVuelo;
    private ServicioHotel servicioHotel;

    public FacadeTurismo() {
        servicioVuelo = new ServicioVuelo();
        servicioHotel = new ServicioHotel();

    }

    @Override
    public String realizarBusqueda(Vuelo vuelo, Hotel hotel) {

        String resultado = servicioHotel.realizarBusqueda(hotel.getCiudadDestino(), hotel.getFechaSalida(), hotel.getFechaRegreso()) + " " +servicioVuelo.realizarBusqueda(vuelo.getCiudadDestino(), vuelo.getFechaSalida(), vuelo.getFechaRegreso());
        System.out.println(resultado);

        return "APROBADO";
    }
}
