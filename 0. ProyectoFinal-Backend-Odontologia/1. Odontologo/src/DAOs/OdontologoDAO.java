package DAOs;

import Entidades.Odontologo;

public interface OdontologoDAO {

    public abstract void registrarOdontologo(Odontologo odontologo) throws Exception;
    public abstract String listarOdontologos()throws Exception;
    public abstract void modificarOdontologo (int id, String nombreNuevo, String apellidoNuevo, int matriculaNueva ) throws Exception;
    public abstract void eliminarOdontologo(int id) throws Exception;

}
