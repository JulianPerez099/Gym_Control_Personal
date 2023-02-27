package com.mycompany.personal_sosa;

import com.mycompany.DB.Database;
import com.mycompany.interfaces.DAOrutinas;
import com.mycompany.models.Rutinas;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class DAOrutinasImpl extends Database implements DAOrutinas {

    @Override
    public void registrar(Rutinas rutina) throws Exception {
        try {
            this.Conectar();
            FileInputStream archivofoto;
            PreparedStatement st1 = this.conexion.prepareStatement("INSERT INTO ejercicios (Nombre_Ejercicio,Tipo_de_Ejercicio,Nivel_del_Ejercicio,Descripcion_ejercicio,Imagen_Ejercicio,Imagen_Texto) VALUES (?,?,?,?,?,?);");
            st1.setString(1, rutina.getNombre_Ejercicio());
            st1.setString(2, rutina.getTipo_de_Ejercicio());
            st1.setString(3, rutina.getNivel_del_Ejercicio());
            st1.setString(4, rutina.getDescripcion_ejercicio());
            st1.setString(6, rutina.getImagen_Texto());
            archivofoto = new FileInputStream(rutina.getImagen_Texto());
            st1.setBinaryStream(5, archivofoto);
            st1.executeUpdate();
            st1.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Rutinas rutina) throws Exception {
        try {
            this.Conectar();
            FileInputStream archivofoto;
            PreparedStatement st = this.conexion.prepareStatement("UPDATE ejercicios SET Nombre_Ejercicio = ?,Tipo_de_Ejercicio = ?,Nivel_del_Ejercicio = ?,Descripcion_ejercicio = ?,Imagen_Ejercicio = ?,Imagen_Texto = ? WHERE id_ejercicio = ?;");
            st.setString(1, rutina.getNombre_Ejercicio());
            st.setString(2, rutina.getTipo_de_Ejercicio());
            st.setString(3, rutina.getNivel_del_Ejercicio());
            st.setString(4, rutina.getDescripcion_ejercicio());
            st.setString(6, rutina.getImagen_Texto());
            archivofoto = new FileInputStream(rutina.getImagen_Texto());
            st.setBinaryStream(5, archivofoto);
            st.setInt(7, rutina.getID_Rutina());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int ID_Rutina) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM ejercicios WHERE id_ejercicio = ?;");
            st.setInt(1, ID_Rutina);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Rutinas> listar(String Nombre_Ejercicio, String Tipo_de_Ejercicio, String Nivel_del_Ejercicio) throws Exception {
        List<Rutinas> lista = null;
        try {
            this.Conectar();
            String Query = Nombre_Ejercicio.isEmpty() || Tipo_de_Ejercicio.isEmpty() || Nivel_del_Ejercicio.isEmpty() ? "SELECT * FROM ejercicios ORDER BY id_ejercicio DESC;" : "SELECT * FROM ejercicios WHERE Nombre_Ejercicio LIKE '%" + Nombre_Ejercicio + "%' OR Tipo_de_Ejercicio LIKE '%" + Tipo_de_Ejercicio + "%' OR Nivel_del_Ejercicio LIKE '%" + Nivel_del_Ejercicio + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Rutinas personal = new Rutinas();
                personal.setID_Rutina(rs.getInt("id_ejercicio"));
                personal.setNombre_Ejercicio(rs.getString("Nombre_Ejercicio"));
                personal.setTipo_de_Ejercicio(rs.getString("Tipo_de_Ejercicio"));
                personal.setNivel_del_Ejercicio(rs.getString("Nivel_del_Ejercicio"));
                personal.setDescripcion_ejercicio(rs.getString("Descripcion_ejercicio"));
                personal.setImagen_Ejercicio(rs.getBytes("Imagen_Ejercicio"));
                lista.add(personal);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Rutinas getRutinasById(int id_ejercicio) throws Exception {
        Rutinas rutina = new Rutinas();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM ejercicios WHERE id_ejercicio = ? LIMIT 1 ;");
            st.setInt(1, id_ejercicio);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                rutina.setID_Rutina(rs.getInt("id_ejercicio"));
                rutina.setNombre_Ejercicio(rs.getString("Nombre_Ejercicio"));
                rutina.setTipo_de_Ejercicio(rs.getString("Tipo_de_Ejercicio"));
                rutina.setNivel_del_Ejercicio(rs.getString("Nivel_del_Ejercicio"));
                rutina.setDescripcion_ejercicio(rs.getString("Descripcion_ejercicio"));
                rutina.setImagen_Ejercicio(rs.getBytes("Imagen_Ejercicio"));
                rutina.setImagen_Texto(rs.getString("Imagen_Texto"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return rutina;
    }

}
