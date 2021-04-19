/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesorObjetos;


public class Profesor {
    String ID, tipoEmpleado,Nombre,Profesion,numHorasTrabajadas,valorHora,Salario;

    public Profesor(String ID, String tipoEmpleado, String Nombre, String Profesion, String numHorasTrabajadas, String valorHora, String Salario) {
        this.ID = ID;
        this.tipoEmpleado = tipoEmpleado;
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.numHorasTrabajadas = numHorasTrabajadas;
        this.valorHora = valorHora;
        this.Salario = Salario;
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }

    public void setNumHorasTrabajadas(String numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public String getValorHora() {
        return valorHora;
    }

    public void setValorHora(String valorHora) {
        this.valorHora = valorHora;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }
    
    
    
    
    
}
