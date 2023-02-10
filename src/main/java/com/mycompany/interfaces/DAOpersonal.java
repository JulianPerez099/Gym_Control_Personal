package com.mycompany.interfaces;

import com.mycompany.models.Personal;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface DAOpersonal {
    public void registrar(Personal personal) throws Exception;
    public void modificar(Personal personal) throws Exception;
    public void eliminar(int ID_Usuario) throws Exception;
    public List<Personal> listar(String Nombre_Usuario, String Apellido_Usuario) throws Exception;
    public Personal getPersonalById(int id_usuario) throws Exception;
}
