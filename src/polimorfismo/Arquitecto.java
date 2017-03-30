/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class Arquitecto extends Empleado {

    public Arquitecto(String name) {
        super(name);
    }
    
    @Override
    public double calcularSalario(){
        return 3500000;
    }
    @Override
    public String getProfecion(){
        return "Arquitecto";
    }
    
}
