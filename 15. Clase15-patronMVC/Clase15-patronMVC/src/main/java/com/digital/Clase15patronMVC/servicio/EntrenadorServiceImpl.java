package com.digital.Clase15patronMVC.servicio;

import com.digital.Clase15patronMVC.modelo.Entrenador;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class EntrenadorServiceImpl implements EntrenadorService{

    @Override
    public List<Entrenador> listaEntrenador() {
        return Arrays.asList(new Entrenador("Mauricio"), new Entrenador("Agusto"));
    }
}
