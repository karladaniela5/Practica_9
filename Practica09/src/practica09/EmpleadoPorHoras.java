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
public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horas;

    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }

    public void setHoras(double horas){
	this.horas=horas;
    }
    public double getHoras(){
        return horas;
    }
    public EmpleadoPorHoras(String n, String a, String nss, double s, double h){
	super.setName(n);
	super.setSurname(a);
	super.setSecurityNum(nss);
	setSueldo(s);
        setHoras(h);
    }

    public double ingresos(){
	if (getHoras()<40){
            return (getSueldo()*getHoras());
	}else{
            return (40*getSueldo()+(getHoras()-40)*getSueldo()*1.5);
        }
    }
	
    public String toString(){
	return super.toString();
    }
}
