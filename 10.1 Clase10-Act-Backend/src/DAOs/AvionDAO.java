package DAOs;

import Entidades.Avion;

public interface AvionDAO {
    public abstract void registrarAvion(Avion avion)throws Exception;
    public abstract Avion buscarAvion(int id)throws Exception;
    public abstract void eliminarAvion(int id)throws Exception;
    public abstract void listarAviones()throws Exception;
}
