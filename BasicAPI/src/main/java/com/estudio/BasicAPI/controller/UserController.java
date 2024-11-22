package com.estudio.BasicAPI.controller;


import com.estudio.BasicAPI.models.User;
import com.estudio.BasicAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Iterable<User>> getAllUsers(){
        Iterable<User> usuarios = userService.obtenerTodosLosUsuarios();
        return ResponseEntity.status(HttpStatus.OK).body(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUserByID(@PathVariable Integer id){
        Optional<User> usuarioEncontrado=userService.obtenerUsuarioPorId(id);
        if(usuarioEncontrado.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(usuarioEncontrado);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/telefono/{numero}")
    public ResponseEntity<Optional <User>> getUserByTelefono(@PathVariable String numero){
        Optional<User> usuarioEncontrado= userService.obtenerUsuarioPorTelefono(numero);
        if(usuarioEncontrado.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(usuarioEncontrado);
        }
        else  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity<User> crearUsuario(@RequestBody User user) {
        try {
            User nuevoUsuario = userService.guardarUsuario(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
            return  ResponseEntity.status((HttpStatus.UNPROCESSABLE_ENTITY)).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> borrarUsuario(@PathVariable Integer id){
        String salida=userService.eliminarUsuario(id);
        return ResponseEntity.status(HttpStatus.OK).body(salida);
    }


}
