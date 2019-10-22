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
public class EmpleadoPorComision extends Empleado {
    private int ventasTotales;
    private double tasaComision;

    public EmpleadoPorComision(String n, String a, String nss, int vt, double tc){
	super.setName(n);
	super.setSurname(a);
	super.setSecurityNum(nss);
	setVentas(vt);
        setTasa(tc);
    }

    public void setVentas(int ventas){
	ventasTotales=ventas;
    }
    
    public int getVentas(){
	return ventasTotales;
    }

    public void setTasa(double tasa){
	tasaComision=tasa;
    }
    
    public double getTasa(){
	return tasaComision;
    }

    public double ingresos(){
	return getTasa()*getVentas();
    }

    public String toString(){
	return super.toString();
    }

}
