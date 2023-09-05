package com.digital.Clase21Act.Controller;

import com.digital.Clase21Act.Service.UsuarioServiceInterface;
import com.digital.Clase21Act.dto.CrearUsuarioDto;
import com.digital.Clase21Act.dto.UsuarioDto;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UsuarioController {

    private final UsuarioServiceInterface usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDto> crearUsuario(@RequestBody CrearUsuarioDto request){
        return ResponseEntity.ok().body(usuarioService.crearUsuario(request));

    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> listarUsuarios(){
        return ResponseEntity.ok().body(usuarioService.listarUsuarios());
    }

}
