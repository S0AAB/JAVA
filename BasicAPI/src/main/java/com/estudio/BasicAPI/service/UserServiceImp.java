package com.estudio.BasicAPI.service;

import com.estudio.BasicAPI.models.User;
import com.estudio.BasicAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @Override
    public Iterable<User> obtenerTodosLosUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> obtenerUsuarioPorId(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public User guardarUsuario(User user) {

        if (obtenerUsuarioPorTelefono(user.getTelefono()).isPresent()) {
            throw new IllegalArgumentException("El teléfono ya está registrado.");

        } else {
            return userRepository.save(user);
        }
    }

    public String eliminarUsuario(Integer id) {
        try {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
                return "Usuario con ID " + id + " borrado con éxito.";
            } else {
                throw new NoSuchElementException("Usuario con ID " + id + " no encontrado.");
            }
        } catch (IllegalArgumentException e) {
            return "Error: El ID proporcionado es nulo o inválido.";
        } catch (Exception e) {
            return "Error inesperado al intentar eliminar el usuario: " + e.getMessage();
        }
    }

    @Override
    public Optional<User> obtenerUsuarioPorTelefono(String telefono) {
        return Optional.ofNullable(userRepository.findByTelefono(telefono));
    }
}
