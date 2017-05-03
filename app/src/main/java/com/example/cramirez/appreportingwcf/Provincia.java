package com.example.cramirez.appreportingwcf;

/**
 * Created by cramirez on 26/04/2017.
 */

public class Provincia {

    private String codigoCorreos;
    private String nombre;
    private String id;
    private String ref;

    public Provincia() {
    }

    public Provincia(String codigoCorreos, String nombre, String id, String ref) {
        this.codigoCorreos = codigoCorreos;
        this.nombre = nombre;
        this.id = id;
        this.ref = ref;
    }

    public String getCodigoCorreos() {
        return codigoCorreos;
    }

    public void setCodigoCorreos(String codigoCorreos) {
        this.codigoCorreos = codigoCorreos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
