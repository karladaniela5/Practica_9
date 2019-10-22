/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09;

/**
 *
 * @author poo02alu15
 */
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String numeroSeguridad;
    
    public void setName(String name){
        nombre=name;
    }
    
    public void setSurname(String surname){
        apellido=surname;
    }
    
    public void setSecurityNum(String num){
        numeroSeguridad=num;
    }
    
    public String getName(){
        return nombre;
    }
    
    public String getSurname(){
        return apellido;
    }
    
    public String getSecurityNum (){
        return numeroSeguridad;
    }
    
    public String toString (){
        return "Nombre: "+getName()+"\nAppellido: "+getSurname()+"\nNúmero de seguridad: "+getSecurityNum();
    }
    
    public abstract double ingresos();

}
