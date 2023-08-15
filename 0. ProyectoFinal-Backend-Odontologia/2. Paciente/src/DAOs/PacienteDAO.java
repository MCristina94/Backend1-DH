package DAOs;

import Entidades.Paciente;

import java.sql.Date;

public interface PacienteDAO {
    public abstract void registrarPaciente(Paciente paciente) throws Exception;
    public abstract void listarPacientes() throws Exception;
    public abstract void modificarPaciente(int id, String nuevoNombre, String nuevoApellido, String nuevoDomicilio, Date nuevaFechaAlta) throws Exception;
    public abstract void eliminarPaciente(int id)throws Exception;
}
