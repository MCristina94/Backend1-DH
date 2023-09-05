package com.digital.Clase21Act.Service;

import com.digital.Clase21Act.Entity.Usuario;
import com.digital.Clase21Act.Repository.UsuarioRepository;
import com.digital.Clase21Act.dto.CrearUsuarioDto;
import com.digital.Clase21Act.dto.UsuarioDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService implements UsuarioServiceInterface{

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDto crearUsuario(CrearUsuarioDto crearMovimientoDto) {
        Usuario usuario = new Usuario();
        usuario.setUsuario(crearMovimientoDto.usuario());
        usuario.setPassword(crearMovimientoDto.password());

        Usuario save = usuarioRepository.save(usuario);

        return new UsuarioDto(save.getId(), save.getUsuario(), save.getPassword());
    }

    @Override
    public List<UsuarioDto> listarUsuarios() {
        ObjectMapper mapper = new ObjectMapper();
        List<Usuario> usuarios = usuarioRepository.findAll();

        return mapper.convertValue(usuarios, new TypeReference<>() {
        });
    }
}
