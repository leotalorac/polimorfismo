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
public class Programador extends Empleado{

    public Programador(String name) {
        super(name);
    }
    
    @Override
    public double calcularSalario(){
        return 6000000;
    }
    @Override
    public String getProfecion(){
        return "Programador";
    }
}
