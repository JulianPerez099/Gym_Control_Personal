package com.mycompany.personal_sosa;

import com.mycompany.DB.Database;
import com.mycompany.interfaces.DAOasistencia;
import com.mycompany.models.Asistencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class DAOasistenciaImpl extends Database implements DAOasistencia {

    @Override
    public void registrar(Asistencia personal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st1
                    = this.conexion.prepareStatement(
                            "INSERT INTO rutinas(id_usuario,Ejercicio_1,Ejercicio_2,Ejercicio_3,Ejercicio_4,Ejercicio_5,Ejercicio_6,Ejercicio_7,Ejercicio_8,Ejercicio_9,Ejercicio_10,Ejercicio_11,Ejercicio_12,Ejercicio_13,Ejercicio_14,Ejercicio_15) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);",
                            Statement.RETURN_GENERATED_KEYS
                    );
            st1.setInt(1, personal.getID_Usuario());
            st1.setString(2, personal.getEjercicio_1());
            st1.setString(3, personal.getEjercicio_2());
            st1.setString(4, personal.getEjercicio_3());
            st1.setString(5, personal.getEjercicio_4());
            st1.setString(6, personal.getEjercicio_5());
            st1.setString(7, personal.getEjercicio_6());
            st1.setString(8, personal.getEjercicio_7());
            st1.setString(9, personal.getEjercicio_8());
            st1.setString(10, personal.getEjercicio_9());
            st1.setString(11, personal.getEjercicio_10());
            st1.setString(12, personal.getEjercicio_11());
            st1.setString(13, personal.getEjercicio_12());
            st1.setString(14, personal.getEjercicio_13());
            st1.setString(15, personal.getEjercicio_14());
            st1.setString(16, personal.getEjercicio_15());
            st1.executeUpdate();
            ResultSet rs = st1.getGeneratedKeys();
            int id_Rutinas = 0;
            if (rs.next()) {
                id_Rutinas = rs.getInt(1);
            }

            PreparedStatement st2
                    = this.conexion.prepareStatement(
                            "INSERT INTO series(id_usuario,Serie_1,Serie_2,Serie_3) VALUES(?,?,?,?);",
                            Statement.RETURN_GENERATED_KEYS
                    );
            st2.setInt(1, personal.getID_Usuario());
            st2.setString(2, personal.getSerie_1());
            st2.setString(3, personal.getSerie_2());
            st2.setString(4, personal.getSerie_3());
            st2.executeUpdate();
            ResultSet rs2 = st2.getGeneratedKeys();
            int id_Series = 0;
            if (rs2.next()) {
                id_Series = rs2.getInt(1);
            }

            PreparedStatement st3
                    = this.conexion.prepareStatement(
                            "INSERT INTO tiempos(id_usuario,Tiempo_1,Tiempo_2,Tiempo_3,Tiempo_4,Tiempo_5,Tiempo_6,Tiempo_7,Tiempo_8,Tiempo_9,Tiempo_10,Tiempo_11,Tiempo_12,Tiempo_13,Tiempo_14,Tiempo_15) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);",
                            Statement.RETURN_GENERATED_KEYS
                    );
            st3.setInt(1, personal.getID_Usuario());
            st3.setString(2, personal.getTiempo_1());
            st3.setString(3, personal.getTiempo_2());
            st3.setString(4, personal.getTiempo_3());
            st3.setString(5, personal.getTiempo_4());
            st3.setString(6, personal.getTiempo_5());
            st3.setString(7, personal.getTiempo_6());
            st3.setString(8, personal.getTiempo_7());
            st3.setString(9, personal.getTiempo_8());
            st3.setString(10, personal.getTiempo_9());
            st3.setString(11, personal.getTiempo_10());
            st3.setString(12, personal.getTiempo_11());
            st3.setString(13, personal.getTiempo_12());
            st3.setString(14, personal.getTiempo_13());
            st3.setString(15, personal.getTiempo_14());
            st3.setString(16, personal.getTiempo_15());
            st3.executeUpdate();
            ResultSet rs3 = st3.getGeneratedKeys();
            int id_Tiempos = 0;
            if (rs3.next()) {
                id_Tiempos = rs3.getInt(1);
            }

            PreparedStatement st4
                    = this.conexion.prepareStatement(
                            "INSERT INTO Repeticiones(id_usuario,Repeticion_1,Repeticion_2,Repeticion_3,Repeticion_4,Repeticion_5,Repeticion_6,Repeticion_7,Repeticion_8,Repeticion_9,Repeticion_10,Repeticion_11,Repeticion_12,Repeticion_13,Repeticion_14,Repeticion_15) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);",
                            Statement.RETURN_GENERATED_KEYS
                    );
            st4.setInt(1, personal.getID_Usuario());
            st4.setString(2, personal.getRepeticion_1());
            st4.setString(3, personal.getRepeticion_2());
            st4.setString(4, personal.getRepeticion_3());
            st4.setString(5, personal.getRepeticion_4());
            st4.setString(6, personal.getRepeticion_5());
            st4.setString(7, personal.getRepeticion_6());
            st4.setString(8, personal.getRepeticion_7());
            st4.setString(9, personal.getRepeticion_8());
            st4.setString(10, personal.getRepeticion_9());
            st4.setString(11, personal.getRepeticion_10());
            st4.setString(12, personal.getRepeticion_11());
            st4.setString(13, personal.getRepeticion_12());
            st4.setString(14, personal.getRepeticion_13());
            st4.setString(15, personal.getRepeticion_14());
            st4.setString(16, personal.getRepeticion_15());
            st4.executeUpdate();
            ResultSet rs4 = st4.getGeneratedKeys();
            int id_Repeticiones = 0;
            if (rs4.next()) {
                id_Repeticiones = rs4.getInt(1);
            }

            PreparedStatement st5
                    = this.conexion.prepareStatement(
                            "INSERT INTO detallesDebe(id_usuario,Debe,Total_Deuda) VALUES(?,?,?);",
                            Statement.RETURN_GENERATED_KEYS
                    );
            st5.setInt(1, personal.getID_Usuario());
            st5.setString(2, personal.getDebe());
            st5.setDouble(3, personal.getTotal_Deuda());
            st5.executeUpdate();
            ResultSet rs5 = st5.getGeneratedKeys();
            int id_debe = 0;
            if (rs5.next()) {
                id_debe = rs5.getInt(1);
            }

            PreparedStatement st6
                    = this.conexion.prepareStatement(
                            "INSERT INTO entrenamientos(id_usuario,id_Repeticiones,id_Tiempos,id_Series,id_Rutinas,id_debe,Fecha_de_Entrenamiento) VALUES(?,?,?,?,?,?,?);",
                            Statement.RETURN_GENERATED_KEYS
                    );
            st6.setInt(1, personal.getID_Usuario());
            st6.setInt(2, id_Repeticiones);
            st6.setInt(3, id_Tiempos);
            st6.setInt(4, id_Series);
            st6.setInt(5, id_Rutinas);
            st6.setInt(6, id_debe);
            st6.setString(7, personal.getFecha_de_Entrenamiento());
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
    public void modificar(Asistencia personal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st1
                    = this.conexion.prepareStatement(
                            "UPDATE rutinas SET Ejercicio_1=?,Ejercicio_2=?,Ejercicio_3=?,Ejercicio_4=?,Ejercicio_5=?,Ejercicio_6=?,Ejercicio_7=?,Ejercicio_8=?,Ejercicio_9=?,Ejercicio_10=?,Ejercicio_11=?,Ejercicio_12=?,Ejercicio_13=?,Ejercicio_14=?,Ejercicio_15=? WHERE id_usuario=?"
                    );
            st1.setString(1, personal.getEjercicio_1());
            st1.setString(2, personal.getEjercicio_2());
            st1.setString(3, personal.getEjercicio_3());
            st1.setString(4, personal.getEjercicio_4());
            st1.setString(5, personal.getEjercicio_5());
            st1.setString(6, personal.getEjercicio_6());
            st1.setString(7, personal.getEjercicio_7());
            st1.setString(8, personal.getEjercicio_8());
            st1.setString(9, personal.getEjercicio_9());
            st1.setString(10, personal.getEjercicio_10());
            st1.setString(11, personal.getEjercicio_11());
            st1.setString(12, personal.getEjercicio_12());
            st1.setString(13, personal.getEjercicio_13());
            st1.setString(14, personal.getEjercicio_14());
            st1.setString(15, personal.getEjercicio_15());
            st1.setInt(16, personal.getID_Usuario());
            st1.executeUpdate();

            PreparedStatement st2
                    = this.conexion.prepareStatement(
                            "UPDATE series SET Serie_1=?,Serie_2=?,Serie_3=? WHERE id_usuario=?"
                    );
            st2.setString(1, personal.getSerie_1());
            st2.setString(2, personal.getSerie_2());
            st2.setString(3, personal.getSerie_3());
            st2.setInt(4, personal.getID_Usuario());
            st2.executeUpdate();

            PreparedStatement st3
                    = this.conexion.prepareStatement(
                            "UPDATE tiempos SET Tiempo_1=?,Tiempo_2=?,Tiempo_3=?,Tiempo_4=?,Tiempo_5=?,Tiempo_6=?,Tiempo_7=?,Tiempo_8=?,Tiempo_9=?,Tiempo_10=?,Tiempo_11=?,Tiempo_12=?,Tiempo_13=?,Tiempo_14=?,Tiempo_15=? WHERE id_usuario=?"
                    );
            st3.setString(1, personal.getTiempo_1());
            st3.setString(2, personal.getTiempo_2());
            st3.setString(3, personal.getTiempo_3());
            st3.setString(4, personal.getTiempo_4());
            st3.setString(5, personal.getTiempo_5());
            st3.setString(6, personal.getTiempo_6());
            st3.setString(7, personal.getTiempo_7());
            st3.setString(8, personal.getTiempo_8());
            st3.setString(9, personal.getTiempo_9());
            st3.setString(10, personal.getTiempo_10());
            st3.setString(11, personal.getTiempo_11());
            st3.setString(12, personal.getTiempo_12());
            st3.setString(13, personal.getTiempo_13());
            st3.setString(14, personal.getTiempo_14());
            st3.setString(15, personal.getTiempo_15());
            st3.setInt(16, personal.getID_Usuario());
            st3.executeUpdate();

            PreparedStatement st4
                    = this.conexion.prepareStatement(
                            "UPDATE Repeticiones SET Repeticion_1=?,Repeticion_2=?,Repeticion_3=?,Repeticion_4=?,Repeticion_5=?,Repeticion_6=?,Repeticion_7=?,Repeticion_8=?,Repeticion_9=?,Repeticion_10=?,Repeticion_11=?,Repeticion_12=?,Repeticion_13=?,Repeticion_14=?,Repeticion_15=? WHERE id_usuario=?"
                    );
            st4.setString(1, personal.getRepeticion_1());
            st4.setString(2, personal.getRepeticion_2());
            st4.setString(3, personal.getRepeticion_3());
            st4.setString(4, personal.getRepeticion_4());
            st4.setString(5, personal.getRepeticion_5());
            st4.setString(6, personal.getRepeticion_6());
            st4.setString(7, personal.getRepeticion_7());
            st4.setString(8, personal.getRepeticion_8());
            st4.setString(9, personal.getRepeticion_9());
            st4.setString(10, personal.getRepeticion_10());
            st4.setString(11, personal.getRepeticion_11());
            st4.setString(12, personal.getRepeticion_12());
            st4.setString(13, personal.getRepeticion_13());
            st4.setString(14, personal.getRepeticion_14());
            st4.setString(15, personal.getRepeticion_15());
            st4.setInt(16, personal.getID_Usuario());
            st4.executeUpdate();

            PreparedStatement st5
                    = this.conexion.prepareStatement(
                            "UPDATE detallesDebe SET Debe=?,Total_Deuda=? WHERE id_usuario=?"
                    );
            st5.setString(1, personal.getDebe());
            st5.setDouble(2, personal.getTotal_Deuda());
            st5.setInt(3, personal.getID_Usuario());
            st5.executeUpdate();

            PreparedStatement st6
                    = this.conexion.prepareStatement(
                            "UPDATE entrenamientos SET Fecha_de_Entrenamiento=? WHERE id_usuario=?"
                    );
            st6.setString(1, personal.getFecha_de_Entrenamiento());
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
    public void eliminar(int ID_entrenamiento) throws Exception {
        try {
            this.Conectar();

            // Eliminar registro de la tabla informacion_fisica
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM rutinas WHERE id_rutinas = ?;");
            st.setInt(1, ID_entrenamiento);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla revisiones_medicas
            st = this.conexion.prepareStatement("DELETE FROM series WHERE id_series = ?;");
            st.setInt(1, ID_entrenamiento);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla enfermedades
            st = this.conexion.prepareStatement("DELETE FROM tiempos WHERE id_tiempos = ?;");
            st.setInt(1, ID_entrenamiento);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla medicamentos
            st = this.conexion.prepareStatement("DELETE FROM repeticiones WHERE id_repeticiones = ?;");
            st.setInt(1, ID_entrenamiento);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla lesiones
            st = this.conexion.prepareStatement("DELETE FROM detallesdebe WHERE id_debe = ?;");
            st.setInt(1, ID_entrenamiento);
            st.executeUpdate();
            st.close();

            // Eliminar registro de la tabla usuarios
            st = this.conexion.prepareStatement("DELETE FROM entrenamientos WHERE ID_entrenamiento = ?;");
            st.setInt(1, ID_entrenamiento);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Asistencia> listar(
            String Nombre_Usuario,
            String Apellido_Usuario,
            String Debe,
            String Fecha_de_Entrenamiento
    ) throws Exception {
        List<Asistencia> lista = null;
        try {
            this.Conectar();
            String Query;
            if (Nombre_Usuario.isEmpty()
                    || Apellido_Usuario.isEmpty()
                    || Debe.isEmpty()
                    || Fecha_de_Entrenamiento.isEmpty()) {
                Query
                        = "SELECT * FROM usuarios "
                        + "JOIN entrenamientos ON usuarios.id_usuario = entrenamientos.id_usuario "
                        + "JOIN rutinas ON entrenamientos.id_Rutinas = rutinas.id_Rutinas "
                        + "JOIN series ON entrenamientos.id_Series = series.id_Series "
                        + "JOIN tiempos ON entrenamientos.id_Tiempos = tiempos.id_Tiempos "
                        + "JOIN Repeticiones ON entrenamientos.id_Repeticiones = Repeticiones.id_Repeticiones "
                        + "JOIN detallesDebe ON entrenamientos.id_debe = detallesDebe.id_debe "
                        + "WHERE entrenamientos.id_entrenamiento IS NOT NULL ORDER BY ID_Entrenamiento DESC;";
            } else {
                Query
                        = "SELECT * FROM usuarios "
                        + "JOIN entrenamientos ON usuarios.id_usuario = entrenamientos.id_usuario "
                        + "JOIN rutinas ON entrenamientos.id_Rutinas = rutinas.id_Rutinas "
                        + "JOIN series ON entrenamientos.id_Series = series.id_Series "
                        + "JOIN tiempos ON entrenamientos.id_Tiempos = tiempos.id_Tiempos "
                        + "JOIN Repeticiones ON entrenamientos.id_Repeticiones = Repeticiones.id_Repeticiones "
                        + "JOIN detallesDebe ON entrenamientos.id_debe = detallesDebe.id_debe "
                        + "WHERE entrenamientos.id_entrenamiento = usuarios.id_usuario IS NOT NULL AND "
                        + "(Nombre_Usuario LIKE '%"
                        + Nombre_Usuario
                        + "%' OR Apellido_Usuario LIKE '%"
                        + Apellido_Usuario
                        + "%' OR Debe LIKE '%"
                        + Debe
                        + "%' OR Fecha_de_Entrenamiento LIKE '%"
                        + Fecha_de_Entrenamiento
                        + "%');";
            }

            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Asistencia personal = new Asistencia();
                personal.setSerie_1(rs.getString("Serie_1"));
                personal.setSerie_2(rs.getString("Serie_2"));
                personal.setSerie_3(rs.getString("Serie_3"));

                personal.setEjercicio_1(rs.getString("Ejercicio_1"));
                personal.setEjercicio_2(rs.getString("Ejercicio_2"));
                personal.setEjercicio_3(rs.getString("Ejercicio_3"));
                personal.setEjercicio_4(rs.getString("Ejercicio_4"));
                personal.setEjercicio_5(rs.getString("Ejercicio_5"));
                personal.setEjercicio_6(rs.getString("Ejercicio_6"));
                personal.setEjercicio_7(rs.getString("Ejercicio_7"));
                personal.setEjercicio_8(rs.getString("Ejercicio_8"));
                personal.setEjercicio_9(rs.getString("Ejercicio_9"));
                personal.setEjercicio_10(rs.getString("Ejercicio_10"));
                personal.setEjercicio_11(rs.getString("Ejercicio_11"));
                personal.setEjercicio_12(rs.getString("Ejercicio_12"));
                personal.setEjercicio_13(rs.getString("Ejercicio_13"));
                personal.setEjercicio_14(rs.getString("Ejercicio_14"));
                personal.setEjercicio_15(rs.getString("Ejercicio_15"));

                personal.setTiempo_1(rs.getString("Tiempo_1"));
                personal.setTiempo_2(rs.getString("Tiempo_2"));
                personal.setTiempo_3(rs.getString("Tiempo_3"));
                personal.setTiempo_4(rs.getString("Tiempo_4"));
                personal.setTiempo_5(rs.getString("Tiempo_5"));
                personal.setTiempo_6(rs.getString("Tiempo_6"));
                personal.setTiempo_7(rs.getString("Tiempo_7"));
                personal.setTiempo_8(rs.getString("Tiempo_8"));
                personal.setTiempo_9(rs.getString("Tiempo_9"));
                personal.setTiempo_10(rs.getString("Tiempo_10"));
                personal.setTiempo_11(rs.getString("Tiempo_11"));
                personal.setTiempo_12(rs.getString("Tiempo_12"));
                personal.setTiempo_13(rs.getString("Tiempo_13"));
                personal.setTiempo_14(rs.getString("Tiempo_14"));
                personal.setTiempo_15(rs.getString("Tiempo_15"));

                personal.setRepeticion_1(rs.getString("Repeticion_1"));
                personal.setRepeticion_2(rs.getString("Repeticion_2"));
                personal.setRepeticion_3(rs.getString("Repeticion_3"));
                personal.setRepeticion_4(rs.getString("Repeticion_4"));
                personal.setRepeticion_5(rs.getString("Repeticion_5"));
                personal.setRepeticion_6(rs.getString("Repeticion_6"));
                personal.setRepeticion_7(rs.getString("Repeticion_7"));
                personal.setRepeticion_8(rs.getString("Repeticion_8"));
                personal.setRepeticion_9(rs.getString("Repeticion_9"));
                personal.setRepeticion_10(rs.getString("Repeticion_10"));
                personal.setRepeticion_11(rs.getString("Repeticion_11"));
                personal.setRepeticion_12(rs.getString("Repeticion_12"));
                personal.setRepeticion_13(rs.getString("Repeticion_13"));
                personal.setRepeticion_14(rs.getString("Repeticion_14"));
                personal.setRepeticion_15(rs.getString("Repeticion_15"));

                personal.setID_Debe(rs.getInt("id_debe"));
                personal.setID_Usuario(rs.getInt("ID_Usuario"));
                personal.setID_Entrenamiento(rs.getInt("ID_Entrenamiento"));
                personal.setID_Ejercicio(rs.getInt("ID_Ejercicio"));
                personal.setID_Repeticiones(rs.getInt("id_Repeticiones"));
                personal.setID_Tiempos(rs.getInt("id_Tiempos"));
                personal.setID_Rutinas(rs.getInt("id_Rutinas"));
                personal.setID_Series(rs.getInt("id_Series"));
                personal.setFecha_de_Entrenamiento(
                        rs.getString("Fecha_de_Entrenamiento")
                );
                personal.setDebe(rs.getString("Debe"));
                personal.setTotal_Deuda(rs.getDouble("Total_Deuda"));

                personal.setNombre_Usuario(rs.getString("Nombre_Usuario"));
                personal.setApellido_Usuario(rs.getString("Apellido_Usuario"));
                personal.setTelefono_Usuario(rs.getString("Telefono_Usuario"));
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
    public Asistencia getAsistenciaById(int id_entrenamiento) throws Exception {
        Asistencia personal = new Asistencia();
        try {
            this.Conectar();
            String Query;
            Query
                    = "SELECT entrenamientos.id_entrenamiento, entrenamientos.id_usuario,Nombre_usuario,Apellido_usuario,Ejercicio_1, Ejercicio_2, Ejercicio_3, Ejercicio_4, Ejercicio_5, "
                    + "Ejercicio_6, Ejercicio_7, Ejercicio_8, Ejercicio_9, Ejercicio_10,Ejercicio_11,Ejercicio_12,Ejercicio_13, "
                    + "Ejercicio_14, Ejercicio_15,Repeticion_1, Repeticion_2, Repeticion_3, Repeticion_4, Repeticion_5, "
                    + "Repeticion_6, Repeticion_7, Repeticion_8, Repeticion_9, Repeticion_10,Repeticion_11,Repeticion_12, Repeticion_13,  "
                    + "Repeticion_14, Repeticion_15,Tiempo_1, Tiempo_2, Tiempo_3, Tiempo_4, Tiempo_5,Tiempo_6, Tiempo_7,  "
                    + "Tiempo_8, Tiempo_9, Tiempo_10,Tiempo_11,Tiempo_12, Tiempo_13, Tiempo_14, Tiempo_15,Serie_1, Serie_2, Serie_3, "
                    + "Debe,Total_Deuda,Fecha_de_Entrenamiento "
                    + "FROM entrenamientos "
                    + "JOIN usuarios ON entrenamientos.id_usuario = usuarios.id_usuario "
                    + "JOIN detallesDebe ON entrenamientos.id_debe = detallesDebe.id_debe "
                    + "JOIN rutinas ON entrenamientos.id_Rutinas = rutinas.id_Rutinas "
                    + "JOIN series ON entrenamientos.id_Series = series.id_Series "
                    + "JOIN tiempos ON entrenamientos.id_Tiempos = tiempos.id_Tiempos "
                    + "JOIN Repeticiones ON entrenamientos.id_Repeticiones = Repeticiones.id_Repeticiones "
                    + "WHERE entrenamientos.id_entrenamiento = ? LIMIT 1;";

            PreparedStatement st = this.conexion.prepareStatement(Query);
            st.setInt(1, id_entrenamiento );
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                personal.setID_Entrenamiento(rs.getInt("ID_Entrenamiento"));
                personal.setID_Usuario(rs.getInt("ID_Usuario"));

                personal.setNombre_Usuario(rs.getString("Nombre_Usuario"));
                personal.setApellido_Usuario(rs.getString("Apellido_Usuario"));
                personal.setFecha_de_Entrenamiento(rs.getString("Fecha_de_Entrenamiento"));
                personal.setDebe(rs.getString("Debe"));
                personal.setTotal_Deuda(rs.getDouble("Total_Deuda"));

                personal.setSerie_1(rs.getString("Serie_1"));
                personal.setSerie_2(rs.getString("Serie_2"));
                personal.setSerie_3(rs.getString("Serie_3"));

                personal.setEjercicio_1(rs.getString("Ejercicio_1"));
                personal.setEjercicio_2(rs.getString("Ejercicio_2"));
                personal.setEjercicio_3(rs.getString("Ejercicio_3"));
                personal.setEjercicio_4(rs.getString("Ejercicio_4"));
                personal.setEjercicio_5(rs.getString("Ejercicio_5"));
                personal.setEjercicio_6(rs.getString("Ejercicio_6"));
                personal.setEjercicio_7(rs.getString("Ejercicio_7"));
                personal.setEjercicio_8(rs.getString("Ejercicio_8"));
                personal.setEjercicio_9(rs.getString("Ejercicio_9"));
                personal.setEjercicio_10(rs.getString("Ejercicio_10"));
                personal.setEjercicio_11(rs.getString("Ejercicio_11"));
                personal.setEjercicio_12(rs.getString("Ejercicio_12"));
                personal.setEjercicio_13(rs.getString("Ejercicio_13"));
                personal.setEjercicio_14(rs.getString("Ejercicio_14"));
                personal.setEjercicio_15(rs.getString("Ejercicio_15"));

                personal.setTiempo_1(rs.getString("Tiempo_1"));
                personal.setTiempo_2(rs.getString("Tiempo_2"));
                personal.setTiempo_3(rs.getString("Tiempo_3"));
                personal.setTiempo_4(rs.getString("Tiempo_4"));
                personal.setTiempo_5(rs.getString("Tiempo_5"));
                personal.setTiempo_6(rs.getString("Tiempo_6"));
                personal.setTiempo_7(rs.getString("Tiempo_7"));
                personal.setTiempo_8(rs.getString("Tiempo_8"));
                personal.setTiempo_9(rs.getString("Tiempo_9"));
                personal.setTiempo_10(rs.getString("Tiempo_10"));
                personal.setTiempo_11(rs.getString("Tiempo_11"));
                personal.setTiempo_12(rs.getString("Tiempo_12"));
                personal.setTiempo_13(rs.getString("Tiempo_13"));
                personal.setTiempo_14(rs.getString("Tiempo_14"));
                personal.setTiempo_15(rs.getString("Tiempo_15"));

                personal.setRepeticion_1(rs.getString("Repeticion_1"));
                personal.setRepeticion_2(rs.getString("Repeticion_2"));
                personal.setRepeticion_3(rs.getString("Repeticion_3"));
                personal.setRepeticion_4(rs.getString("Repeticion_4"));
                personal.setRepeticion_5(rs.getString("Repeticion_5"));
                personal.setRepeticion_6(rs.getString("Repeticion_6"));
                personal.setRepeticion_7(rs.getString("Repeticion_7"));
                personal.setRepeticion_8(rs.getString("Repeticion_8"));
                personal.setRepeticion_9(rs.getString("Repeticion_9"));
                personal.setRepeticion_10(rs.getString("Repeticion_10"));
                personal.setRepeticion_11(rs.getString("Repeticion_11"));
                personal.setRepeticion_12(rs.getString("Repeticion_12"));
                personal.setRepeticion_13(rs.getString("Repeticion_13"));
                personal.setRepeticion_14(rs.getString("Repeticion_14"));
                personal.setRepeticion_15(rs.getString("Repeticion_15"));

                System.out.println("ID: " + personal.getID_Entrenamiento()
                        + ",ID Usuario: " + personal.getID_Usuario()
                        + ", Nombre Usuario: " + personal.getNombre_Usuario() + " " + personal.getApellido_Usuario()
                        + ", Fecha de Entrenamiento: " + personal.getFecha_de_Entrenamiento()
                        + ", Debe: " + personal.getDebe() + ", Total Deuda: " + personal.getTotal_Deuda());
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

    @Override
    public List<Asistencia> Reportes() throws Exception {
        List<Asistencia> lista = null;
        try {
            this.Conectar();
            String Query;
            Query = "SELECT usuarios.ID_Usuario, SUM(CASE WHEN detallesDebe.debe <> 'Pago' THEN detallesDebe.Total_Deuda ELSE 0 END) as Total_Deuda, "
                    + "Nombre_Usuario, Apellido_Usuario, IMC_Usuario, Telefono_Usuario,Total_Deuda "
                    + "FROM usuarios "
                    + "JOIN informacion_fisica ON usuarios.ID_Usuario = informacion_fisica.ID_Usuario "
                    + "JOIN entrenamientos ON usuarios.id_usuario = entrenamientos.id_usuario "
                    + "JOIN detallesDebe ON entrenamientos.id_debe = detallesDebe.id_debe "
                    + "GROUP BY usuarios.ID_Usuario "
                    + "ORDER BY usuarios.ID_Usuario DESC; ";

            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Asistencia personal = new Asistencia();

                personal.setID_Usuario(rs.getInt("ID_Usuario"));
                personal.setNombre_Usuario(rs.getString("Nombre_Usuario"));
                personal.setApellido_Usuario(rs.getString("Apellido_Usuario"));
                personal.setIMC_Usuario(rs.getDouble("IMC_Usuario"));
                personal.setTelefono_Usuario(rs.getString("Telefono_Usuario"));
                personal.setTotal_Deuda(rs.getDouble("Total_Deuda"));

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
}
