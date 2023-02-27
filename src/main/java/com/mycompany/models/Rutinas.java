package com.mycompany.models;

/**
 *
 * @author Julian
 */
public class Rutinas {

    private int id_ejercicio;
    private String Nombre_Ejercicio;
    private String Tipo_de_Ejercicio;
    private String Nivel_del_Ejercicio;
    private String Descripcion_ejercicio;
    private String Fecha_de_Entrenamiento;
    private String Repeticiones;
    private String Tiempo;
    private String Series;
    private byte[] Imagen_Ejercicio;
    private String Imagen_Texto;

    public void setImagen_Texto(String Imagen_Texto) {
        this.Imagen_Texto = Imagen_Texto;
    }

    public String getImagen_Texto() {
        return Imagen_Texto;
    }

    public void setImagen_Ejercicio(byte[] Imagen_Ejercicio) {
        this.Imagen_Ejercicio = Imagen_Ejercicio;
    }

    public byte[] getImagen_Ejercicio() {
        return Imagen_Ejercicio;
    }

    public void setId_ejercicio(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public void setDescripcion_ejercicio(String Descripcion_ejercicio) {
        this.Descripcion_ejercicio = Descripcion_ejercicio;
    }
    

    public int getId_ejercicio() {
        return id_ejercicio;
    }

    public String getDescripcion_ejercicio() {
        return Descripcion_ejercicio;
    }

    public void setRepeticiones(String Repeticiones) {
        this.Repeticiones = Repeticiones;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setSeries(String Series) {
        this.Series = Series;
    }

    public String getRepeticiones() {
        return Repeticiones;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public String getSeries() {
        return Series;
    }

    public void setFecha_de_Entrenamiento(String Fecha_de_Entrenamiento) {
        this.Fecha_de_Entrenamiento = Fecha_de_Entrenamiento;
    }

    public String getFecha_de_Entrenamiento() {
        return Fecha_de_Entrenamiento;
    }

    public void setID_Rutina(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public void setNombre_Ejercicio(String Nombre_Ejercicio) {
        this.Nombre_Ejercicio = Nombre_Ejercicio;
    }

    public void setTipo_de_Ejercicio(String Tipo_de_Ejercicio) {
        this.Tipo_de_Ejercicio = Tipo_de_Ejercicio;
    }

    public void setNivel_del_Ejercicio(String Nivel_del_Ejercicio) {
        this.Nivel_del_Ejercicio = Nivel_del_Ejercicio;
    }

    public int getID_Rutina() {
        return id_ejercicio;
    }

    public String getNombre_Ejercicio() {
        return Nombre_Ejercicio;
    }

    public String getTipo_de_Ejercicio() {
        return Tipo_de_Ejercicio;
    }

    public String getNivel_del_Ejercicio() {
        return Nivel_del_Ejercicio;
    }

}
