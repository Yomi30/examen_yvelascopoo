/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author YV
 */
public class Cliente extends Persona{
     private String telefonodeContacto;

    public Cliente() {
    }
    
    public Cliente(String telefonodeContacto, String Ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String correo, int edad) {
        super(Ci, nombre1, nombre2, apellido1, apellido2, direccion, correo, edad);
        this.telefonodeContacto = telefonodeContacto;
    }

    public void setTelefonodeContacto(String telefonoContacto) {
        this.telefonodeContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonodeContacto;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                + "Telefono de contacto del cliente: "+getTelefonoContacto();
    }
  

}
