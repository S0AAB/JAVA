package com.estudio.BasicAPI.service;

import com.estudio.BasicAPI.models.User;

import java.util.Optional;

public interface UserService {
    Iterable<User> obtenerTodosLosUsuarios();
    Optional<User> obtenerUsuarioPorId(Integer id);
    User guardarUsuario(User user);
    String eliminarUsuario(Integer id);
    Optional<User> obtenerUsuarioPorTelefono(String telefono);
}
