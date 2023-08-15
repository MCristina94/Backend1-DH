package DAOs;

import Entidades.Odontologo;

public interface OdontologoDAO {

    public abstract void registrarOdontologo(Odontologo odontologo) throws Exception;
    public abstract String listarOdontologos()throws Exception;

}
