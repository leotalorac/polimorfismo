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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado p = new Programador("Erenesto");
        System.out.println("el empleado: " + p.getName() + " gana " + p.calcularSalario());
        Empleado a = new Arquitecto("Ariadna");
        System.out.println("el empleado: " + a.getName() + " gana " + a.calcularSalario());
    }
    
}
