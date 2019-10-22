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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    
    

    public EmpleadoBaseMasComision(String n, String a, String nss, int vt, double tc, double sb){
        super(n, a, nss, vt, tc);
        setSalarioBase(sb);
    }

    public void setSalarioBase(double salario){
	salarioBase=salario;
    }
	
    public double getSalarioBase(){
		return salarioBase;
	}

	public double ingresos(){
		return getSalarioBase()+super.ingresos();
}

	public String toString(){
		return super.toString();
	}

}
