/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrousuario2;

/**
 *
 * @author m1gue
 */
public class Usuario {
    private String nombre;
    private String edad;
    private String correo;
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String toString(){
        String contenido="Nombre:   "+getNombre()+"\n"+
                         "Edad:     "+getEdad()+"\n"+
                         "Correo:   "+getCorreo()+"\n"+
                         "Telefono: "+getTelefono()+"\n"+
                         "Carrera:  "+getCarrera()+"\n";
        return contenido;
    }
    
}
