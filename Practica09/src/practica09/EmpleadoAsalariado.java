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
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    public EmpleadoAsalariado (String name, String surname, String num, double salario){
        super.setName(name);
        super.setSurname(surname);
        super.setSecurityNum(num);
        setSalarioSemanal(salario);
    }
    
    public void setSalarioSemanal (double salario){
        salarioSemanal = salario;
    }
    
    public double getSalario (){
        return salarioSemanal;
    }
    
    public double ingresos (){
        return getSalario();
    }
    
    public String toString(){
        return super.toString();
    }
}
