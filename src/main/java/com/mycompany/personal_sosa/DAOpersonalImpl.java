package com.mycompany.personal_sosa;

import com.mycompany.DB.Database;
import com.mycompany.interfaces.DAOpersonal;
import com.mycompany.models.Personal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class DAOpersonalImpl extends Database implements DAOpersonal {

    @Override
    public void registrar(Personal personal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st1 = this.conexion.prepareStatement("INSERT INTO usuarios (Nombre_Usuario, Apellido_Usuario, Fecha_Nacimiento_Usuario, Telefono_Usuario, Telefono_Emergencia_Usuario, Objetivo_Usuario, Tiene_Enfermedades_Usuario, Consume_Medicamentos_Usuario, Tiene_Lesiones_Usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            st1.setString(1, personal.getNombre_Usuario());
            st1.setString(2, personal.getApellido_Usuario());
            st1.setString(3, personal.getFecha_Nacimiento_Usuario());
            st1.setString(4, personal.getTelefono_Usuario());
            st1.setString(5, personal.getTelefono_Emergencia_Usuario());
            st1.setString(6, personal.getObjetivo_Usuario());
            st1.setString(7, personal.getTiene_Enfermedades_Usuario());
            st1.setString(8, personal.getConsume_Medicamentos_Usuario());
            st1.setString(9, personal.getTiene_Lesiones_Usuario());
            st1.executeUpdate();
            ResultSet rs = st1.getGeneratedKeys();
            int id_usuario = 0;
            if (rs.next()) {
                id_usuario = rs.getInt(1);
            }

            PreparedStatement st2 = this.conexion.prepareStatement("INSERT INTO informacion_fisica (id_usuario, Peso_Usuario, Talla_Usuario, Perimetro_Usuario, IMC_Usuario) VALUES (?, ?, ?, ?, ?);");
            st2.setInt(1, id_usuario);
            st2.setDouble(2, personal.getPeso_Usuario());
            st2.setDouble(3, personal.getTalla_Usuario());
            st2.setDouble(4, personal.getPerimetro_Usuario());
            st2.setDouble(5, personal.getIMC_Usuario());
            st2.executeUpdate();

            PreparedStatement st3 = this.conexion.prepareStatement("INSERT INTO enfermedades (id_usuario, Enfermedades_Usuario) VALUES (?, ?);");
            st3.setInt(1, id_usuario);
            st3.setString(2, personal.getEnfermedades_Usuario());
            st3.executeUpdate();

            PreparedStatement st4 = this.conexion.prepareStatement("INSERT INTO medicamentos (id_usuario, Medicamentos_Usuario) VALUES (?, ?);");
            st4.setInt(1, id_usuario);
            st4.setString(2, personal.getMedicamentos_Usuario());
            st4.executeUpdate();

            PreparedStatement st5 = this.conexion.prepareStatement("INSERT INTO lesiones (id_usuario, Lesiones_Usuario) VALUES (?, ?);");
            st5.setInt(1, id_usuario);
            st5.setString(2, personal.getLesiones_Usuario());
            st5.executeUpdate();

            PreparedStatement st6 = this.conexion.prepareStatement("INSERT INTO revisiones_medicas (id_usuario, Ultima_Revision_Medica_Usuario) VALUES (?, ?);");
            st6.setInt(1, id_usuario);
            st6.setString(2, personal.getUltima_Revision_Medica_Usuario());
            st6.executeUpdate();

            st1.close();
            st2.close();
            st3.close();
            st4.close();
            st5.close();
            st6.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Personal personal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st1 = this.conexion.prepareStatement("UPDATE usuarios SET Nombre_Usuario = ?, Apellido_Usuario = ?, Fecha_Nacimiento_Usuario = ?, Telefono_Usuario = ?, Telefono_Emergencia_Usuario = ?, Objetivo_Usuario = ?, Tiene_Enfermedades_Usuario = ?, Consume_Medicamentos_Usuario = ?, Tiene_Lesiones_Usuario = ? WHERE ID_Usuario = ?", Statement.RETURN_GENERATED_KEYS);
            st1.setString(1, personal.getNombre_Usuario());
            st1.setString(2, personal.getApellido_Usuario());
            st1.setString(3, personal.getFecha_Nacimiento_Usuario());
            st1.setString(4, personal.getTelefono_Usuario());
            st1.setString(5, personal.getTelefono_Emergencia_Usuario());
            st1.setString(6, personal.getObjetivo_Usuario());
            st1.setString(7, personal.getTiene_Enfermedades_Usuario());
            st1.setString(8, personal.getConsume_Medicamentos_Usuario());
            st1.setString(9, personal.getTiene_Lesiones_Usuario());
            st1.setInt(10, personal.getID_Usuario());
            st1.executeUpdate();
            ResultSet rs = st1.getGeneratedKeys();
            int id_usuario = 0;
            if (rs.next()) {
                id_usuario = rs.getInt(1);
            }

            PreparedStatement st2 = this.conexion.prepareStatement("UPDATE informacion_fisica SET Peso_Usuario = ?, Talla_Usuario = ?, Perimetro_Usuario = ?, IMC_Usuario = ? WHERE ID_Usuario = ?");
            st2.setDouble(1, personal.getPeso_Usuario());
            st2.setDouble(2, personal.getTalla_Usuario());
            st2.setDouble(3, personal.getPerimetro_Usuario());
            st2.setDouble(4, personal.getIMC_Usuario());
            st2.setInt(5, personal.getID_Usuario());
            st2.executeUpdate();

            PreparedStatement st3 = this.conexion.prepareStatement("UPDATE enfermedades SET Enfermedades_Usuario = ? WHERE ID_Usuario = ?");
            st3.setString(1, personal.getEnfermedades_Usuario());
            st3.setInt(2, personal.getID_Usuario());
            st3.executeUpdate();

            PreparedStatement st4 = this.conexion.prepareStatement("UPDATE medicamentos SET Medicamentos_Usuario = ? WHERE ID_Usuario = ?");
            st4.setString(1, personal.getMedicamentos_Usuario());
            st4.setInt(2, personal.getID_Usuario());
            st4.executeUpdate();

            PreparedStatement st5 = this.conexion.prepareStatement("UPDATE lesiones SET Lesiones_Usuario = ? WHERE ID_Usuario = ?");
            st5.setString(1, personal.getLesiones_Usuario());
            st5.setInt(2, personal.getID_Usuario());
            st5.executeUpdate();

            PreparedStatement st6 = this.conexion.prepareStatement("UPDATE revisiones_medicas SET Ultima_Revision_Medica_Usuario = ? WHERE ID_Usuario = ?");
            st6.setString(1, personal.getUltima_Revision_Medica_Usuario());
            st6.setInt(2, personal.getID_Usuario());
            st6.executeUpdate();

            st1.close();
            st2.close();
            st3.close();
            st4.close();
            st5.close();
            st6.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int ID_Usuario) throws Exception {
        try {
            this.Conectar();

            // Eliminar registro de la tabla informacion_fisica
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM informacion_fisica WHERE ID_Usuario = ?;");
            st.setInt(1, ID_Usuario);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla revisiones_medicas
            st = this.conexion.prepareStatement("DELETE FROM revisiones_medicas WHERE ID_Usuario = ?;");
            st.setInt(1, ID_Usuario);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla enfermedades
            st = this.conexion.prepareStatement("DELETE FROM enfermedades WHERE ID_Usuario = ?;");
            st.setInt(1, ID_Usuario);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla medicamentos
            st = this.conexion.prepareStatement("DELETE FROM medicamentos WHERE ID_Usuario = ?;");
            st.setInt(1, ID_Usuario);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla lesiones
            st = this.conexion.prepareStatement("DELETE FROM lesiones WHERE ID_Usuario = ?;");
            st.setInt(1, ID_Usuario);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla usuarios
            st = this.conexion.prepareStatement("DELETE FROM usuarios WHERE ID_Usuario = ? LIMIT 1;");
            st.setInt(1, ID_Usuario);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Personal> listar(String Nombre_Usuario, String Apellido_Usuario) throws Exception {
        List<Personal> lista = null;
        try {
            this.Conectar();
            String Query;
            if (Nombre_Usuario.isEmpty() || Apellido_Usuario.isEmpty()) {
                Query = "SELECT * FROM usuarios "
                        + "JOIN informacion_fisica ON usuarios.ID_Usuario = informacion_fisica.ID_Usuario "
                        + "JOIN revisiones_medicas ON usuarios.ID_Usuario = revisiones_medicas.ID_Usuario "
                        + "JOIN enfermedades ON usuarios.ID_Usuario = enfermedades.ID_Usuario "
                        + "JOIN medicamentos ON usuarios.ID_Usuario = medicamentos.ID_Usuario "
                        + "JOIN lesiones ON usuarios.ID_Usuario = lesiones.ID_Usuario ORDER BY usuarios.ID_Usuario DESC";
            } else {
                Query = "SELECT * FROM usuarios "
                        + "JOIN informacion_fisica ON usuarios.ID_Usuario = informacion_fisica.ID_Usuario "
                        + "JOIN revisiones_medicas ON usuarios.ID_Usuario = revisiones_medicas.ID_Usuario "
                        + "JOIN enfermedades ON usuarios.ID_Usuario = enfermedades.ID_Usuario "
                        + "JOIN medicamentos ON usuarios.ID_Usuario = medicamentos.ID_Usuario "
                        + "JOIN lesiones ON usuarios.ID_Usuario = lesiones.ID_Usuario "
                        + "WHERE Nombre_Usuario LIKE '%" + Nombre_Usuario + "%' OR Apellido_Usuario LIKE '%" + Apellido_Usuario + "%';";
            }
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Personal personal = new Personal();
                personal.setID_Usuario(rs.getInt("ID_Usuario"));
                personal.setNombre_Usuario(rs.getString("Nombre_Usuario"));
                personal.setApellido_Usuario(rs.getString("Apellido_Usuario"));
                personal.setFecha_Nacimiento_Usuario(rs.getString("Fecha_Nacimiento_Usuario"));
                personal.setPeso_Usuario(rs.getDouble("Peso_Usuario"));
                personal.setTalla_Usuario(rs.getDouble("Talla_Usuario"));
                personal.setPerimetro_Usuario(rs.getDouble("Perimetro_Usuario"));
                personal.setIMC_Usuario(rs.getDouble("IMC_Usuario"));
                personal.setTelefono_Usuario(rs.getString("Telefono_Usuario"));
                personal.setTelefono_Emergencia_Usuario(rs.getString("Telefono_Emergencia_Usuario"));
                personal.setObjetivo_Usuario(rs.getString("Objetivo_Usuario"));
                personal.setUltima_Revision_Medica_Usuario(rs.getString("Ultima_Revision_Medica_Usuario"));
                personal.setTiene_Enfermedades_Usuario(rs.getString("Tiene_Enfermedades_Usuario"));
                personal.setEnfermedades_Usuario(rs.getString("Enfermedades_Usuario"));
                personal.setConsume_Medicamentos_Usuario(rs.getString("Consume_Medicamentos_Usuario"));
                personal.setMedicamentos_Usuario(rs.getString("Medicamentos_Usuario"));
                personal.setTiene_Lesiones_Usuario(rs.getString("Tiene_Lesiones_Usuario"));
                personal.setLesiones_Usuario(rs.getString("Lesiones_Usuario"));
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
    public Personal getPersonalById(int id_usuario) throws Exception {
        Personal personal = new Personal();
        try {
            this.Conectar();
            String Query;
            Query = "SELECT usuarios.ID_Usuario, Nombre_Usuario, Apellido_Usuario, Fecha_Nacimiento_Usuario, "
                    + "Peso_Usuario, Talla_Usuario, Perimetro_Usuario, IMC_Usuario, Telefono_Usuario, "
                    + "Telefono_Emergencia_Usuario, Objetivo_Usuario, Ultima_Revision_Medica_Usuario, "
                    + "Tiene_Enfermedades_Usuario, Enfermedades_Usuario, Consume_Medicamentos_Usuario, Medicamentos_Usuario, "
                    + "Tiene_Lesiones_Usuario, Lesiones_Usuario "
                    + "FROM usuarios "
                    + "JOIN informacion_fisica ON usuarios.ID_Usuario = informacion_fisica.ID_Usuario "
                    + "JOIN revisiones_medicas ON usuarios.ID_Usuario = revisiones_medicas.ID_Usuario "
                    + "JOIN enfermedades ON usuarios.ID_Usuario = enfermedades.ID_Usuario "
                    + "JOIN medicamentos ON usuarios.ID_Usuario = medicamentos.ID_Usuario "
                    + "JOIN lesiones ON usuarios.ID_Usuario = lesiones.ID_Usuario "
                    + "WHERE usuarios.id_usuario = ? LIMIT 1;";

            PreparedStatement st = this.conexion.prepareStatement(Query);
            st.setInt(1, id_usuario);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                personal.setID_Usuario(rs.getInt("ID_Usuario"));
                personal.setNombre_Usuario(rs.getString("Nombre_Usuario"));
                personal.setApellido_Usuario(rs.getString("Apellido_Usuario"));
                personal.setFecha_Nacimiento_Usuario(rs.getString("Fecha_Nacimiento_Usuario"));
                personal.setPeso_Usuario(rs.getDouble("Peso_Usuario"));
                personal.setTalla_Usuario(rs.getDouble("Talla_Usuario"));
                personal.setPerimetro_Usuario(rs.getDouble("Perimetro_Usuario"));
                personal.setIMC_Usuario(rs.getDouble("IMC_Usuario"));
                personal.setTelefono_Usuario(rs.getString("Telefono_Usuario"));
                personal.setTelefono_Emergencia_Usuario(rs.getString("Telefono_Emergencia_Usuario"));
                personal.setObjetivo_Usuario(rs.getString("Objetivo_Usuario"));
                personal.setUltima_Revision_Medica_Usuario(rs.getString("Ultima_Revision_Medica_Usuario"));
                personal.setTiene_Enfermedades_Usuario(rs.getString("Tiene_Enfermedades_Usuario"));
                personal.setEnfermedades_Usuario(rs.getString("Enfermedades_Usuario"));
                personal.setConsume_Medicamentos_Usuario(rs.getString("Consume_Medicamentos_Usuario"));
                personal.setMedicamentos_Usuario(rs.getString("Medicamentos_Usuario"));
                personal.setTiene_Lesiones_Usuario(rs.getString("Tiene_Lesiones_Usuario"));
                personal.setLesiones_Usuario(rs.getString("Lesiones_Usuario"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        } finally {
            this.Cerrar();
        }
        return personal;
    }

}
