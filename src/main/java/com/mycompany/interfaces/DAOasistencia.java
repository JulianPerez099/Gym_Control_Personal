package com.mycompany.interfaces;

import com.mycompany.models.Asistencia;
import java.util.List;

/**
 *
 * @author Julian
 */
public interface DAOasistencia {
    public void registrar(Asistencia personal) throws Exception;
    public void modificar(Asistencia personal) throws Exception;
    public void eliminar(int ID_entrenamiento) throws Exception;
    public List<Asistencia> listar(String Nombre_Usuario, String Apellido_Usuario, String Debe, String Fecha_de_Entrenamiento) throws Exception;
    public Asistencia getAsistenciaById(int id_entrenamiento) throws Exception;
    public List<Asistencia> Reportes()throws Exception;
}
