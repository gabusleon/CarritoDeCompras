package ec.edu.ups.dao;

import ec.edu.ups.modelo.Rol;
import ec.edu.ups.modelo.Usuario;

import java.util.List;

public interface UsuarioDAO {

    Usuario autenticar(String username, String contrasenia);

    void crear(Usuario usuario);

    Usuario buscarPorUsername(String username);

    void eliminar(String username);

    void actualizar(Usuario usuario);

    List<Usuario> listarTodos();

    List<Usuario> listarPorRol(Rol rol);

}
