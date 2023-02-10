package com.mycompany.interfaces;

import com.mycompany.models.Rutinas;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface DAOrutinas {
    public void registrar(Rutinas rutina) throws Exception;
    public void modificar(Rutinas rutina) throws Exception;
    public void eliminar(int ID_Rutina) throws Exception;
    public List<Rutinas> listar(String Nombre_Ejercicio,String Tipo_de_Ejercicio,String Nivel_del_Ejercicio) throws Exception;
    public Rutinas getRutinasById(int id_ejercicio) throws Exception;
}