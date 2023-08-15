package org.digitalhouse.Servicios;

import org.digitalhouse.DAOs.MedicamentoDAO;
import org.digitalhouse.Entidades.Medicamento;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ServicioMedicamentos {

    private MedicamentoDAO medicamentoDAO;

    private Logger LOGGER = Logger.getLogger(ServicioMedicamentos.class);

    public ServicioMedicamentos(MedicamentoDAO medicamentoDAO) {
        this.medicamentoDAO = medicamentoDAO;
    }

    public boolean guardar(Medicamento medicamento) {
        //Validemos un par de variables
        if (medicamento.getPrecio() < 0) {
            LOGGER.warn("Precio invalido");
            return false;
        }
        if (medicamento.getLaboratorio().isBlank()) {
            LOGGER.warn("Laboratorio vacio");
            return false;
        }




        try {
            medicamentoDAO.guardar(medicamento);
        } catch (Exception ignored) {
            return false;
        }

        return true;
    }

    public Medicamento buscar(int id) {
        Medicamento medicamento = null;

        try {
            medicamento = medicamentoDAO.buscar(id);
        } catch (Exception ignored) {
        }

        return medicamento;
    }
    public List<Medicamento> buscarPorPrecio(double precio) {
        List<Medicamento> medicamentoList = new ArrayList<>();

        try {
            medicamentoList = medicamentoDAO.buscarPorPrecio(precio);
        } catch (Exception ignored) {
        }

        return medicamentoList;
    }
}
