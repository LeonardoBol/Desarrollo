/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

/**
 * * @author Leonardo
 */
public class Empleado extends Persona {
    private String cargo;
    private boolean estado;
    private Timestamp fecha_ingreso;
    private int salario;
  
    
    public Empleado()
{
}
    //------------------------------ SET EMPLEADO ------------------------------
   
    
    
    public void setCargo (String cargo)
    {
        this.cargo = cargo;
    }
    
    public void setEstado (boolean estado)
    {
        this.estado = estado;
    }
    
    public void setFechaIngreso(Timestamp timestamp)
    {
        this.fecha_ingreso = timestamp;
    }
    
    public void setSalario(int salario)
    {
        this.salario = salario;
    }
    //-----------------------------GET EMPLEADO---------------------------------
    
    
    
    public String getCargo()
    {
        return cargo;
    }
    
    public boolean getEstado()
    {
        return estado;
    }
    
    public Timestamp getIngreso()
    {
        return fecha_ingreso;
    }

    public int getSalario() {
        return salario;
    }
}
